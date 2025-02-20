package cn.yjz.gateway.admin.infrastructure.dao;

import cn.yjz.gateway.admin.domain.operation.model.vo.ApplicationSystemDataVO;
import cn.yjz.gateway.admin.infrastructure.common.OperationRequest;
import cn.yjz.gateway.admin.infrastructure.po.ApplicationSystem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 李白
 * @description 应用系统
 * @date 2025-02-20
 */
@Mapper
public interface IApplicationSystemDao {

    void insert(ApplicationSystem applicationSystem);

    List<ApplicationSystem> queryApplicationSystemList(List<String> list);

    List<ApplicationSystem> queryApplicationSystemListByPage(OperationRequest<ApplicationSystemDataVO> request);

    int queryApplicationSystemListCountByPage(OperationRequest<ApplicationSystemDataVO> request);

}
