package cn.yjz.gateway.sdk;

/**
 * @author 李白
 * @description 网关异常
 * @date 2025-02-20
 */
public class GatewayException extends RuntimeException {

    public GatewayException(String msg) {
        super(msg);
    }

    public GatewayException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
