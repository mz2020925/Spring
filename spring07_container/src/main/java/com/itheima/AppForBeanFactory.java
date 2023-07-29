package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        // 1.创建BeanFactory对象，使用XmlBeanFactory()这种方式创建IoC容器对象的时候并没有同时创建出Bean对象。
        // 然而，ClassPathXmlApplicationContext()创建IoC容器对象的时候默认同时创建出Bean对象，当然可以在xml文件中给bean标签添加lazy-init属性来延迟创建Bean对象。
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        // 2.获取bean
        BookDao bookDao = beanFactory.getBean("bookDao", BookDao.class);
        bookDao.save();
    }
}
