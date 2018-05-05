package com.netease.kaola.study.mybatis01;

import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.util.Properties;

/*
* 使用JAVA类进行配置获取SqlSessionFactory,这种方法最好不要使用mapper.xml文件
* */
public class TestMyBatis02 {
    public static void main(String[] args) {
        /*
        * 1、获取数据源
        * */
        DataSource dataSource = getDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development",transactionFactory,dataSource);
        Configuration configuration = new Configuration(environment);
        //configuration.addMapper();
        /*
        * 上面的操作实现了XML里面配置完成的任务获取了配置对象
        * */
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(configuration);
        System.out.println(sqlSessionFactory);

    }
    public static SqlSessionFactory getSqlSessionFactory()
    {
         /*
        * 1、获取数据源
        * */
        DataSource dataSource = getDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development",transactionFactory,dataSource);
        Configuration configuration = new Configuration(environment);
        return  new SqlSessionFactoryBuilder().build(configuration);
    }
    public static SqlSessionFactory getSqlSessionFactory(Class<?> clazz)
    {
        DataSource dataSource = getDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development",transactionFactory,dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(clazz);
        return  new SqlSessionFactoryBuilder().build(configuration);
    }
    public static DataSource getDataSource()
    {
        Properties properties = new Properties();
        properties.setProperty("driver", "com.mysql.jdbc.Driver");
        properties.setProperty("url", "jdbc:mysql://127.0.0.1:3306/mybatis");
        properties.setProperty("username", "root");
        properties.setProperty("password", "123456");
        PooledDataSourceFactory pooledDataSourceFactory = new PooledDataSourceFactory();
        pooledDataSourceFactory.setProperties(properties);
        return pooledDataSourceFactory.getDataSource();
    }
}
