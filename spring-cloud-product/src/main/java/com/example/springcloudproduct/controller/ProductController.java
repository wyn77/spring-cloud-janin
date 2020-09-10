package com.example.springcloudproduct.controller;

import com.example.springcloudentity.entity.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProductController
{

    @Value("${data.env}")
    private String env;

    @GetMapping("product")
    public String getProduct()
    {
        Product product = new Product();
        product.setName(env);
        return product.toString();
    }
}
