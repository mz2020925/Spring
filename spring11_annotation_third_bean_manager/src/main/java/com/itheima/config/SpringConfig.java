package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/*
* 注解开发模式先下，管理第三方的Bean（第三方的IoC容器、或者说是第三方的jar包）的方式之一：
* 可以在SpringConfig类中以 方法的形式配置第三方的Bean，但通常不这么做（因为每次获取第三方的Bean都要写一个方法来配置，太冗长了）。
* 接下来注释掉这些方法，为每一个获取第三方的Bean都单独写一个配置类来代替方法的形式，这么代替？使用@Import({JdbcConfig.class})来执行代替。
*
* */
@Configuration
// @ComponentScan("com.itheima.config")  // 单独写一个配置类的格式一(扫描式)，对应的配置类需要写注解@Configuration
@Import({JdbcConfig.class})  // 单独写一个配置类的格式一(导入式)
public class SpringConfig {
    // 1.定义一个方法获得要管理的第三方IoC容器的 对象
    // 2.添加注解@Bean，表示当前方法的返回值是一个Bean
    // @Bean("dataSource")  // ("dataSource")可以省略不写
    // public DataSource dataSource(){
    //     DruidDataSource ds = new DruidDataSource();
    //     ds.setDriverClassName("com.mysql.jdbc.Driver");
    //     ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
    //     ds.setUsername("root");
    //     ds.setPassword("root");
    //     return ds;
    // }
}
