package com.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/12/24 17:56
 */

@FeignClient(name = "eureka-provider", fallback = FeignClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map findById(@PathVariable(name = "id") Long id);

}
