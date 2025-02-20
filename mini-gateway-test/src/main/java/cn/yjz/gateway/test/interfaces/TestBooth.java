package cn.yjz.gateway.test.interfaces;

import cn.yjz.gateway.sdk.annotation.ApiProducerClazz;
import cn.yjz.gateway.sdk.annotation.ApiProducerMethod;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 李白
 * @date 2025-02-20
 * @description 测试接口
 */

@Service(version = "1.0.0")
@ApiProducerClazz(interfaceName = "测试服务", interfaceVersion = "1.0.0")
public class TestBooth implements ITestBooth{

    @Override
    @ApiProducerMethod(methodName = "无敌方法哦", uri = "/wg/activity/test", httpCommandType = "GET", auth = 0)
    public String test(String str) {
        return "正在测试，测试成功 " + str;
    }

}
