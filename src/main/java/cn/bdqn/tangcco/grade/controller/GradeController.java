package cn.bdqn.tangcco.grade.controller;

import cn.bdqn.tangcco.entity.Grade;
import cn.bdqn.tangcco.grade.services.GradeServices;
import cn.bdqn.tangcco.tools.PageUtil;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by 马保生 on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/grade")
public class GradeController {
    @Inject
    private GradeServices gradeServices;
    @RequestMapping(value = "/gradeList", method = RequestMethod.GET)
    public String toGradeList() {
        return "gradeList";
    }

    @RequestMapping(value = "/queryGrade", method = RequestMethod.POST, produces={"application/json;chaset=UTF-8"})
    @ResponseBody

    public String queryGrade(Integer page,Integer rows,String gradename) {

        Map<String, Object> map = new HashMap<String, Object>();
        PageUtil pageUtil = gradeServices.queryGradeByName(page, rows, gradename);
        map.put("total", pageUtil.getTotal());
        map.put("gradeList", pageUtil.getObjs());
        String json = JSONArray.toJSONString(map);
        System.out.println(json);
        return json;

    }

    @RequestMapping(value = "/queryGradeById", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String queryGradeById(Integer id) {
        Grade grade = gradeServices.queryGradeById(id);
        String json = JSONArray.toJSONString(grade);

        return json;
    }
}
