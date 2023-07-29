package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
        // P11：通过实例工厂(非静态方法)产生bean
        // 通过实例工厂(非静态方法)的原始模式：
        // UserDaoFactory userDaoFactory = new UserDaoFactory();  // 创建实例工厂对象
        // UserDao userDao = userDaoFactory.getUserDao();  // 通过实例工厂对象创建对象
        // userDao.save();

        // 方法三通过实例工厂(非静态方法)的配置IoC容器的模式
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        // userDao1.save();

        // 方法四、使用FactoryBean获取Bean对象
        UserDao userDao2 = (UserDao) ctx.getBean("userDao2");
        userDao2.save();


    }
}
