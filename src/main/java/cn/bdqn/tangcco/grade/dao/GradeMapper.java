package cn.bdqn.tangcco.grade.dao;

import cn.bdqn.tangcco.entity.Grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 马保生 on 2017/6/29.
 */
public interface GradeMapper {

    Integer queryCountGradeByName(@Param("gradename") String gradename) ;

    List<Grade> queryGradeByName(@Param("start") Integer start, @Param("rows") Integer rows, @Param("gradename") String gradename);

    Grade queryGradeById(@Param("gradeid") Integer gradeid);
}
