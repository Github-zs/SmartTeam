package com.zs.SmartTeam.controller;


import com.zs.SmartTeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class IndexerController {

    @Autowired
    private UserService service;

    @RequestMapping(value = { "/user" }, method = RequestMethod.GET)
    public Principal user(Principal user) {
        return user;
    }


//    @RequestMapping(value = "/auth/token", method = RequestMethod.GET)
//    public ResponseEntity<?> createAuthenticationToken(
//            @RequestBody JwtAuthenticationRequest authenticationRequest) throws AuthenticationException{
//        final String token = authService.login(authenticationRequest.getUsername(), authenticationRequest.getPassword());
//
//        // Return the token
//        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
//    }

//    @RequestMapping(value = "/auth/token", method = RequestMethod.GET)
//    public ResponseEntity<?> createAuthenticationToken(String username, String password) throws AuthenticationException{
//        final String token = authService.login(username, password);
//
//        // Return the token
//        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
//    }

}
