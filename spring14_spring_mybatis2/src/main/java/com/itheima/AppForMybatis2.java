package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppForMybatis2 {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account ac = accountService.findBy(2);
        System.out.println(ac);

    }
}
