package com.sunfong.plf.service.impl;

import com.sunfong.plf.mapper.PlfUserMapper;
import com.sunfong.plf.service.itf.IPlfUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wfr14
 */
@Service
public class PlfUserServiceImpl implements IPlfUserService {

    @Autowired
    PlfUserMapper plfUserMapper;

    @Override
    public List getUserByMap(Map params) {
        return plfUserMapper.selectByMap(params);
    }
}
