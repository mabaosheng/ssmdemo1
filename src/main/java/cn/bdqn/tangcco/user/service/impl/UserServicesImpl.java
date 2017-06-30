package cn.bdqn.tangcco.user.service.impl;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.dao.UserMapper;
import cn.bdqn.tangcco.user.service.UserServices;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by 马保生 on 2017/6/26.
 */
@Service
public class UserServicesImpl implements UserServices {

    @Inject
    private UserMapper userMapper;

    @Override
    public Tbuser login(Tbuser tbuser) {
        return userMapper.login(tbuser);
    }
}
