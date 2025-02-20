package cn.yjz.gateway.admin.infrastructure.dao;

import cn.yjz.gateway.admin.domain.operation.model.vo.ApplicationInterfaceDataVO;
import cn.yjz.gateway.admin.infrastructure.common.OperationRequest;
import cn.yjz.gateway.admin.infrastructure.po.ApplicationInterface;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 李白
 * @description 应用接口
 * @date 2025-02-20
 */
@Mapper
public interface IApplicationInterfaceDao {

    void insert(ApplicationInterface applicationInterface);

    List<ApplicationInterface> queryApplicationInterfaceList(String systemId);

    List<ApplicationInterface> queryApplicationInterfaceListByPage(OperationRequest<ApplicationInterfaceDataVO> request);

    int queryApplicationInterfaceListCountByPage(OperationRequest<ApplicationInterfaceDataVO> request);

}
