package com.sunfong.plf.service.impl;

import com.sunfong.plf.mapper.PlfMenuMapper;
import com.sunfong.plf.service.itf.IPlfMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author wfr14
 */
@Service
public class PlfMenuServiceImpl implements IPlfMenuService {

    @Autowired
    PlfMenuMapper plfMenuMapper;

    @Override
    public List getMenuByRoleId(String roleId) {
        List menuList = plfMenuMapper.selectByRoleId(roleId);
        //再逆向排序
        List treeList = tranfromMenuToTree(menuList);
//        Collections.reverse( tranfromMenuToTree(treeList));
        return treeList;
    }

    /**
     * 将列表状的数据改为树形结构
     * @param menuList
     * @return 返回树形List 树为3层List结构
     */
    private List tranfromMenuToTree(List menuList){
        List treeList = new ArrayList();
//      逆向排序后倒插
        List level2List = new ArrayList();
        List level3List = new ArrayList();
        for (int i = 0; i < menuList.size() ; i++) {
            Map menu = (Map)menuList.get(i);
            String menuLevel = menu.get("MENU_LEVEL").toString();
            if ("3".equals(menuLevel)){
                level3List.add(menu);
            }
            if ("2".equals(menuLevel)){
                menu.put("CHILD_LIST",level3List);
                level2List.add(menu);
                level3List = new ArrayList();
            }
            if ("1".equals(menuLevel)){
                menu.put("CHILD_LIST",level2List);
                treeList.add(menu);
                level2List = new ArrayList();
            }
        }
        return treeList;
    }
}
