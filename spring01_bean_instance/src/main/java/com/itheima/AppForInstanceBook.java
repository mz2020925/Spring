package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook {
    public static void main(String[] args) {
        // P9：通过无参构造方法产生bean
        // 通过无参构造方法的原始模式：
        BookDao bookDao1 = new BookDaoImpl();
        bookDao1.save();

        // 方法一、通过无参构造方法的配置IoC容器的模式
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("dao4");
        bookDao.save();



    }
}
