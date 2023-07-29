package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class ProjectAdvice {
    // 匹配业务层的所有方法
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")  // 指出切入点在哪里，省略包名，方法名以up开头的方法，不推荐直接用..省略包，推荐使用.*.*.*.省略包
    private void servicePt(){}

    @Before("ProjectAdvice.servicePt()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice 执行了");
    }

    @After("ProjectAdvice.servicePt()")
    public void after(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice 执行了");
    }

    @Around("ProjectAdvice.servicePt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        // 这里的args就是proceed()的参数，不传的话编译器会自己传，传的话就用用户传的，
        // 这个地方就可以做文章了，如果传过来的参数不符合要求，那么就修改成默认的值（这是AOP的一种用处）：
        // args[0] = 0;
        Object ret = pjp.proceed(args);  // 如果把这句代码放入try-catch中，也是可以拿到异常的
        return ret;
    }

    @AfterReturning(value = "servicePt()", returning = "ret")  // 给一个函数参数来接收返回值
    public void afterReturning(JoinPoint jt, Object ret){  // 这里的函数参数中如果有JoinPoint jt，他必须放在第一位 -- 这里写JoinPoint jt参数就是为了说明这一点
        System.out.println("afterReturning 执行了，拿到了返回值："+ret);
    }

    @AfterThrowing(value = "ProjectAdvice.servicePt()", throwing = "t")
    public void afterThrowing(Throwable t){  // 给一个函数参数来接收抛出的异常
        System.out.println("afterReturning 执行了，拿到了异常值："+t);
    }
}
