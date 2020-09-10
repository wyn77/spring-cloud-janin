package com.example.springcloudencryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudEncryptionApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringCloudEncryptionApplication.class, args);
    }

}
