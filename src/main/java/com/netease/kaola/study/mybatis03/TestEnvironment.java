package com.netease.kaola.study.mybatis03;

import com.netease.kaola.study.util.DataSourceUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestEnvironment {
    public static void main(String[] args) throws IOException {
        String path = "mybatis-config05.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(path);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        DataSourceUtil.printDataSourceInfo(sqlSessionFactory);
        resourceAsStream.close();
        resourceAsStream = Resources.getResourceAsStream(path);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream, "test");
        DataSourceUtil.printDataSourceInfo(sqlSessionFactory);
        resourceAsStream.close();
    }
}
