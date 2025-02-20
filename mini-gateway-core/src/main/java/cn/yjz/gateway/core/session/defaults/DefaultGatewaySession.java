package cn.yjz.gateway.core.session.defaults;

import cn.yjz.gateway.core.bind.IGenericReference;
import cn.yjz.gateway.core.executor.Executor;
import cn.yjz.gateway.core.mapping.HttpStatement;
import cn.yjz.gateway.core.session.Configuration;
import cn.yjz.gateway.core.session.GatewaySession;

import java.util.Map;

/**
 * @author 李白
 * @description 默认网关会话实现类
 * @date 2025-02-11
 */
public class DefaultGatewaySession implements GatewaySession {

    private Configuration configuration;
    private String uri;
    private Executor executor;

    public DefaultGatewaySession(Configuration configuration, String uri, Executor executor) {
        this.configuration = configuration;
        this.uri = uri;
        this.executor = executor;
    }

    @Override
    public Object get(String methodName, Map<String, Object> params) {
        HttpStatement httpStatement = configuration.getHttpStatement(uri);
        try {
            return executor.exec(httpStatement, params);
        } catch (Exception e) {
            throw new RuntimeException("Error exec get. Cause: " + e);
        }
    }

    @Override
    public Object post(String methodName, Map<String, Object> params) {
        return get(methodName, params);
    }

    @Override
    public IGenericReference getMapper() {
        return configuration.getMapper(uri, this);
    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

}
