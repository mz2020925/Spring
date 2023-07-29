package com.itheima.service.impl;

import com.itheima.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save...");
    }
}
