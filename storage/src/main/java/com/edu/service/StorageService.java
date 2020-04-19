package com.edu.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/19 20:47
 */

public interface StorageService {
    void decrease(Long productId, Integer count);
}
