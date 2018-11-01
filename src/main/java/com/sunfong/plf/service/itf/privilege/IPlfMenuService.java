package com.sunfong.plf.service.itf.privilege;


import java.util.List;

/**
 * @author wfr14
 */
public interface IPlfMenuService {

    /**
     *
     * @param roleId 输入role获得可以操作的菜单列表
     * @return
     */
    List getMenuByRoleId(String roleId);
}
