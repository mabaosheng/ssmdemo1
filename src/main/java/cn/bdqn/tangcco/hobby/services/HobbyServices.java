package cn.bdqn.tangcco.hobby.services;

import cn.bdqn.tangcco.entity.Hobby;
import cn.bdqn.tangcco.tools.PageUtil;


/**
 * Created by 马保生 on 2017/7/2.
 */
public interface HobbyServices {
     PageUtil<Hobby> queryAll(Integer page, Integer rows);


}
