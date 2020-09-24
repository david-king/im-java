package com.yaoshuo.user.client.controller;

import com.yaoshuo.user.client.clients.UserServerClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserClientController {

    @Autowired
    private UserServerClients userServerClients;

    @GetMapping("user/client/test1")
    public Map test1() {
        return userServerClients.test();
    }

}
