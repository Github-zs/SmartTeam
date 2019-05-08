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
        Date expireTime =new Date(System.currentTimeMillis() + authParameters.getExpirationDate() * 1000);

        Map<String, Object> claims = new HashMap<>();
        claims.put("username", username);

        //create token
        String token =
            Jwts.builder()
                .setClaims(claims)
                .setExpiration(expireTime)
                .signWith(SignatureAlgorithm.HS512, authParameters.getSecret())
                .compact();

        return token;

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
