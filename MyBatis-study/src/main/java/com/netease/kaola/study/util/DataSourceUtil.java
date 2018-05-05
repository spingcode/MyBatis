package com.netease.kaola.study.util;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;

public class DataSourceUtil {
    public static  void printDataSourceInfo(SqlSessionFactory sqlSessionFactory)
    {
        PooledDataSource dataSource = (PooledDataSource) (sqlSessionFactory.getConfiguration().getEnvironment().getDataSource());
        System.out.println("name："+dataSource.getUsername());
        System.out.println("password："+dataSource.getPassword());
        System.out.println("URL:"+dataSource.getUrl());
    }
}
