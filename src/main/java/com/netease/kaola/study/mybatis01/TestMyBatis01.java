package com.netease.kaola.study.mybatis01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
/*
* 通过XML配置得到SqlSessionFactory
*
* */
public class TestMyBatis01 {
    public static void main(String[] args) throws IOException {
        String path="mybatis-config01.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        System.out.println(sqlSessionFactory);
    }
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        String path="mybatis-config01.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        return new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    public static SqlSessionFactory getSqlSessionFactory(String path) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        return new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
}
