package com.example.mybatisp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select id,name,age,email from user where  name = #{name}")
    List<User> select1 (@Param("name") String  name);

    @Select("select * from user where  name = '${name}'")
    List<User> select2 (@Param("name") String  name);

    List<User> select3(String  name);
    List<User> select4(String  name);
}
