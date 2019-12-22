package com.zs.SmartTeam.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public String encode(CharSequence charSequence) {
        return this.passwordEncoder().encode(charSequence);
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return this.passwordEncoder().matches(charSequence, s);
    }
}
