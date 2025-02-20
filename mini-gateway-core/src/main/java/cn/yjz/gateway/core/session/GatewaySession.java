package cn.yjz.gateway.core.session;

import cn.yjz.gateway.core.bind.IGenericReference;

import java.util.Map;

/**
 * @author 李白
 * @description 用户处理网关 HTTP 请求
 * @date 2025-02-11
 */
public interface GatewaySession {

    Object get(String methodName, Map<String, Object> params);

    Object post(String methodName, Map<String, Object> params);

    IGenericReference getMapper();

    Configuration getConfiguration();
}