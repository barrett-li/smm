package com.example.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu Feb 16 19:17:01 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Thu Feb 16 19:17:01 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.contact_info
     *
     * @mbg.generated Thu Feb 16 19:17:01 CST 2017
     */
    private String contactInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu Feb 16 19:17:01 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu Feb 16 19:17:01 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Thu Feb 16 19:17:01 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Thu Feb 16 19:17:01 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.contact_info
     *
     * @return the value of user.contact_info
     *
     * @mbg.generated Thu Feb 16 19:17:01 CST 2017
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.contact_info
     *
     * @param contactInfo the value for user.contact_info
     *
     * @mbg.generated Thu Feb 16 19:17:01 CST 2017
     */
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}