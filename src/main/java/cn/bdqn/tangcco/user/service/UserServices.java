package cn.bdqn.tangcco.user.service;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by 马保生 on 2017/6/26.
 */
public interface UserServices {

    Tbuser login(Tbuser tbuser);


}
