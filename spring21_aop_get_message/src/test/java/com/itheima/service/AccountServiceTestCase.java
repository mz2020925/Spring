package com.itheima.service;


import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {
    @Autowired
    private AccountService accountService;

    @Test
    public void testSelectById(){
        Account account = accountService.selectById(2);
        System.out.println(account);
    }

    @Test
    public void testSelectAll(){
        List<Account> accounts = accountService.selectAll();
        System.out.println(accounts);
    }

}
