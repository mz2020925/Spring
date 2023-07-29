package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;
import java.awt.print.Book;

public class AppForAnnotationXml {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);  // 按名称获取
        bookDao.save();

        System.out.println("---------");
        BookService bookService = ctx.getBean(BookService.class);  // 按类型获取，这时注解修饰不写("id")
        bookService.save();

    }
}
