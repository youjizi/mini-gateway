package cn.yjz.gateway.admin.infrastructure.common;

import java.util.List;

/**
 * @author 李白
 * @description 运营数据返回对象
 * @date 2025-02-20
 */
public class OperationResult<T> {

    private int pageTotal;
    private List<T> list;

    public OperationResult() {
    }

    public OperationResult(int pageTotal, List<T> list) {
        this.pageTotal = pageTotal;
        this.list = list;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
