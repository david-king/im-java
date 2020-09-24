package com.yaoshuo.controller;

import com.yaoshuo.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private Config config;

    @RequestMapping(value = "/getTitle")
    public String getTitle() {
        return config.getTitle();
    }

}
