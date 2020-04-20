package com.edu.controller;

import com.edu.domain.Order;
import com.edu.service.AccountService;
import com.edu.service.OrderService;
import com.edu.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/19 17:17
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @Resource
    StorageService storageService;

    @Resource
    AccountService accountService;

    @GetMapping("/hello")
    public String hello(){
//        Order order = new Order(1L, 1L, 1L, 1, new BigDecimal(0), 1);
//        orderService.create(order);
//        storageService.decrease(1L,1);
        accountService.decrease(1L, new BigDecimal(1));
        return "hello";
    }

    @GetMapping("/test")
    public String test(){
        return "hello";
    }

}
