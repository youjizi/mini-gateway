package cn.yjz.gateway.core.datasource;

import cn.yjz.gateway.core.session.Configuration;

/**
 * @author 李白
 * @description 数据源工厂
 * @date 2025-02-11
 */
public interface DataSourceFactory {

    void setProperties(Configuration configuration, String uri);

    DataSource getDataSource();

}
