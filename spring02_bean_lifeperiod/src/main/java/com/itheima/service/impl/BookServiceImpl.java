package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao) {
        System.out.println("set...（操作优先于init操作）");
        this.bookDao = bookDao;
    }
    public void save() {
        System.out.println("book service save...");
    }

    // 表示bean初始化对应的操作,这种实现InitializingBean接口，重写afterPropertiesSet方法：
    // 这种方式不需要在配置文件中配置说明这个方法是bean初始化对应的操作
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }

    // 表示bean销毁对应的操作,这种实现DisposableBean接口，重写destroy方法：
    // 这种方式不需要在配置文件中配置说明这个方法是bean销毁对应的操作
    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

}
