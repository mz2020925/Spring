package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 此方法代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    // 此方法返回：上面的方法返回的对象是什么类型的
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    /*
    * 使用这个类和使用UserDaoFactory类两种模式有社么区别吗？
    * 使用这个类的时候，配置容器就会简单。
    *
    * */

    // @Override
    // public boolean isSingleton() {
    //     return false;
    // }
}
