package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
 * 注解开发模式先下，管理第三方的Bean（第三方的IoC容器、或者说是第三方的jar包）的方式之一：
 * 可以在SpringConfig类中以 方法的形式配置第三方的Bean，但通常不这么做（因为每次获取第三方的Bean都要写一个方法来配置，太冗长了）。
 * 接下来注释掉这些方法，为每一个获取第三方的Bean都单独写一个配置类来代替方法的形式，这么代替？使用@Import({JdbcConfig.class})来执行代替。
 *
 * */
@Configuration
@ComponentScan("com.itheima")
@Import({JdbcConfig.class})
public class SpringConfig {
}
