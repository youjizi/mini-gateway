package cn.yjz.gateway.core.datasource;

/**
 * @author 李白
 * @description 数据源接口，RPC、HTTP 都当做连接的数据资源使用
 * @date 2025-02-11
 */
public interface DataSource {

    Connection getConnection();

}