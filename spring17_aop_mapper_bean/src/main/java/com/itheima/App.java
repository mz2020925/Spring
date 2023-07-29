package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.update();

        // 下面分析aop中的代理开发原理，当一个方法没有做增强的时候，就用这个方法所在的类直接创建对象
        // 当一个方法做了增强的时候，不会用这个方法所在的类直接创建对象，而是创建一个代理对象
        System.out.println(bookDao);
        System.out.println(bookDao.getClass());
    }
}
