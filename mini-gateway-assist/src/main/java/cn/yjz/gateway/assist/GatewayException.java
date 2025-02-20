package cn.yjz.gateway.assist;

/**
 * @author 李白
 * @description 网关异常
 * @date 2025-02-11
 */
public class GatewayException extends RuntimeException {

    public GatewayException(String msg) {
        super(msg);
    }

    public GatewayException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
