package com.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @author: luzhiqiang
 * @date: 2022年07月25日
 * @Version: 1.0
 */
@Service(version = "1.0",interfaceClass = IDemoService.class)
@Component
public class DemoServiceImpl implements IDemoService{
    @Override
    public String say(String name ){
        return "hi ! ~ " + name;
    }
}
