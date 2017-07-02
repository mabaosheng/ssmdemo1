package cn.bdqn.tangcco.grade.services;

import cn.bdqn.tangcco.entity.Grade;
import cn.bdqn.tangcco.tools.PageUtil;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 马保生 on 2017/6/29.
 */
public interface GradeServices {
    Integer queryCountGradeByName(@Param("gradeName") String gradename) ;

    PageUtil queryGradeByName(@Param("page") Integer page, @Param("rows") Integer rows, @Param("gradeName") String gradename);

    Grade queryGradeById(@Param("id") Integer gradeid);
}
