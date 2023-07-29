package com.itheima.service.impl;

import com.itheima.dao.BookDao;
// import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;

/*
* 业务层代码
* */
public class BookServiceImpl implements BookService {
    // 5.删除业务层中使用new的方式创建BookDaoImpl对象，因为这种方式会带来耦合，
    // 所以通过类似于getter、setter方法来传过来一个对象，从而解耦。
    // private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;
    // 6.提供setter方法来传过来一个对象，而不是像上面那样new对象。这样做之后还需要配置BookServiceImpl和BookDaoImpl的关系。
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
