package com.sunfong.plf.mapper.privilege;

import com.sunfong.plf.dob.entity.privilege.PlfMenu;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "plfMenuMapper")
public interface PlfMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PLF_MENU
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PLF_MENU
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    int insert(PlfMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PLF_MENU
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    int insertSelective(PlfMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PLF_MENU
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    PlfMenu selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PLF_MENU
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    int updateByPrimaryKeySelective(PlfMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PLF_MENU
     *
     * @mbg.generated 2018-11-15 15:22:02
     */
    int updateByPrimaryKey(PlfMenu record);

    List selectByRoleId(String roleID);
}