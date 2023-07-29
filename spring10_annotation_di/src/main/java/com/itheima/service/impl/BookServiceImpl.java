package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Value("${jdbc_name}")  // 解决（依赖）简单数据类型注入
    private String name;

    @Autowired  // 解决（依赖）引用数据类型注入--注解说明使用自动装配，不再需要下面的setter方法
    @Qualifier("bookDao1")  // 指定注入的bean的id，就是你要注入哪个bean--注解说明使用自动装配，不再需要下面的setter方法
    private BookDao bookDao;

    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    @Override
    public void save() {
        System.out.println("book service save..."+ name);
        bookDao.save();
    }
}
