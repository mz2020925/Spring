package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotationConfigClass {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);  // 按名称获取
        bookDao.save();

        System.out.println("---------");
        BookService bookService = ctx.getBean(BookService.class);  // 按类型获取，这时注解修饰不写("id")
        bookService.save();

    }
}
