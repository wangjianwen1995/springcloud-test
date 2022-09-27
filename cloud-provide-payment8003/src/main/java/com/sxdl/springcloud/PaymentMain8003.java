package com.sxdl.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;

@SpringBootApplication
@EnableEurekaClient
@MapperScan({"com.sxdl.springcloud.dao"})
public class PaymentMain8003 {

    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext context = SpringApplication.run(PaymentMain8003.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        String prot = environment.getProperty("server.port");
        InetAddress inetAddress=InetAddress.getLocalHost();
        String ip=inetAddress.getHostAddress();//获得本机Ip
        System.out.println("http://"+ip+":"+prot);
    }
}