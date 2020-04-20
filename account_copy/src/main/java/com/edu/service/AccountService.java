package com.edu.service;


import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/20 20:40
 */
public interface AccountService {
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
