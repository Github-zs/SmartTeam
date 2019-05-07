package com.zs.SmartTeam.service;

import java.util.List;

public interface UserRoleHrefService {
    List<String> selectRoleByLoginName(String userLoginName);
}
