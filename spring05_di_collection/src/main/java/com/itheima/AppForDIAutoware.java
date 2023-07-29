package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDIAutoware {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookService = (BookDao) ctx.getBean("bookDao");
        bookService.save();
    }
}
