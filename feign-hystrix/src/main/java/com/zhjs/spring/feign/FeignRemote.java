package com.zhjs.spring.feign;

import com.zhjs.spring.hystrix.FeignRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: FeignRemote
 * @author: zhjs
 * @createDate: 2019/6/27 下午2:27
 * @JDK: 1.8
 * @Desc: TODO
 */
@FeignClient(name = "eureka-client-producer",fallback = FeignRemoteHystrix.class)
public interface FeignRemote {

    @RequestMapping(value = "/producer/hello")
    String hello(@RequestParam(value = "name") String name);
}
