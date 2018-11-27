package com.sunfong.plf.dob.entity.privilege;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table PLF_MENU
 *
 * @mbg.generated do_not_delete_during_merge 2018-11-15 15:22:02
 */
public class PlfMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.MENU_CODE
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private String menuCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.MENU_NAME
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private String menuName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.URL
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.MOUDLE_ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private String moudleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.MENU_LEVEL
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private Integer menuLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.IS_LEAF
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private String isLeaf;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.PARENT_ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.ORDER_IDX
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private Integer orderIdx;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.MOUDLE_DISPLAY_IDX
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private Integer moudleDisplayIdx;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PLF_MENU.PAGE_ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private String pageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PLF_MENU
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.ID
     *
     * @return the value of PLF_MENU.ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.ID
     *
     * @param id the value for PLF_MENU.ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.MENU_CODE
     *
     * @return the value of PLF_MENU.MENU_CODE
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.MENU_CODE
     *
     * @param menuCode the value for PLF_MENU.MENU_CODE
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.MENU_NAME
     *
     * @return the value of PLF_MENU.MENU_NAME
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.MENU_NAME
     *
     * @param menuName the value for PLF_MENU.MENU_NAME
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.URL
     *
     * @return the value of PLF_MENU.URL
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.URL
     *
     * @param url the value for PLF_MENU.URL
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.MOUDLE_ID
     *
     * @return the value of PLF_MENU.MOUDLE_ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public String getMoudleId() {
        return moudleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.MOUDLE_ID
     *
     * @param moudleId the value for PLF_MENU.MOUDLE_ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setMoudleId(String moudleId) {
        this.moudleId = moudleId == null ? null : moudleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.MENU_LEVEL
     *
     * @return the value of PLF_MENU.MENU_LEVEL
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public Integer getMenuLevel() {
        return menuLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.MENU_LEVEL
     *
     * @param menuLevel the value for PLF_MENU.MENU_LEVEL
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.IS_LEAF
     *
     * @return the value of PLF_MENU.IS_LEAF
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public String getIsLeaf() {
        return isLeaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.IS_LEAF
     *
     * @param isLeaf the value for PLF_MENU.IS_LEAF
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf == null ? null : isLeaf.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.PARENT_ID
     *
     * @return the value of PLF_MENU.PARENT_ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.PARENT_ID
     *
     * @param parentId the value for PLF_MENU.PARENT_ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.ORDER_IDX
     *
     * @return the value of PLF_MENU.ORDER_IDX
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public Integer getOrderIdx() {
        return orderIdx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.ORDER_IDX
     *
     * @param orderIdx the value for PLF_MENU.ORDER_IDX
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setOrderIdx(Integer orderIdx) {
        this.orderIdx = orderIdx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.MOUDLE_DISPLAY_IDX
     *
     * @return the value of PLF_MENU.MOUDLE_DISPLAY_IDX
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public Integer getMoudleDisplayIdx() {
        return moudleDisplayIdx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.MOUDLE_DISPLAY_IDX
     *
     * @param moudleDisplayIdx the value for PLF_MENU.MOUDLE_DISPLAY_IDX
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setMoudleDisplayIdx(Integer moudleDisplayIdx) {
        this.moudleDisplayIdx = moudleDisplayIdx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PLF_MENU.PAGE_ID
     *
     * @return the value of PLF_MENU.PAGE_ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PLF_MENU.PAGE_ID
     *
     * @param pageId the value for PLF_MENU.PAGE_ID
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    public void setPageId(String pageId) {
        this.pageId = pageId == null ? null : pageId.trim();
    }
}