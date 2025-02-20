package cn.yjz.gateway.admin.application;


import cn.yjz.gateway.admin.domain.manage.model.aggregates.ApplicationSystemRichInfo;
import cn.yjz.gateway.admin.domain.manage.model.vo.*;

import java.util.List;

/**
 * @author 李白
 * @description 网关配置服务
 * @date 2025-02-20
 */
public interface IConfigManageService {

    List<GatewayServerVO> queryGatewayServerList();

    List<GatewayServerDetailVO> queryGatewayServerDetailList();

    List<GatewayDistributionVO> queryGatewayDistributionList();

    boolean registerGatewayServerNode(String groupId, String gatewayId, String gatewayName, String gatewayAddress);

    ApplicationSystemRichInfo queryApplicationSystemRichInfo(String gatewayId, String systemId);

    String queryGatewayDistribution(String systemId);

    List<ApplicationSystemVO> queryApplicationSystemList();

    List<ApplicationInterfaceVO> queryApplicationInterfaceList();

    List<ApplicationInterfaceMethodVO> queryApplicationInterfaceMethodList();

    int distributionGatewayServerNode(String groupId, String gatewayId, String systemId);
}