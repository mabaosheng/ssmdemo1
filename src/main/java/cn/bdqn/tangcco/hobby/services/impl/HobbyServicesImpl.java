package cn.bdqn.tangcco.hobby.services.impl;

import cn.bdqn.tangcco.entity.Hobby;
import cn.bdqn.tangcco.hobby.dao.HobbyMapper;
import cn.bdqn.tangcco.hobby.services.HobbyServices;
import cn.bdqn.tangcco.tools.PageUtil;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by 马保生 on 2017/7/2.
 */
@Service
public class HobbyServicesImpl implements HobbyServices{

    @Inject
    private HobbyMapper hobbyMapper;
    @Override
    public PageUtil<Hobby> queryAll(Integer page, Integer rows) {

        PageUtil<Hobby> pageUtil = new PageUtil<>(page,rows);

        Integer start = pageUtil.getStart();

        int count = hobbyMapper.queryCount();

        List<Hobby> hobbyList = hobbyMapper.queryAll(start, rows);

        pageUtil.setTotal(count);
        pageUtil.setObjs(hobbyList);


        return pageUtil;
    }


}
