package com.sunfong.plf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wfr14
 */

@RestController
@RequestMapping(value = "/data/plf/check")
public class PlfCheckAliveController {

    @RequestMapping(value = "/alive")
    public String checkAlive(){
        return "Alive";
    }
}
