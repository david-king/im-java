package com.yaoshuo.user.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserServerController {

    @Value("${server.port}")
    private String port;

    @GetMapping("user/server/test")
    public Map test() {
        Map map = new HashMap();
        map.put("port", port);
        return map;
    }

}
