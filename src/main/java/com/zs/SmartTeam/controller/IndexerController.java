package com.zs.SmartTeam.controller;


import com.zs.SmartTeam.security.AuthService;
import com.zs.SmartTeam.security.provider.JwtAuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexerController {

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "/auth/token", method = RequestMethod.GET)
    public ResponseEntity<?> createAuthenticationToken(String username, String password) throws AuthenticationException {
        final String token = authService.login(username, password);
            // Return the token
            return ResponseEntity.ok(new JwtAuthenticationResponse(token));
    }

}
