package cn.yjz.gateway.admin.domain.manage.repository;

import cn.yjz.gateway.admin.domain.manage.model.vo.*;

import java.util.List;

/**
 * @author 李白
 * @description 网关配置仓储服务
 * @date 2025-02-20
 */
public interface IConfigManageRepository {

    List<GatewayServerVO> queryGatewayServerList();

    List<GatewayServerDetailVO> queryGatewayServerDetailList();

    boolean registerGatewayServerNode(String groupId, String gatewayId, String gatewayName, String gatewayAddress, Integer available);

    GatewayServerDetailVO queryGatewayServerDetail(String gatewayId, String gatewayAddress);

    boolean updateGatewayStatus(String gatewayId, String gatewayAddress, Integer available);

    List<String> queryGatewayDistributionSystemIdList(String gatewayId);

    List<ApplicationSystemVO> queryApplicationSystemList(List<String> systemIdList);

    List<ApplicationInterfaceVO> queryApplicationInterfaceList(String systemId);

    List<ApplicationInterfaceMethodVO> queryApplicationInterfaceMethodList(String systemId, String interfaceId);

    String queryGatewayDistribution(String systemId);

    List<GatewayDistributionVO> queryGatewayDistributionList();

    int distributionGatewayServerNode(String groupId, String gatewayId, String systemId);
}
