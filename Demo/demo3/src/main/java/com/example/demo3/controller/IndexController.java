package com.example.demo3.controller;

import com.example.demo3.entity.UserBase;
import com.example.demo3.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index.html";
    }

    @RequestMapping("/list")
    @ResponseBody
    public  List<UserBase> queryUserList() {
       // response.setContentType("application/json;charset=utf-8");
       // ModelAndView model=new ModelAndView("index.html");
        List<UserBase> user=userMapper.queryUserList();
       // model.addObject("user", user);
        return user;
    }
}
