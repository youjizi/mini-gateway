package cn.yjz.gateway.sdk.config;


import cn.yjz.gateway.sdk.application.GatewaySDKApplication;
import cn.yjz.gateway.sdk.service.GatewayCenterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 李白
 * @description 网关SDK配置服务
 * @date 2025-02-20
 */
@Configuration
@EnableConfigurationProperties(GatewaySDKServiceProperties.class)
@ConditionalOnProperty(
        prefix = "api-gateway-sdk",
        name = "enabled",
        havingValue = "true",
        matchIfMissing = true
)
public class GatewaySDKAutoConfig {

    private Logger logger = LoggerFactory.getLogger(GatewaySDKAutoConfig.class);

    @Bean
    public GatewayCenterService gatewayCenterService() {
        return new GatewayCenterService();
    }

    @Bean
    public GatewaySDKApplication gatewaySDKApplication(GatewaySDKServiceProperties properties, GatewayCenterService gatewayCenterService) {
        return new GatewaySDKApplication(properties, gatewayCenterService);
    }

}
