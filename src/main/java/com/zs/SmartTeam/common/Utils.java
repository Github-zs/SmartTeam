package com.zs.SmartTeam.common;

import com.zs.SmartTeam.model.UserModel;
import com.zs.SmartTeam.service.UserService;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class Utils {

    @Autowired
    private UserService userService;

    public Long returnLoginUserId(HttpServletRequest request) {
        String token = request.getHeader("Authorization");

        UserModel createModel = null;

        if (token != null) {
            // parse the token.
            String user = Jwts.parser()
                    .setSigningKey("mySecret")
                    .parseClaimsJws(token.replace("Bearer ", ""))
                    .getBody()
                    .getSubject();

            createModel = userService.selectByLoginName(user);
        }
        return createModel.getUserId();
    }
}
