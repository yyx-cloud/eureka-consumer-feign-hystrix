package com.feign;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/12/26 16:25
 */

@Component
public class FeignClientFallback implements UserFeignClient {
    @Override
    public Map findById(Long id) {
        Map map = new HashMap();
        map.put("error", "Hystrix Error!");
        return map;
    }
}
