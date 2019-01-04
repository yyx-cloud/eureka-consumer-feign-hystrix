package com.controller;

import com.feign.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class MovieController {

    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Resource
    UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public Map findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }

}
