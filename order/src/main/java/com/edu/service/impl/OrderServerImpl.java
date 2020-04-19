package com.edu.service.impl;

import com.edu.dao.OrderDao;
import com.edu.domain.Order;
import com.edu.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/19 18:15
 */
@Service
public class OrderServerImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public void create(Order order) {
        orderDao.create(order);
    }
}
