package com.botech.controler;

import com.botech.entity.User;
import com.botech.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestControler {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/hello")
    public String hello() {

        List<User> users = userMapper.findAllUser();
        System.out.println(users);

        return "hello";
    }

    @RequestMapping("/hello1")
    public List<User> hello1() {

        List<User> users = userMapper.findAllUser();
        System.out.println(users);

        return users;
    }
}

