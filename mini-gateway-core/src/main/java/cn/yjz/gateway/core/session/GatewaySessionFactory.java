package cn.yjz.gateway.core.session;

/**
 * @author 李白
 * @description 网关会话工厂接口
 * @date 2025-02-11
 */
public interface GatewaySessionFactory {

    GatewaySession openSession(String uri);

}