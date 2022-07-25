package com.dubbo.consumer.controller;

import com.dubbo.provider.service.IDemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: luzhiqiang
 * @date: 2022年07月25日
 * @Version: 1.0
 */
@RestController
@RequestMapping("/demo")
public class DemoContorller  {
    @Reference(version = "1.0")
    IDemoService demoService;

    @GetMapping("/say")
    public String say(){
        return demoService.say("xxoo");
    }
    
}
