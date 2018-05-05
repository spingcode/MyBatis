package com.netease.kaola.study.mybatis03;

import com.netease.kaola.study.entity.User;
import com.netease.kaola.study.mapper.UserMapper;
import com.netease.kaola.study.mybatis01.TestMyBatis01;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

/*
* 别名的设置
* */
public class TestTypeAliases {

    public static void main(String[] args) throws IOException {
        String path = "mybatis-config04.xml";
        SqlSessionFactory sqlSessionFactory = TestMyBatis01.getSqlSessionFactory(path);
        SqlSession session =  sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setName("zw");
        user.setAge(9);
        int i = userMapper.addUser(user);
        session.commit();
        session.close();
        System.out.println("i:"+i);
    }
}
