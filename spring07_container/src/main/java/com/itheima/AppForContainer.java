package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class AppForContainer {
    public static void main(String[] args) {
        // 1.加载类路径下的配置文件
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2.从文件系统下加载配置文件
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\AllCode_Design\\Coding_Files\\IntelliJ_IDEA_Files\\spring-events\\spring07_container\\src\\main\\resources\\applicationContext.xml");

        // 3.获取bean的三种方式
        DataSource dataSource3 = (DataSource) ctx.getBean("dataSource3");
        // DataSource dataSource3 = ctx.getBean("dataSource3,", DruidDataSource.class);
        // DataSource dataSource3 = ctx.getBean(DruidDataSource.class);
        System.out.println(dataSource3);

        System.out.println("---------");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

    }
}
