package cn.yjz.gateway.admin.application;

import cn.yjz.gateway.admin.domain.operation.model.vo.*;
import cn.yjz.gateway.admin.infrastructure.common.OperationRequest;
import cn.yjz.gateway.admin.infrastructure.common.OperationResult;

/**
 * @author 李白
 * @description 网关运营数据管理
 * @date 2025-02-20
 */
public interface IDataOperationManageService {

    OperationResult<GatewayServerDataVO> queryGatewayServer(OperationRequest<String> request);

    OperationResult<ApplicationSystemDataVO> queryApplicationSystem(OperationRequest<ApplicationSystemDataVO> request);

    OperationResult<ApplicationInterfaceDataVO> queryApplicationInterface(OperationRequest<ApplicationInterfaceDataVO> request);

    OperationResult<ApplicationInterfaceMethodDataVO> queryApplicationInterfaceMethod(OperationRequest<ApplicationInterfaceMethodDataVO> request);

    OperationResult<GatewayServerDetaiDatalVO> queryGatewayServerDetail(OperationRequest<GatewayServerDetaiDatalVO> request);

    OperationResult<GatewayDistributionDataVO> queryGatewayDistribution(OperationRequest<GatewayDistributionDataVO> request);

}
