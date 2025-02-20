package cn.yjz.gateway.admin.infrastructure.dao;

import cn.yjz.gateway.admin.domain.operation.model.vo.GatewayServerDetaiDatalVO;
import cn.yjz.gateway.admin.infrastructure.common.OperationRequest;
import cn.yjz.gateway.admin.infrastructure.po.GatewayServerDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 李白
 * @description
 * @date 2025-02-20
 */
@Mapper
public interface IGatewayServerDetailDao {

    void insert(GatewayServerDetail gatewayServerDetail);

    GatewayServerDetail queryGatewayServerDetail(GatewayServerDetail gatewayServerDetail);

    boolean updateGatewayStatus(GatewayServerDetail gatewayServerDetail);

    List<GatewayServerDetail> queryGatewayServerDetailList();

    List<GatewayServerDetail> queryGatewayServerDetailListByPage(OperationRequest<GatewayServerDetaiDatalVO> request);

    int queryGatewayServerDetailListCountByPage(OperationRequest<GatewayServerDetaiDatalVO> request);

}
