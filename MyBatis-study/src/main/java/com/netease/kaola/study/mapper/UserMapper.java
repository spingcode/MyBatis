package com.netease.kaola.study.mapper;

import com.netease.kaola.study.entity.User;

public interface UserMapper {
    int addUser(User user);
    User SelectOne(int id);
}
