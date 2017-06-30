package cn.bdqn.tangcco.tools;

import java.util.List;

/**
 * Created by 马保生 on 2017/6/29.
 */
public class PageUtil <T> {


    Integer page;

    Integer start;

    Integer rows;

    Integer total;

    List<T> objs;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getObjs() {
        return objs;
    }

    public void setObjs(List<T> objs) {
        this.objs = objs;
    }

    public PageUtil(Integer page, Integer rows) {
        this.page = page;
        this.rows = rows;
        this.start = (page-1)*rows;
    }

    public PageUtil() {
    }
}
