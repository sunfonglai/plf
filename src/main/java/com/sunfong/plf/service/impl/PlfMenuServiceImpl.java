package com.sunfong.plf.service.impl;

import com.sunfong.plf.mapper.PlfMenuMapper;
import com.sunfong.plf.service.itf.IPlfMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wfr14
 */
@Service
public class PlfMenuServiceImpl implements IPlfMenuService {

    @Autowired
    PlfMenuMapper plfMenuMapper;

    @Override
    public List getMenuByRoleId(String roleId) {
        return plfMenuMapper.selectByRoleId(roleId);
    }
}
