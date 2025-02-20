package cn.yjz.gateway.admin.domain.register.service;

import cn.yjz.gateway.admin.application.IRegisterManageService;
import cn.yjz.gateway.admin.domain.register.model.vo.ApplicationInterfaceMethodVO;
import cn.yjz.gateway.admin.domain.register.model.vo.ApplicationInterfaceVO;
import cn.yjz.gateway.admin.domain.register.model.vo.ApplicationSystemVO;
import cn.yjz.gateway.admin.domain.register.repository.IRegisterManageRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 李白
 * @description 接口注册服务
 * @date 2025-02-20
 */
@Service
public class IRegisterManageServiceImpl implements IRegisterManageService {

    @Resource
    private IRegisterManageRepository registerManageRepository;

    @Override
    public void registerApplication(ApplicationSystemVO applicationSystemVO) {
        registerManageRepository.registerApplication(applicationSystemVO);
    }

    @Override
    public void registerApplicationInterface(ApplicationInterfaceVO applicationInterfaceVO) {
        registerManageRepository.registerApplicationInterface(applicationInterfaceVO);
    }

    @Override
    public void registerApplicationInterfaceMethod(ApplicationInterfaceMethodVO applicationInterfaceMethodVO) {
        registerManageRepository.registerApplicationInterfaceMethod(applicationInterfaceMethodVO);
    }

}
