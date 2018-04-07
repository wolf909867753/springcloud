package com.wolf.service;

import com.wolf.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @FeignClient(value = "service-hi",configuration = FeignConfig.class)
 * value为调用其他服务的名称，FeignConfig.class为FeignClient的配置文件
 */
//@FeignClient(value = "service-client")
@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
