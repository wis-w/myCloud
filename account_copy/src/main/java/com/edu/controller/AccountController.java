package com.edu.controller;

import com.edu.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/20 20:46
 */
@RestController
public class AccountController {
    @Resource
    AccountService accountService;

    @GetMapping("/hello")
    public String hello(){
        accountService.decrease(1L,new BigDecimal(1));
        return "lalal";
    }

    @PostMapping("/decrease")
    public String getAccount(@RequestParam("userId") long userId, @RequestParam("money")BigDecimal money){
        accountService.decrease(userId, money);
        System.out.println("金额扣减结束");
        return "hahaha";
    }

}
