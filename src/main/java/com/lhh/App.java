package com.lhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//声明这是一个eureka服务端
@EnableEurekaServer
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
