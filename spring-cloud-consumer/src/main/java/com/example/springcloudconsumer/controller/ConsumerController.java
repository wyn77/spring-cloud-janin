package com.example.springcloudconsumer.controller;

import com.example.springcloudconsumer.feign.ProductFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController
{

    @Autowired
    private ProductFeign productFeign;

    @GetMapping("consumer")
    public String getConsumer(@RequestParam("name") String name)
    {
        return productFeign.getProduct(name);
    }
}
