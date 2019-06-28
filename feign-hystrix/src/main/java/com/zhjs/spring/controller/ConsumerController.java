package com.zhjs.spring.controller;

import com.zhjs.spring.feign.FeignRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConsumerController
 * @author: zhjs
 * @createDate: 2019/6/27 下午2:29
 * @JDK: 1.8
 * @Desc: TODO
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private FeignRemote feignRemote;

    @RequestMapping("/hello")
    public String index(@RequestParam("name") String name) {
        return feignRemote.hello(name);
    }
}
