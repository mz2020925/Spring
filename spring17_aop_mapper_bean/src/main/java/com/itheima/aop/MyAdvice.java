package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update1())")  // 指出切入点在哪里
    private void pt(){}

    @Before("pt()")  // 首先用注解告知切入到切入点的前面(方法执行前)还是后面(方法执行后)，然后通过空函数名的方式传递切入点，空函数名就是用来绑定
    public void method(){  // 通知--需要增强的共性功能
        System.out.println(System.currentTimeMillis());
    }

}
