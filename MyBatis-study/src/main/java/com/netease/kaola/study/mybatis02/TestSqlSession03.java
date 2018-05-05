package com.netease.kaola.study.mybatis02;

import com.netease.kaola.study.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestSqlSession03 {

    public static void main(String[] args) throws IOException {
        String path="mybatis-config02.xml";
        InputStream inputStream = Resources.getResourceAsStream(path);
        Properties properties = new Properties();
        properties.setProperty("datasource.username","root");
        properties.setProperty("datasource.password","root");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, properties);
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        System.out.println(userMapper.SelectOne(1));
        session.commit();
        session.close();
    }
}
