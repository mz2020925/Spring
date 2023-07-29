package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    // 匹配业务层的所有方法
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")  // 指出切入点在哪里，省略包名，方法名以up开头的方法，不推荐直接用..省略包，推荐使用.*.*.*.省略包
    private void servicePt(){}

    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {  // ProceedingJoinPoint pjp就看作待会要被增强的方法
        Signature signature = pjp.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("业务层接口 "+className+" 的方法 "+methodName+" 的10次执行时间："+(end-start)+"ms");
    }
}
