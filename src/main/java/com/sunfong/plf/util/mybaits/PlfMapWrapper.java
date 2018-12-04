package com.sunfong.plf.util.mybaits;

import com.google.common.base.CaseFormat;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.wrapper.MapWrapper;
import java.util.Map;

/**
 * @author wfr14
 * 用于将MyBatis查出的Map的key转换成驼峰
 */
public class PlfMapWrapper extends MapWrapper {

    public PlfMapWrapper(MetaObject metaObject, Map<String, Object> map) {
        super(metaObject, map);
    }

    @Override
    public String findProperty(String name, boolean useCamelCaseMapping) {
        if(useCamelCaseMapping){
            return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,name);
        }
        return name;
    }
}
