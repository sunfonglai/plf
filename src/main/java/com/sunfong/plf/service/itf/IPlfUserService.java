package com.sunfong.plf.service.itf;

import java.util.List;
import java.util.Map;

/**
 * @author wfr14
 */
public interface IPlfUserService {
    /**
     * @param params 输入Map
     * @return 输出User
     */
    List getUserByMap(Map params);
}
