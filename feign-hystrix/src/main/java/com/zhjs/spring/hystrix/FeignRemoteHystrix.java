package com.zhjs.spring.hystrix;

import com.zhjs.spring.feign.FeignRemote;
import org.springframework.stereotype.Component;

/**
 * @ClassName: FeignRemoteHystrix
 * @author: zhjs
 * @createDate: 2019/6/27 下午4:44
 * @JDK: 1.8
 * @Desc: TODO
 */
@Component
public class FeignRemoteHystrix implements FeignRemote {

    @Override
    public String hello(String name) {
        return "hello " +name+", this messge send failed ";
    }
}
