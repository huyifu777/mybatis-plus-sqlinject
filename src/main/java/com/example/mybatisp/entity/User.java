package com.example.mybatisp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("user")
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    public Integer id;
    private String name;
    private Integer age;
    private String email;

    public void setid(Integer id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name=name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public Integer getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public Integer getage() {return  age;
    }
    public String getemail() {return  email;
    }

}