package com.zs.SmartTeam.security.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

//    @Autowired
//    private JwtTokenProvider tokenProvider;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response
            , Authentication authentication) throws IOException {
        logger.info("User: " + authentication.getName() + " Login successfully.");
//        this.returnJson(response,authentication);
    }

//    private void returnJson(HttpServletResponse response, Authentication authentication) throws IOException {
//        response.setStatus(HttpServletResponse.SC_OK);
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json");
//        response.getWriter()
//                .println("{\"tokenType\":\"Bearer\",\"token\": \"" + tokenProvider.createJwtToken(authentication) + "\"}");
//    }

}
