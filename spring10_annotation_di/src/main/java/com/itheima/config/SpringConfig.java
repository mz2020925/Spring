package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")  // 加载多个属性配置文件（配置文件中有待注入的简单数据类型）使用数组，不允许使用通配符
/*
上面一行写法(classpath:jdbc.properties)能读到哪些范围内的配置文件：
类路径classpath指的是编译后路径，即本项目[或模块目录]/target/[项目或模块名]/WEB-INF/classes。
包括 src/main/java路径 和 src/main/resouces路径
*/
public class SpringConfig {
}
