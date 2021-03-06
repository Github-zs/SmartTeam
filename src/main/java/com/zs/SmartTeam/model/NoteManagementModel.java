package com.zs.SmartTeam.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class NoteManagementModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_management.note_id
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    private Long noteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_management.note_content
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    private String noteContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_management.note_author
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    private Long noteAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_management.create_date
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_management.update_date
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note_management.note_title
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    private String noteTitle;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_management.note_id
     *
     * @return the value of note_management.note_id
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public Long getNoteId() {
        return noteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_management.note_id
     *
     * @param noteId the value for note_management.note_id
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_management.note_content
     *
     * @return the value of note_management.note_content
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public String getNoteContent() {
        return noteContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_management.note_content
     *
     * @param noteContent the value for note_management.note_content
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent == null ? null : noteContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_management.note_author
     *
     * @return the value of note_management.note_author
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public Long getNoteAuthor() {
        return noteAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_management.note_author
     *
     * @param noteAuthor the value for note_management.note_author
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public void setNoteAuthor(Long noteAuthor) {
        this.noteAuthor = noteAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_management.create_date
     *
     * @return the value of note_management.create_date
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_management.create_date
     *
     * @param createDate the value for note_management.create_date
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_management.update_date
     *
     * @return the value of note_management.update_date
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_management.update_date
     *
     * @param updateDate the value for note_management.update_date
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note_management.note_title
     *
     * @return the value of note_management.note_title
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public String getNoteTitle() {
        return noteTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note_management.note_title
     *
     * @param noteTitle the value for note_management.note_title
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle == null ? null : noteTitle.trim();
    }
}
