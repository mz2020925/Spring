package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifePeriod {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();  // 关闭IoC容器的方式二，注册“钩子”：你要关闭java虚拟机之前先关闭我new的这个容器。相当于一种“链接”功能

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        // ctx.close();  // 关闭IoC容器的方式一，暴力使用代码关闭

    }
}
