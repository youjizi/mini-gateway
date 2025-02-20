package cn.yjz.gateway.admin.domain.register.repository;

import cn.yjz.gateway.admin.domain.register.model.vo.ApplicationInterfaceMethodVO;
import cn.yjz.gateway.admin.domain.register.model.vo.ApplicationInterfaceVO;
import cn.yjz.gateway.admin.domain.register.model.vo.ApplicationSystemVO;

/**
 * @author 李白
 * @description 接口注册仓储服务
 * @date 2025-02-20
 */
public interface IRegisterManageRepository {

    void registerApplication(ApplicationSystemVO applicationSystemVO);

    void registerApplicationInterface(ApplicationInterfaceVO applicationInterfaceVO);

    void registerApplicationInterfaceMethod(ApplicationInterfaceMethodVO applicationInterfaceMethodVO);

}
