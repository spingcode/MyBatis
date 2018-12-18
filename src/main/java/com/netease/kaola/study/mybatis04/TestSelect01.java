package com.netease.kaola.study.mybatis04;

import com.netease.kaola.study.entity.User01;
import com.netease.kaola.study.mapper.UserMapper;
import com.netease.kaola.study.mapper.UserMapper01;
import com.netease.kaola.study.mybatis01.TestMyBatis01;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

public class TestSelect01 {
    public static void main(String[] args) throws IOException {
        String path = "mybatis-config06.xml";
        SqlSessionFactory sqlSessionFactory = TestMyBatis01.getSqlSessionFactory(path);
        SqlSession session =  sqlSessionFactory.openSession();
        UserMapper01 userMapper = session.getMapper(UserMapper01.class);
        System.out.println(userMapper.getUserById(1));
        System.out.println(userMapper.getUserById01(1));
        System.out.println(userMapper.getAllUser());
        User01 user01 = new User01();
        user01.setAge01(16);
        user01.setName01("22");
        userMapper.addUser(user01);
        session.commit();
        session.close();
    }
}
