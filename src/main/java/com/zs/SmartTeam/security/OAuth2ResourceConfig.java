package com.zs.SmartTeam.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableResourceServer
@Profile("JWTAuthCore")
public class OAuth2ResourceConfig extends ResourceServerConfigurerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(OAuth2ResourceConfig.class);

    @Value("${singingKey}")
    private String singingKry;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(
                        "/**/*.jpg", "/**/*.jpeg", "/**/*.png", "/**/*.html", "/**/*.css", "/**/*.js", "/**/*.ttf",
                        "/**/*.woff*", "/**/*.ico", "/assets/**", "/noauth/**", "/users/status", "/users/answer",
                        "/users/reset", "/users/password-strategy", "/users/change/password", "/users/forget/password/*",
                        "/reference/question/data", "/users/reset/password", "/saml/**","/swagger/**","/actuator/**")
                .permitAll().anyRequest().authenticated();
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer config) {
        config.tokenStore(tokenStoreResource());
    }

    @Bean
    public TokenStore tokenStoreResource() {
        return new JwtTokenStore(accessTokenConverterResource());
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverterResource() {
        logger.info("singingKey: {}", singingKry);
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setVerifierKey(singingKry);
        converter.setSigningKey(singingKry);
        return converter;
    }
}
