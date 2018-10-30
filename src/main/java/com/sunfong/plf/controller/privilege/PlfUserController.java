package com.sunfong.plf.controller.privilege;

import com.sunfong.plf.mapper.PlfUserMapper;
import com.sunfong.plf.service.itf.IPlfUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author wfr14
 */

@RestController
@RequestMapping(value = "/data/plf/privilege/user")
public class PlfUserController {


    @Autowired
    IPlfUserService iPlfUserService;


    /**
     * @return
     */
    @RequestMapping(value = "/getUser") //value一般与方法名一致
    public String getUser(){
        return iPlfUserService.getUserByMap(new HashMap()).toString();
    }
}
