package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.OrderDao;
import com.itheima.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        // P10：通过静态工厂(静态方法)产生bean
        // 通过静态工厂的原始模式：
        // OrderDao orderDao1 = OrderDaoFactory.getOrderDao();
        // orderDao1.save();

        // 方法二、通过静态工厂的配置IoC容器的模式
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();


    }
}
