package com.netease.kaola.study.mybatis02;

import com.netease.kaola.study.entity.User;
import com.netease.kaola.study.mapper.UserMapper;
import com.netease.kaola.study.mybatis01.TestMyBatis01;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

/*
* 获取SqlSession
* */
public class TestSqlSession {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = TestMyBatis01.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper);
        User user = new User();
        user.setName("zw");
        user.setAge(9);
        int i = userMapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("i:"+i);
    }
}
