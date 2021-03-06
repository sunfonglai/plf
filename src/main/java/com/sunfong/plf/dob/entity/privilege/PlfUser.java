package com.sunfong.plf.dob.entity.privilege;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table PLF_USER
 *
 * @mbg.generated do_not_delete_during_merge 2018-10-29 17:36:57
 */
public class PlfUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_USER.ID
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_USER.USER_CODE
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    private String userCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_USER.USER_NAME
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_USER.USER_PSW
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    private String userPsw;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_USER.TELEPHONE
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_USER.EMAIL
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PLF_USER
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_USER.ID
     *
     * @return the value of PLF_USER.ID
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_USER.ID
     *
     * @param id the value for PLF_USER.ID
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_USER.USER_CODE
     *
     * @return the value of PLF_USER.USER_CODE
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_USER.USER_CODE
     *
     * @param userCode the value for PLF_USER.USER_CODE
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_USER.USER_NAME
     *
     * @return the value of PLF_USER.USER_NAME
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_USER.USER_NAME
     *
     * @param userName the value for PLF_USER.USER_NAME
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_USER.USER_PSW
     *
     * @return the value of PLF_USER.USER_PSW
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public String getUserPsw() {
        return userPsw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_USER.USER_PSW
     *
     * @param userPsw the value for PLF_USER.USER_PSW
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw == null ? null : userPsw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_USER.TELEPHONE
     *
     * @return the value of PLF_USER.TELEPHONE
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_USER.TELEPHONE
     *
     * @param telephone the value for PLF_USER.TELEPHONE
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_USER.EMAIL
     *
     * @return the value of PLF_USER.EMAIL
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_USER.EMAIL
     *
     * @param email the value for PLF_USER.EMAIL
     *
     * @mbg.generated 2018-10-29 17:36:57
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}