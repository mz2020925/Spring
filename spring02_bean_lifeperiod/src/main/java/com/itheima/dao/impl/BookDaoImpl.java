package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save...");
    }

    // 表示bean初始化对应的操作, 需要在配置文件中配置说明这个方法是bean初始化对应的操作
    public void init(){
        System.out.println("dao init...");
    }

    // 表示bean销毁前对应的操作, 需要在配置文件中配置说明这个方法是bean销毁对应的操作
    public void destroy(){
        System.out.println("dao destroy...");
    }
}
