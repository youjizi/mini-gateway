package cn.yjz.gateway.admin.infrastructure.dao;

import cn.yjz.gateway.admin.domain.operation.model.vo.ApplicationInterfaceMethodDataVO;
import cn.yjz.gateway.admin.infrastructure.common.OperationRequest;
import cn.yjz.gateway.admin.infrastructure.po.ApplicationInterfaceMethod;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 李白
 * @description 应用接口方法
 * @date 2025-02-20
 */
@Mapper
public interface IApplicationInterfaceMethodDao {

    void insert(ApplicationInterfaceMethod applicationInterfaceMethod);

    List<ApplicationInterfaceMethod> queryApplicationInterfaceMethodList(ApplicationInterfaceMethod req);

    List<ApplicationInterfaceMethod> queryApplicationInterfaceMethodListByPage(OperationRequest<ApplicationInterfaceMethodDataVO> request);

    int queryApplicationInterfaceMethodListCountByPage(OperationRequest<ApplicationInterfaceMethodDataVO> request);

}
