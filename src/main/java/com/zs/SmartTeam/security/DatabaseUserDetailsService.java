package com.zs.SmartTeam.security;

import com.zs.SmartTeam.model.UserModel;
import com.zs.SmartTeam.service.UserRoleHrefService;
import com.zs.SmartTeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DatabaseUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService service;

    @Autowired
    private UserRoleHrefService userRoleHrefService;

    @Override
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
        UserModel userModel = service.selectByLoginName(loginName);

        if (userModel == null) {
            throw new UsernameNotFoundException("user name:" + loginName + "not found!");
        }

        List<String> roleCodeList = userRoleHrefService.selectRoleByLoginName(loginName);

        List<GrantedAuthority> authorities = roleCodeList.stream().map(e -> new SimpleGrantedAuthority(e))
                .collect(Collectors.toList());
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                userModel.getLoginName(),userModel.getLoginPassword(),authorities);

        return userDetails;
    }
}
