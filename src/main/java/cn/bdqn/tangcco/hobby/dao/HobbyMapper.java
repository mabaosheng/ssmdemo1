package cn.bdqn.tangcco.hobby.dao;

import cn.bdqn.tangcco.entity.Hobby;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 马保生 on 2017/7/2.
 */
public interface HobbyMapper {
    List<Hobby> queryAll(@Param("start") Integer start, @Param("rows") Integer rows);

    Integer queryCount();



}
