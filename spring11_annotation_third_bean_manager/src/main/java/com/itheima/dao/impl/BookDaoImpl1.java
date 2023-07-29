package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

// @Component("bookDao")  // @Component代表<bean标签，"bookDao"代表id="bookDao"，
@Repository("bookDao1")
@Scope
public class BookDaoImpl1 implements BookDao {

    public void save() {
        System.out.println("book dao1 save...");

    }

    // bean被创建之后的操作卸载这个函数体里面
    @PostConstruct
    public void init(){
        System.out.println("bookDao1 init...");
    }

    // bean被销毁之前的操作写下这个函数体里面
    @PreDestroy
    public void destroy(){
        System.out.println("bookDao1 destroy...");
    }

}
