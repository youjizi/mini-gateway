package cn.yjz.gateway.core.bind;

import cn.yjz.gateway.core.executor.result.SessionResult;

import java.util.Map;

/**
 * @author 李白
 * @description 统一泛化调用接口
 * @date 2025-02-11
 */
public interface IGenericReference {

    SessionResult $invoke(Map<String, Object> params);

}