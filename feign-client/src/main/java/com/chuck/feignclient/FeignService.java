package com.chuck.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client1")
public interface FeignService {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    String callTheMethodOfClientOne(@RequestParam(value = "name") String name);
}
