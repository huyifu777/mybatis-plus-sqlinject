package com.example.mybatisp.controller;

import com.example.mybatisp.common.Limit;
import com.example.mybatisp.entity.User;
import com.example.mybatisp.mapper.UserMapper;
import jakarta.servlet.ServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    @Limit(key = "cachingTest", permitsPerSecond = 1, timeout = 500, msg = "当前排队人数较多，请稍后再试！")
    @GetMapping("/my-api")
    public String myApi() {
        return "success";
    }

    @GetMapping("/select1")
    public List<User> select1(@RequestParam(value = "name") String name) {
        List<User> foundUserbyid = userMapper.select1(name);
        System.out.println(foundUserbyid);
        return foundUserbyid;
    }
    @GetMapping("/select2")
    public List<User> select2(@RequestParam(value = "name") String name) {
        List<User> foundUserbyname = userMapper.select2(name);
        System.out.println(foundUserbyname);
        return foundUserbyname;
    }
    @GetMapping("/select3")
    public List<User> select3(@RequestParam(value = "name") String name) {
        List<User> foundUserbyname = userMapper.select3(name);
        System.out.println(foundUserbyname);
        return foundUserbyname;
    }
    @GetMapping("/select4")
    public List<User> select4(@RequestParam(value = "name") String name) {
        List<User> foundUserbyname = userMapper.select4(name);
        System.out.println(foundUserbyname);
        return foundUserbyname;
    }

    @GetMapping("/callname_once")
    public List<User> callname_once(@RequestParam Map<String, Object> params) {
//        Map<String, Object> searchMap = new HashMap<>();
//        searchMap.put("id",null);
//        searchMap.put("name",user.getname());
//        searchMap.put("age",null);
//        searchMap.put("email",null);
        List<User> foundUserbyname = userMapper.selectByMap(params);
        System.out.println(foundUserbyname);
        return foundUserbyname;
    }

    @PostMapping("/api/post")
    public String handlePostRequest(@RequestBody User data, ServletRequest httpRequest) {
        List<User> foundUser = userMapper.select1(data.getname());
        System.out.println(foundUser);
        // 返回响应
        return data.getname();
    }
}
