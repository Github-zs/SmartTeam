package com.zs.SmartTeam.security;

import com.zs.SmartTeam.model.UserModel;
import com.zs.SmartTeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class OAuth2AuthenticationProvider implements AuthenticationProvider {

    @Autowired
    UserService service;

    @Autowired
    PermissionService permissionService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        if (SecurityContextHolder.getContext().getAuthentication() != null) {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            if (auth.getAuthorities() != null && !auth.getAuthorities().isEmpty()) {
                SecurityContextHolder.getContext().setAuthentication(null);
            }
        }
        UserModel model = new UserModel();
        List<AuthorityModel> authorityList = new ArrayList<>();

        UserModel user = service.selectByLogin(username);
        if (user == null) {
            throw new BadCredentialsException("user not exit");
        }
        if (!MyPasswordEncoder.passwordEncoder().matches(password, user.getLoginPassword())) {
            throw new BadCredentialsException("password is error");
        }

        // set user role
        Optional.ofNullable(user.getRoles()).orElse(new ArrayList<>())
                .stream().forEach(role -> {
            AuthorityModel hrId = new AuthorityModel();
            hrId.setPermissionName(role.getName());
            hrId.setPermissionId("role");
            authorityList.add(hrId);
        });

        // set user permission
        Optional.ofNullable(permissionService.selectByUsername(username))
                .orElse(new ArrayList<>()).stream()
                .forEach(item -> {
                    AuthorityModel authTemp = new AuthorityModel();
                    authTemp.setPermissionId("permission");
                    authTemp.setPermissionName(item.getName());
                    authorityList.add(authTemp);
                });

        // set user id
        AuthorityModel userId = new AuthorityModel();
        userId.setPermissionId("USER_ID");
        if (user.getId() != null) {
            userId.setPermissionName(user.getId().toString());
        }
        authorityList.add(userId);

        // set user name
        AuthorityModel userName = new AuthorityModel();
        userName.setPermissionId("USER_NAME");
        if (user.getUsername() != null) {
            userName.setPermissionName(user.getUsername());
        }
        authorityList.add(userName);

        return new UsernamePasswordAuthenticationToken(user, password, authorityList);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }


}
