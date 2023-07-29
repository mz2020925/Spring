package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ctx.registerShutdownHook();
        BookDao bookDao1 = ctx.getBean("bookDao", BookDao.class);  // 按名称获取
        BookDao bookDao2 = ctx.getBean("bookDao", BookDao.class);  // 按名称获取
        // 默认单例模式，获取的两个Bean是同一个对象
        // 在BookDaoImpl实现类上面添加@Scope("prototype")可以实现非单例模式
        System.out.println(bookDao1);
        System.out.println(bookDao2);

    }
}
