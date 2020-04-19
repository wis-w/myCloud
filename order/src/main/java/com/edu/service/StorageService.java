package com.edu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/19 21:23
 */
@FeignClient(value = "storage-service")
public interface StorageService {
    @PostMapping("/decrease")
    void decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
