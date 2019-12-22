package com.zs.SmartTeam.security;

import com.zs.SmartTeam.model.UserModel;
import com.zs.SmartTeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

public class CustomUserService implements UserDetailsService {


    @Autowired
    UserService service;

    @Override
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {


        UserModel user = service.selectByLoginName(loginName);

        if (user == null) {
//      throw new UsernameNotFoundException("username : " + loginName + "not found!");
            throw new BadCredentialsException("Wrong username or password");
        }
        List<GrantedAuthority> authorities =
                user.getRoles()
                        .stream()
                        .map(item -> new SimpleGrantedAuthority(item.getName()))
                        .collect(Collectors.toList());
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getLoginName(),
                user.getLoginPassword(), authorities);
        return userDetails;
    }
}
