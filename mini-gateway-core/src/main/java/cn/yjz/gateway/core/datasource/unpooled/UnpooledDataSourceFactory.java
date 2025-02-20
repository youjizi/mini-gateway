package cn.yjz.gateway.core.datasource.unpooled;

import cn.yjz.gateway.core.datasource.DataSource;
import cn.yjz.gateway.core.datasource.DataSourceFactory;
import cn.yjz.gateway.core.datasource.DataSourceType;
import cn.yjz.gateway.core.session.Configuration;

/**
 * @author 李白
 * @description
 * @date 2025-02-11
 */
public class UnpooledDataSourceFactory implements DataSourceFactory {

    protected UnpooledDataSource dataSource;

    public UnpooledDataSourceFactory() {
        this.dataSource = new UnpooledDataSource();
    }

    @Override
    public void setProperties(Configuration configuration, String uri) {
        this.dataSource.setConfiguration(configuration);
        this.dataSource.setDataSourceType(DataSourceType.Dubbo);
        this.dataSource.setHttpStatement(configuration.getHttpStatement(uri));
    }

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

}
