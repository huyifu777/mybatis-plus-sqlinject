package com.example.mybatisp;


import com.example.mybatisp.entity.User;
import com.example.mybatisp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;


@SpringBootTest
@MapperScan("com.example.mybatisp")
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        userMapper.selectList(null).forEach(System.out::println);
    }
    @Test
    public void testget(){
        User user = new  User();
        user.setid(6);
        user.setname("hu");
        user.setAge(18);
        user.setEmail("test5@qq.com");
//        System.out.println(user.getid());
        List<User> foundUser = userMapper.select1(user.getname());
        System.out.println(foundUser);
//        userMapper.insert(user);
    }
}