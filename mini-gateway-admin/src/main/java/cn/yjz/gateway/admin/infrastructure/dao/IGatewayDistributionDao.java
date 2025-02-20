package cn.yjz.gateway.admin.infrastructure.dao;

import cn.yjz.gateway.admin.domain.operation.model.vo.GatewayDistributionDataVO;
import cn.yjz.gateway.admin.infrastructure.common.OperationRequest;
import cn.yjz.gateway.admin.infrastructure.po.GatewayDistribution;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 李白
 * @description 网关分配
 * @date 2025-02-20
 */
@Mapper
public interface IGatewayDistributionDao {

    List<String> queryGatewayDistributionSystemIdList(String gatewayId);

    String queryGatewayDistribution(String systemId);

    List<GatewayDistribution> queryGatewayDistributionList();

    List<GatewayDistribution> queryGatewayDistributionListByPage(OperationRequest<GatewayDistributionDataVO> request);

    int queryGatewayDistributionListCountByPage(OperationRequest<GatewayDistributionDataVO> request);

    int inset(String groupId, String gatewayId, String systemId);
}
