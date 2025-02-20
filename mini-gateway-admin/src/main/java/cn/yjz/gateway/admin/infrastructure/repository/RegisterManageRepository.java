package cn.yjz.gateway.admin.infrastructure.repository;

import cn.yjz.gateway.admin.domain.register.model.vo.ApplicationInterfaceMethodVO;
import cn.yjz.gateway.admin.domain.register.model.vo.ApplicationInterfaceVO;
import cn.yjz.gateway.admin.domain.register.model.vo.ApplicationSystemVO;
import cn.yjz.gateway.admin.domain.register.repository.IRegisterManageRepository;
import cn.yjz.gateway.admin.infrastructure.dao.IApplicationInterfaceDao;
import cn.yjz.gateway.admin.infrastructure.dao.IApplicationInterfaceMethodDao;
import cn.yjz.gateway.admin.infrastructure.dao.IApplicationSystemDao;
import cn.yjz.gateway.admin.infrastructure.po.ApplicationInterface;
import cn.yjz.gateway.admin.infrastructure.po.ApplicationInterfaceMethod;
import cn.yjz.gateway.admin.infrastructure.po.ApplicationSystem;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 李白
 * @description 接口注册仓储服务
 * @date 2025-02-20
 */
@Component
public class RegisterManageRepository implements IRegisterManageRepository {

    @Resource
    private IApplicationSystemDao applicationSystemDao;
    @Resource
    private IApplicationInterfaceDao applicationInterfaceDao;
    @Resource
    private IApplicationInterfaceMethodDao applicationInterfaceMethodDao;

    @Override
    public void registerApplication(ApplicationSystemVO applicationSystemVO) {
        ApplicationSystem applicationSystem = new ApplicationSystem();
        applicationSystem.setSystemId(applicationSystemVO.getSystemId());
        applicationSystem.setSystemName(applicationSystemVO.getSystemName());
        applicationSystem.setSystemType(applicationSystemVO.getSystemType());
        applicationSystem.setSystemRegistry(applicationSystemVO.getSystemRegistry());
        applicationSystemDao.insert(applicationSystem);
    }

    @Override
    public void registerApplicationInterface(ApplicationInterfaceVO applicationInterfaceVO) {
        ApplicationInterface applicationInterface = new ApplicationInterface();
        applicationInterface.setSystemId(applicationInterfaceVO.getSystemId());
        applicationInterface.setInterfaceId(applicationInterfaceVO.getInterfaceId());
        applicationInterface.setInterfaceName(applicationInterfaceVO.getInterfaceName());
        applicationInterface.setInterfaceVersion(applicationInterfaceVO.getInterfaceVersion());
        applicationInterfaceDao.insert(applicationInterface);
    }

    @Override
    public void registerApplicationInterfaceMethod(ApplicationInterfaceMethodVO applicationInterfaceMethodVO) {
        ApplicationInterfaceMethod applicationInterfaceMethod = new ApplicationInterfaceMethod();
        applicationInterfaceMethod.setSystemId(applicationInterfaceMethodVO.getSystemId());
        applicationInterfaceMethod.setInterfaceId(applicationInterfaceMethodVO.getInterfaceId());
        applicationInterfaceMethod.setMethodId(applicationInterfaceMethodVO.getMethodId());
        applicationInterfaceMethod.setMethodName(applicationInterfaceMethodVO.getMethodName());
        applicationInterfaceMethod.setParameterType(applicationInterfaceMethodVO.getParameterType());
        applicationInterfaceMethod.setUri(applicationInterfaceMethodVO.getUri());
        applicationInterfaceMethod.setHttpCommandType(applicationInterfaceMethodVO.getHttpCommandType());
        applicationInterfaceMethod.setAuth(applicationInterfaceMethodVO.getAuth());
        applicationInterfaceMethodDao.insert(applicationInterfaceMethod);
    }

}
