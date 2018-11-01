package com.sunfong.plf.service.impl.privilege;

import com.sunfong.plf.mapper.privilege.PlfUserMapper;
import com.sunfong.plf.service.itf.privilege.IPlfUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
