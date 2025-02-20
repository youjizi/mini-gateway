package cn.yjz.gateway.core.datasource;

/**
 * @author 李白
 * @description 连接接口
 * @date 2025-02-11
 */
public interface Connection {

    Object execute(String method, String[] parameterTypes, String[] parameterNames, Object[] args);

}