package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

// @Component("bookDao")  // @Component代表<bean标签，"bookDao"代表id="bookDao"，
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String, Integer> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("book dao save...");
        System.out.println("遍历数组: " + Arrays.toString(array));
        System.out.println("遍历List: " + list);
        System.out.println("遍历Set: " + set);
        System.out.println("遍历Map: " + map);
        System.out.println("遍历Properties: " + properties);

    }
}
