package com.netease.kaola.study.mapper;

import com.netease.kaola.study.entity.User01;
import com.netease.kaola.study.util.SelectLikeUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper01 {
    User01 getUserById(int id);
    Map<String,Object> getUser(int id);
    User01 getUserById01(int id);
    List<User01> getAllUser();
    List<User01> getAllUser01();
    int addUser(User01 user01);
    List<User01> getPartUser(List<Integer> userId);
    List<User01> selectUserLike(@Param("pa") String pa);
    List<User01> selectUser();
}
