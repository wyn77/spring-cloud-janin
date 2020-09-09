package com.example.springcloudconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * name 为product项目中application.yml配置文件中的application.name
 * path 为product项目中application.yml配置文件中的context.path
 */
@FeignClient(name = "product-server",path ="/")
@Component
public interface ProductFeign
{
    @GetMapping("product")
    String getProduct(@RequestParam("name") String name);
}
