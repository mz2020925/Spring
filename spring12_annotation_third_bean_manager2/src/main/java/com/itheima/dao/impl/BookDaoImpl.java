package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save...");
    }

    @PostConstruct
    public void init(){
        System.out.println("book dao init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("book dao destroy");
    }
}
