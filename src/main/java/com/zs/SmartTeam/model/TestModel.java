package com.zs.SmartTeam.model;

import org.springframework.stereotype.Component;

@Component
public class TestModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.test_id
     *
     * @mbggenerated Sun Apr 21 02:31:44 CST 2019
     */
    private Long testId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.test_name
     *
     * @mbggenerated Sun Apr 21 02:31:44 CST 2019
     */
    private String testName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.test_id
     *
     * @return the value of test.test_id
     *
     * @mbggenerated Sun Apr 21 02:31:44 CST 2019
     */
    public Long getTestId() {
        return testId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.test_id
     *
     * @param testId the value for test.test_id
     *
     * @mbggenerated Sun Apr 21 02:31:44 CST 2019
     */
    public void setTestId(Long testId) {
        this.testId = testId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column test.test_name
     *
     * @return the value of test.test_name
     *
     * @mbggenerated Sun Apr 21 02:31:44 CST 2019
     */
    public String getTestName() {
        return testName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column test.test_name
     *
     * @param testName the value for test.test_name
     *
     * @mbggenerated Sun Apr 21 02:31:44 CST 2019
     */
    public void setTestName(String testName) {
        this.testName = testName == null ? null : testName.trim();
    }
}