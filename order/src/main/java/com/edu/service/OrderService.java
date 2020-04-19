package com.edu.service;

import com.edu.domain.Order;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/19 18:01
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
