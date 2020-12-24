package com.cloud.fegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xueweidong
 * @date 2020/12/21
 * @description
 */
@FeignClient(value = "cloud-client")
public interface TestCloudInterface {

    /**
     * 测试fegin接口
     *
     * @return
     */
    @RequestMapping(value = "/test/main", method = {RequestMethod.GET})
    String test();

    /**
     * 测试fegin接口
     *
     * @return
     */
    @RequestMapping(value = "/test/notExist", method = {RequestMethod.GET})
    String testNotExist();
}
