package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class AppForDruid_C3P0 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // DataSource dataSource = (DataSource) ctx.getBean("dataSource1");
        // System.out.println(dataSource);
        // DataSource dataSource2 = (DataSource) ctx.getBean("dataSource2");
        // System.out.println(dataSource2);
        DataSource dataSource3 = (DataSource) ctx.getBean("dataSource3");
        System.out.println(dataSource3);

        System.out.println("---------");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

    }
}
