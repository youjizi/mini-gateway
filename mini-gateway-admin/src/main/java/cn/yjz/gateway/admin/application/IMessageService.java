package cn.yjz.gateway.admin.application;

import java.util.Map;

/**
 * @author 李白
 * @description 消息服务
 * @date 2025-02-20
 */
public interface IMessageService {

    Map<String, String> queryRedisConfig();

    void pushMessage(String gatewayId, Object message);

}
