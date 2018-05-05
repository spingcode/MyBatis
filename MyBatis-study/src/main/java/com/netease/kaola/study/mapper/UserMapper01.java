package com.netease.kaola.study.mapper;

import com.netease.kaola.study.entity.User01;

import java.util.List;
import java.util.Map;

public interface UserMapper01 {
    User01 getUserById(int id);
    Map<String,Object> getUser(int id);
    User01 getUserById01(int id);
    List<User01> getAllUser();
    List<User01> getAllUser01();
    int addUser(User01 user01);
}
