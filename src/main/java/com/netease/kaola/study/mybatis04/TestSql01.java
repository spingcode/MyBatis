package com.netease.kaola.study.mybatis04;

import com.netease.kaola.study.mapper.UserMapper01;
import com.netease.kaola.study.mybatis01.TestMyBatis01;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

public class TestSql01 {
    public static void main(String[] args) throws IOException {
        String path = "mybatis-config06.xml";
        SqlSessionFactory sqlSessionFactory = TestMyBatis01.getSqlSessionFactory(path);
        SqlSession session =  sqlSessionFactory.openSession();
        UserMapper01 userMapper = session.getMapper(UserMapper01.class);
        System.out.println(userMapper.getAllUser01());
    }
}
