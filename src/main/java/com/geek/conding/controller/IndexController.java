package com.geek.conding.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author 张耀烽
 * @Date Created in 2020/3/31 22:10
 * @Version v1.0
 * @Description 程序自检
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @GetMapping(value = "/hello/{name}")
    public String Index(@PathVariable("name") String name) {
        return "hello" + name;
    }
}
