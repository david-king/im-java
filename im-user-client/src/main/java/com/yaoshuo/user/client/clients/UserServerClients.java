package com.yaoshuo.user.client.clients;

import com.yaoshuo.user.client.fallback.UserFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(value = "user-server", fallback = UserFeignFallback.class)
public interface UserServerClients {

    @GetMapping("user/server/test")
    Map test();

}
