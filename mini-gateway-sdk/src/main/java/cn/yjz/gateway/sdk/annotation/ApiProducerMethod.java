package cn.yjz.gateway.sdk.annotation;

import java.lang.annotation.*;

/**
 * @author 李白
 * @description
 * @date 2025-02-20
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ApiProducerMethod {

    /** 方法名称 */
    String methodName() default "";

    /** 访问路径；/wg/activity/sayHi */
    String uri() default "";

    /** 接口类型；GET、POST、PUT、DELETE */
    String httpCommandType() default "GET";

    /** 是否认证；true = 1是、false = 0否 */
    int auth() default 0;

}
