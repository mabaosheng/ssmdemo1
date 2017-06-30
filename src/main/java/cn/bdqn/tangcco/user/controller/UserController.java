package cn.bdqn.tangcco.user.controller;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.service.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

/**
 * Created by 马保生 on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Inject
    private UserServices userServices;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Tbuser tbuser, HttpSession session, Model model) {
        Tbuser tbuser1 = userServices.login(tbuser);
        if(tbuser1!=null){
            session.setAttribute("tcmp054",tbuser1);

            return "main";
        }
        model.addAttribute("msg", "用户名密码错误！");
        return "index";
    }
}
