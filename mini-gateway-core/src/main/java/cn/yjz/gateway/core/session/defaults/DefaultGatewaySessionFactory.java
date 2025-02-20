package cn.yjz.gateway.core.session.defaults;

import cn.yjz.gateway.core.datasource.DataSource;
import cn.yjz.gateway.core.datasource.DataSourceFactory;
import cn.yjz.gateway.core.datasource.unpooled.UnpooledDataSourceFactory;
import cn.yjz.gateway.core.executor.Executor;
import cn.yjz.gateway.core.session.Configuration;
import cn.yjz.gateway.core.session.GatewaySession;
import cn.yjz.gateway.core.session.GatewaySessionFactory;

/**
 * @author 李白
 * @description 默认网关会话工厂
 * @date 2025-02-11
 */
public class DefaultGatewaySessionFactory implements GatewaySessionFactory {

    private final Configuration configuration;

    public DefaultGatewaySessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public GatewaySession openSession(String uri) {
        // 获取数据源连接信息：这里把 Dubbo、HTTP 抽象为一种连接资源
        DataSourceFactory dataSourceFactory = new UnpooledDataSourceFactory();
        dataSourceFactory.setProperties(configuration, uri);
        DataSource dataSource = dataSourceFactory.getDataSource();
        // 创建执行器
        Executor executor = configuration.newExecutor(dataSource.getConnection());
        // 创建会话：DefaultGatewaySession
        return new DefaultGatewaySession(configuration, uri, executor);
    }

}
