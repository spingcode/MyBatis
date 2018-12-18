package com.netease.kaola.study.mybatis02;

import com.netease.kaola.study.entity.User;
import com.netease.kaola.study.mapper.UserMapper;
import com.netease.kaola.study.mybatis01.TestMyBatis01;
import com.netease.kaola.study.util.DataSourceUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

public class TestSqlSession04 {
    public static void main(String[] args) throws IOException {
        String path="mybatis-config03.xml";
        SqlSessionFactory sqlSessionFactory = TestMyBatis01.getSqlSessionFactory(path);
        DataSourceUtil.printDataSourceInfo(sqlSessionFactory);

    }
}
