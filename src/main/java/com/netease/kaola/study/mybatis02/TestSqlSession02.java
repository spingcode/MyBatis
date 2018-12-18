package com.netease.kaola.study.mybatis02;

import com.netease.kaola.study.entity.User;
import com.netease.kaola.study.mapper.UserMapper;
import com.netease.kaola.study.mybatis01.TestMyBatis01;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

public class TestSqlSession02 {

    public static void main(String[] args) throws IOException {

        String path="mybatis-config02.xml";
        SqlSessionFactory sqlSessionFactory = TestMyBatis01.getSqlSessionFactory(path);
        SqlSession session =  sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.SelectOne(1);
        System.out.println(user);
        session.commit();
        session.close();
    }
}
