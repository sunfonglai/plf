package com.sunfong.plf.controller.privilege;

import com.alibaba.fastjson.JSON;
import com.sunfong.plf.service.itf.privilege.IPlfUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wfr14
 */

@RestController
@RequestMapping(value = "/data/plf/privilege/user")
public class PlfUserController {


    @Autowired
    IPlfUserService iPlfUserService;


    /**
     * 测试使用 demo 后续注销方法
     * @return
     */
    @RequestMapping(value = "/getUser") //value一般与方法名一致
    public String getUser(){
        return iPlfUserService.getUserByMap(new HashMap()).toString();
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public Map login( String userName){
        String userName1 = userName;
        return  new HashMap(2);
    }


}
