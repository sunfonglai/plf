package com.sunfong.plf.controller.privilege;

import com.sunfong.plf.service.itf.IPlfMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author wfr14
 */
@RestController
@RequestMapping(value = "/data/plf/privilege/menu")
public class PlfMenuController {

    @Autowired
    IPlfMenuService iPlfMenuService ;

    /**
     * @param sessionParams session参数
     * @return  返回菜单列表
     */
    @RequestMapping(value = "/getMenuByRoleId") //value一般与方法名一致
    public List getMenuByRoleId(Map sessionParams){
        return iPlfMenuService.getMenuByRoleId("1");
    }
}
