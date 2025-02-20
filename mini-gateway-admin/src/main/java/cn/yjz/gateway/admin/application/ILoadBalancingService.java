package cn.yjz.gateway.admin.application;

import cn.yjz.gateway.admin.domain.docker.model.aggregates.NginxConfig;

/**
 * @author 李白
 * @description 负载均衡配置服务
 * @date 2025-02-20
 */
public interface ILoadBalancingService {

    void updateNginxConfig(NginxConfig nginxConfig) throws Exception;

}
