package com.edu.dao;

import com.edu.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/19 17:52
 */
@Mapper
public interface OrderDao {
    void create(Order order);

    int updata(@Param("userId") Long id, @Param("status") Integer status);
}
