package com.example.springstudy.controller;

import com.example.springstudy.domain.Test;
import com.example.springstudy.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Value("${test.name} :hello")
    private String testHello;

    @Resource
    private TestService testService;


    @GetMapping("/hello")
    public String hello() {
        return "hello world " + testHello;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
