package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public List<Account> selectAll() {
        return accountDao.selectAll();
    }

    @Override
    public Account selectById(Integer id) {
        if(true){  // 这里故意抛出一个异常，用来给ProjectAdvice类中的函数afterThrowing()拿到
            throw new NullPointerException();
        }
        return accountDao.selectById(id);
    }
}
