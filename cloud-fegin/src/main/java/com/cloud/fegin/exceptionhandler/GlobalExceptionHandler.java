package com.cloud.fegin.exceptionhandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xueweidong
 * @date 2020/12/21
 * @description
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public HttpEntity<?> handle(Exception e) {
        log.error("系统异常:", e);
        return new HttpEntity<String>("系统异常");
    }
}
