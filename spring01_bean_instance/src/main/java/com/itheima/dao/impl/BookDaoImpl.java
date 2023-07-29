package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

/*
* 数据层代码
* */
public class BookDaoImpl implements BookDao {
    // P9：使用无参构造方法产生bean
    public BookDaoImpl() {
        // System.out.println("book dao constructor is running...");
    }

    public void save() {
        System.out.println("book dao save...");
    }
}
