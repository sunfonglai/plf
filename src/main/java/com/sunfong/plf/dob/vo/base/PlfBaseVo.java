package com.sunfong.plf.dob.vo.base;

import com.alibaba.fastjson.JSON;

/**
 * Vo为充血模型，默认一个实体一个VO 可能内含多个实体，并提供实体的无状态方法，
 * 为了方便对外序列化，序列化协议采用json， 提供基础的转换方法
 * @author wfr14
 */
public class PlfBaseVo {

    public JSON toJson(){
        return this.toJson();
    }

}
