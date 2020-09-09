package com.example.springcloudproduct.controller;

import com.example.springcloudentity.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{

    @GetMapping("product")
    public String getProduct(@RequestParam("name") String name)
    {
        Product product = new Product();
        product.setName(name);
        return product.toString();
    }
}
