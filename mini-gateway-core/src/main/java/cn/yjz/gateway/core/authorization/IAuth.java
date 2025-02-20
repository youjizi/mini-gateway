package cn.yjz.gateway.core.authorization;

/**
 * @author 李白
 * @description 认证服务接口
 * @date 2025-02-11
 */
public interface IAuth {

    boolean validate(String id, String token);

}