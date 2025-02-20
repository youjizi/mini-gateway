package cn.yjz.gateway.engin;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author 李白
 * @date 2025-02-11
 * @description 启动类
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Configurable
public class EnginApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnginApplication.class, args);
    }

}
