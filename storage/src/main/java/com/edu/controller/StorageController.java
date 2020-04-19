package com.edu.controller;

import com.edu.service.StorageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/19 20:54
 */
@RestController
public class StorageController {
    @Resource
    StorageService storageService;

    @GetMapping("/hello")
    public String getHello(){
        storageService.decrease(1L, 1);
        return "success";
    }

    @RequestMapping("/decrease")
    public void decrease(@RequestParam("productId") Long productId, @RequestParam("count")Integer count){
        storageService.decrease(productId, count);
    }
}
