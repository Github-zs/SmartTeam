package com.zs.SmartTeam.model;

import org.springframework.stereotype.Component;

@Component
public class UserRoleHrefModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_href.id
     *
     * @mbggenerated Tue May 07 09:17:11 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_href.user_login_name
     *
     * @mbggenerated Tue May 07 09:17:11 CST 2019
     */
    private String userLoginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role_href.role_code
     *
     * @mbggenerated Tue May 07 09:17:11 CST 2019
     */
    private String roleCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_href.id
     *
     * @return the value of user_role_href.id
     *
     * @mbggenerated Tue May 07 09:17:11 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_href.id
     *
     * @param id the value for user_role_href.id
     *
     * @mbggenerated Tue May 07 09:17:11 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_href.user_login_name
     *
     * @return the value of user_role_href.user_login_name
     *
     * @mbggenerated Tue May 07 09:17:11 CST 2019
     */
    public String getUserLoginName() {
        return userLoginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_href.user_login_name
     *
     * @param userLoginName the value for user_role_href.user_login_name
     *
     * @mbggenerated Tue May 07 09:17:11 CST 2019
     */
    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role_href.role_code
     *
     * @return the value of user_role_href.role_code
     *
     * @mbggenerated Tue May 07 09:17:11 CST 2019
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role_href.role_code
     *
     * @param roleCode the value for user_role_href.role_code
     *
     * @mbggenerated Tue May 07 09:17:11 CST 2019
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }
}