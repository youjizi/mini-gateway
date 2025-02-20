package cn.yjz.gateway.admin.infrastructure.dao;

import cn.yjz.gateway.admin.infrastructure.common.OperationRequest;
import cn.yjz.gateway.admin.infrastructure.po.GatewayServer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 李白
 * @description
 * @date 2025-02-20
 */
@Mapper
public interface IGatewayServerDao {

    List<GatewayServer> queryGatewayServerList();

    List<GatewayServer> queryGatewayServerListByPage(OperationRequest<String> request);

    int queryGatewayServerListCountByPage(OperationRequest<String> request);

}
