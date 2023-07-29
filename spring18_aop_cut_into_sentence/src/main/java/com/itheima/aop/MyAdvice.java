package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    // @Pointcut("execution(void com.itheima.dao.BookDao.update())")  // 指出切入点在哪里,可以指接口
    // private void pt(){}

    //  @Pointcut("execution(void com.itheima.dao.impl.BookDaoImpl.update())")  // 指出切入点在哪里，也可以指接口的实现类，不推荐这种
    // private void pt(){}



    //  @Pointcut("execution(* com.itheima.dao.BookDao.update())")  // 指出切入点在哪里，使用通配符*
    // private void pt(){}

    @Pointcut("execution(void com..BookDao.up*())")  // 指出切入点在哪里，省略包名，方法名以up开头的方法，不推荐直接用..省略包，推荐使用.*.*.*.省略包
    private void pt(){}

    @Before("pt()")  // 首先用注解告知切入到切入点的前面(方法执行前)还是后面(方法执行后)，然后通过空函数名的方式传递切入点，空函数名就是用来绑定
    public void method(){  // 通知--需要增强的共性功能
        System.out.println(System.currentTimeMillis());
    }

    /**
     * 下面是常用的AOP写法，同时给多个方法添加AOP
     */
    // @Pointcut("execution(* com.itheima.*.*Serivce.save*(..))")  // 指出切入点在哪里，*Service接口下的所有save*方法添加增强
    // private void pt(){}

    // @Pointcut("execution(* com.itheima.*.*Serivce.getBy*(..))")  // 指出切入点在哪里，*Service接口下的所有getBy*方法添加增强
    // private void pt(){}
}
