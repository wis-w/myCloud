package com.edu.service.impl;

import com.edu.dao.AccountDao;
import com.edu.service.AccountService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/20 20:43
 */
@Service
public class AccountServiceImpl  implements AccountService {
    @Resource
    AccountDao accountDao;

    @Value("${server.port}")
    private String serverPort;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        accountDao.decrease(userId, money);
        System.out.println(serverPort+"+++++++++++++++++");

    }
}
