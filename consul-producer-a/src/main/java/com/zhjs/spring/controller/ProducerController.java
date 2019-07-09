package com.zhjs.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProducerController
 * @author: zhjs
 * @createDate: 2019/7/1 下午6:00
 * @JDK: 1.8
 * @Desc: TODO
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello consul a";
    }
}
