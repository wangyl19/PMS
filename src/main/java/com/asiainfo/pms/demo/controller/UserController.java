package com.asiainfo.pms.demo.controller;

import com.asiainfo.pms.demo.domain.User;
import com.asiainfo.pms.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public ModelAndView showUser(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(userId);
        ModelAndView mv = new ModelAndView("show");
        mv.addObject("user", user);
        return mv;
    }

    @RequestMapping("/showUserList")
    public ModelAndView showUserList(){
        List<User> userList = userService.getUserList();
        ModelAndView mv = new ModelAndView("showlist");
        mv.addObject("userList", userList);
        return mv;
    }
}
