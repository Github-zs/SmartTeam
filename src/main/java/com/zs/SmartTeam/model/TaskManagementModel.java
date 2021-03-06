package com.zs.SmartTeam.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TaskManagementModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_management.task_id
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    private Long taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_management.task_title
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    private String taskTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_management.task_source
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    private String taskSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_management.task_description
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    private String taskDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_management.task_status
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    private String taskStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_management.task_reporter
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    private Long taskReporter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_management.task_executor
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    private Long taskExecutor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_management.create_date
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_management.update_date
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_management.task_id
     *
     * @return the value of task_management.task_id
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_management.task_id
     *
     * @param taskId the value for task_management.task_id
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_management.task_title
     *
     * @return the value of task_management.task_title
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public String getTaskTitle() {
        return taskTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_management.task_title
     *
     * @param taskTitle the value for task_management.task_title
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle == null ? null : taskTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_management.task_source
     *
     * @return the value of task_management.task_source
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public String getTaskSource() {
        return taskSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_management.task_source
     *
     * @param taskSource the value for task_management.task_source
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public void setTaskSource(String taskSource) {
        this.taskSource = taskSource == null ? null : taskSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_management.task_description
     *
     * @return the value of task_management.task_description
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_management.task_description
     *
     * @param taskDescription the value for task_management.task_description
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription == null ? null : taskDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_management.task_status
     *
     * @return the value of task_management.task_status
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_management.task_status
     *
     * @param taskStatus the value for task_management.task_status
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_management.task_reporter
     *
     * @return the value of task_management.task_reporter
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public Long getTaskReporter() {
        return taskReporter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_management.task_reporter
     *
     * @param taskReporter the value for task_management.task_reporter
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public void setTaskReporter(Long taskReporter) {
        this.taskReporter = taskReporter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_management.task_executor
     *
     * @return the value of task_management.task_executor
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public Long getTaskExecutor() {
        return taskExecutor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_management.task_executor
     *
     * @param taskExecutor the value for task_management.task_executor
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public void setTaskExecutor(Long taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_management.create_date
     *
     * @return the value of task_management.create_date
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_management.create_date
     *
     * @param createDate the value for task_management.create_date
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_management.update_date
     *
     * @return the value of task_management.update_date
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_management.update_date
     *
     * @param updateDate the value for task_management.update_date
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
