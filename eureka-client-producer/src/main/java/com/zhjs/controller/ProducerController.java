package com.zhjs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProducerController
 * @author: zhjs
 * @createDate: 2019/6/27 下午2:03
 * @JDK: 1.8
 * @Desc: TODO
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
}
