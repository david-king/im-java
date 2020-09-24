package com.yaoshuo.user.client.fallback;

import com.yaoshuo.user.client.clients.UserServerClients;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserFeignFallback implements UserServerClients {
    @Override
    public Map test() {
        Map map = new HashMap();
        map.put("msg", "失败！");
        return map;
    }
}
