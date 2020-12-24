package com.cloud.fegin.controller;

import com.cloud.fegin.service.TestCloudInterface;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    TestCloudInterface testCloudInterface;

    @RequestMapping(value = "/main", method = {RequestMethod.GET, RequestMethod.POST})
    public String test() {
        System.out.println("服务:" + name + " 端口:" + port);
        return testCloudInterface.test();
    }

    @RequestMapping(value = "/notExist", method = {RequestMethod.GET, RequestMethod.POST})
    public String notExist() {
        return testCloudInterface.testNotExist();
    }
}
