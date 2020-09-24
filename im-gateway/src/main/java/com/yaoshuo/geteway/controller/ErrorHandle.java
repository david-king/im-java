package com.yaoshuo.geteway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandle {

    @RequestMapping("/default-error")
    public String defaultErrorHandle(){
        return "这是通用错误处理返回的信息。";
    }

    @RequestMapping("/service-user-error")
    public String serviceUserErrorHandle(){
        return "这是ServiceUser服务专属的错误处理信息。";
    }

}
