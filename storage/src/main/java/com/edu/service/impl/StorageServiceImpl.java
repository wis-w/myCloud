package com.edu.service.impl;

import com.edu.dao.StorageDao;
import com.edu.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/19 20:52
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Resource
    StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
        System.out.println("库存模块解决");
    }
}
