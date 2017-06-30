package cn.bdqn.tangcco.grade.services.impl;

import cn.bdqn.tangcco.entity.Grade;
import cn.bdqn.tangcco.grade.dao.GradeMapper;
import cn.bdqn.tangcco.grade.services.GradeServices;
import cn.bdqn.tangcco.tools.PageUtil;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by 马保生 on 2017/6/29.
 */
@Service
public class GradeServicesImpl implements GradeServices {
    @Inject
    private GradeMapper gradeMapper;
    @Override
    public Integer queryCountGradeByName(String gradename) {
        return gradeMapper.queryCountGradeByName(gradename);
    }

    @Override
    public PageUtil queryGradeByName(Integer page, Integer rows, String gradename) {
        Integer count = gradeMapper.queryCountGradeByName(gradename);
        PageUtil pageUtil = new PageUtil(page, rows);
        List<Grade> gradeList = gradeMapper.queryGradeByName(pageUtil.getStart(), rows, gradename);

        pageUtil.setTotal(count);
        pageUtil.setObjs(gradeList);
        return pageUtil;
    }



    @Override
    public Grade queryGradeById(Integer gradeid) {
        return gradeMapper.queryGradeById(gradeid);
    }
}
