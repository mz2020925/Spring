package com.itheima;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class AppForMybatis {
    public static void main(String[] args) throws IOException {
        /*
        * 1-3 是初始化SqlSessionFactory，意思就是得到一个SqlSessionFactory对象
        * */
        // 1.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2.加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 3.创建SqlSessionFactory对象，最核心的对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        //4.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 5.执行SqlSession对象（数据层操作接口对象，也可说是mapper对象）执行查询，获取结果User
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        Account account = accountDao.findById(1);  // 执行查询操作，返回封装好的的Account对象
        System.out.println(account);

        // 6.释放资源
        sqlSession.close();
    }
}
