package cn.yjz.gateway.admin;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 李白
 * @description 网关注册中心启动服务
 * @date 2025-02-20
 */
@SpringBootApplication
@Configurable
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}