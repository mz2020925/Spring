package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

// @Configuration
public class JdbcConfig {
    // 1.定义一个方法获得要管理的第三方IoC容器的 对象
    // 2.添加注解@Bean，表示当前方法的返回值是一个Bean
    @Bean("dataSource")  // ("dataSource")可以省略不写
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
