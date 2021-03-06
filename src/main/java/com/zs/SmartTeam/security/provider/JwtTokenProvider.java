package com.zs.SmartTeam.security.provider;

import com.zs.SmartTeam.security.AuthParameters;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenProvider {

    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";

    Logger logger = LoggerFactory.getLogger(JwtTokenProvider.class);

    @Autowired
    private AuthParameters authParameters;

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    /**

     * Generate token for user login.

     *

     * @param authentication

     * @return return a token string.

     */

    public String createJwtToken(Authentication authentication) {

        //user name
        String username = ((org.springframework.security.core.userdetails.User) authentication.getPrincipal()).getUsername();

        //expire time
        Date expireTime =new Date(System.currentTimeMillis() + authParameters.getExpirationDate());

        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, username);

        //create token
        String token =
            Jwts.builder()
                .setClaims(claims)
                .setExpiration(expireTime)
                .signWith(SignatureAlgorithm.HS512, authParameters.getSecret())
                .compact();

        return token;

    }

    public String getUsernameFromToken(String token) {
        String username;
        try {
            final Claims claims = getClaimsFromToken(token);
            username = claims.getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    public Date getCreatedDateFromToken(String token) {
        Date created;
        try {
            final Claims claims = getClaimsFromToken(token);
            created = new Date((Long) claims.get(CLAIM_KEY_CREATED));
        } catch (Exception e) {
            created = null;
        }
        return created;
    }

    public Date getExpirationDateFromToken(String token) {
        Date expiration;
        try {
            final Claims claims = getClaimsFromToken(token);
            expiration = claims.getExpiration();
        } catch (Exception e) {
            expiration = null;
        }
        return expiration;
    }


    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    private Boolean isCreatedBeforeLastPasswordReset(Date created, Date lastPasswordReset) {
        return (lastPasswordReset != null && created.before(lastPasswordReset));
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = getUsernameFromToken(token);
        final Date created = getCreatedDateFromToken(token);
        //final Date expiration = getExpirationDateFromToken(token);
        return (
                username.equals(userDetails.getUsername())
                        && !isTokenExpired(token));
    }

    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + authParameters.getExpirationDate() * 1000);
    }

    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }

    String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public Claims getClaimsFromToken(String token) {
        Claims claims;
        try {
            claims = Jwts.parser()
                    .setSigningKey(authParameters.getSecret())
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            claims = null;
        }
        return claims;
    }

    /**

     * validate token eligible.

     * if Jwts can parse the token string and no throw any exception, then the token is eligible.

     * @param token a jws string.

     */

    public boolean validateToken(String token) {

        String VALIDATE_FAILED ="validate failed : ";

        try {
            Jwts.parser()
                    .setSigningKey(authParameters.getSecret())
                    .parseClaimsJws(token);

            return true;

        }catch (Exception ex) {

            //ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SignatureException, //IllegalArgumentException

            logger.error(VALIDATE_FAILED + ex.getMessage());

            return false;

        }

    }


}
