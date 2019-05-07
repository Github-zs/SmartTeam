package com.zs.SmartTeam.model;

import org.springframework.stereotype.Component;

@Component
public class UserRoleModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.id
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.role_code
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    private String roleCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.parent_role_code
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    private String parentRoleCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.role_desc
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    private String roleDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.id
     *
     * @return the value of user_role.id
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.id
     *
     * @param id the value for user_role.id
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.role_code
     *
     * @return the value of user_role.role_code
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.role_code
     *
     * @param roleCode the value for user_role.role_code
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.parent_role_code
     *
     * @return the value of user_role.parent_role_code
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    public String getParentRoleCode() {
        return parentRoleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.parent_role_code
     *
     * @param parentRoleCode the value for user_role.parent_role_code
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    public void setParentRoleCode(String parentRoleCode) {
        this.parentRoleCode = parentRoleCode == null ? null : parentRoleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.role_desc
     *
     * @return the value of user_role.role_desc
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.role_desc
     *
     * @param roleDesc the value for user_role.role_desc
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }
}
