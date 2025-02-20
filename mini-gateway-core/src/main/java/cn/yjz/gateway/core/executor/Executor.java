package cn.yjz.gateway.core.executor;

import cn.yjz.gateway.core.executor.result.SessionResult;
import cn.yjz.gateway.core.mapping.HttpStatement;

import java.util.Map;

/**
 * @author 李白
 * @description 执行器
 * @date 2025-02-11
 */
public interface Executor {

    SessionResult exec(HttpStatement httpStatement, Map<String, Object> params) throws Exception;

}