package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.*.*.BookDao.update())")  // 指出切入点在哪里，省略包名，方法名以up开头的方法，不推荐直接用..省略包，推荐使用.*.*.*.省略包
    private void pt(){}

    // @Before("pt()")  // 首先用注解告知切入到切入点的前面(方法执行前)还是后面(方法执行后)，然后通过空函数名的方式传递切入点，空函数名就是用来绑定
    // public void beforeMethod(){  // 通知--需要增强的共性功能
    //     System.out.println(System.currentTimeMillis());
    // }

    // @After("pt()")  // 首先用注解告知切入到切入点的前面(方法执行前)还是后面(方法执行后)，然后通过空函数名的方式传递切入点，空函数名就是用来绑定
    // public void afterMethod(){  // 通知--需要增强的共性功能
    //     System.out.println(System.currentTimeMillis());
    // }

    @Around("pt()")  // 前后都切入增强代码，并把返回值接收、转发出去
    public Object aroundStrength(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(System.currentTimeMillis());
        // 表示原始代码的执行
        Object obj = pjp.proceed();
        System.out.println(System.currentTimeMillis());
        return obj;
    }

    // @AfterReturning("pt()")  // 当增强内容没有抛异常才会被执行
    // public void afterReturningMethod(){
    //     System.out.println("AfterReturning");
    // }

    // @AfterThrowing("pt()")  // 当增强内容抛异常才会被执行
    // public void afterThrowingMethod(){
    //     System.out.println("AfterThrowing");
    // }



}
