package com.zs.SmartTeam.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RequirementManagementModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requirement-management.requirement_id
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    private Long requirementId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requirement-management.requirement_content
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    private String requirementContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requirement-management.requirement_author
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    private Long requirementAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requirement-management.create_date
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requirement-management.update_date
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column requirement-management.requirement_title
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    private String requirementTitle;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requirement-management.requirement_id
     *
     * @return the value of requirement-management.requirement_id
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public Long getRequirementId() {
        return requirementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requirement-management.requirement_id
     *
     * @param requirementId the value for requirement-management.requirement_id
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public void setRequirementId(Long requirementId) {
        this.requirementId = requirementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requirement-management.requirement_content
     *
     * @return the value of requirement-management.requirement_content
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public String getRequirementContent() {
        return requirementContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requirement-management.requirement_content
     *
     * @param requirementContent the value for requirement-management.requirement_content
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public void setRequirementContent(String requirementContent) {
        this.requirementContent = requirementContent == null ? null : requirementContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requirement-management.requirement_author
     *
     * @return the value of requirement-management.requirement_author
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public Long getRequirementAuthor() {
        return requirementAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requirement-management.requirement_author
     *
     * @param requirementAuthor the value for requirement-management.requirement_author
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public void setRequirementAuthor(Long requirementAuthor) {
        this.requirementAuthor = requirementAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requirement-management.create_date
     *
     * @return the value of requirement-management.create_date
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requirement-management.create_date
     *
     * @param createDate the value for requirement-management.create_date
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requirement-management.update_date
     *
     * @return the value of requirement-management.update_date
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requirement-management.update_date
     *
     * @param updateDate the value for requirement-management.update_date
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column requirement-management.requirement_title
     *
     * @return the value of requirement-management.requirement_title
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public String getRequirementTitle() {
        return requirementTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column requirement-management.requirement_title
     *
     * @param requirementTitle the value for requirement-management.requirement_title
     *
     * @mbggenerated Fri May 10 04:58:38 CST 2019
     */
    public void setRequirementTitle(String requirementTitle) {
        this.requirementTitle = requirementTitle == null ? null : requirementTitle.trim();
    }
}
