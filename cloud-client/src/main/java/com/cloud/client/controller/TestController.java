package com.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xueweidong
 * @date 2020/12/21
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private Integer port;

    @RequestMapping(value = "/main", method = {RequestMethod.GET, RequestMethod.POST})
    public String test() {
        return "服务:" + name + " 端口:" + port;
    }
}
