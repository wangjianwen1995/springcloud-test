package com.sxdl.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix//添加到此处
public class OrderHystrixMain80 {

    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext context = SpringApplication.run(OrderHystrixMain80.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        String prot = environment.getProperty("server.port");
        InetAddress inetAddress=InetAddress.getLocalHost();
        String ip=inetAddress.getHostAddress();//获得本机Ip
        System.out.println("http://"+ip+":"+prot);
        ///就是看点击反馈数据库
        System.out.println("是佛挡杀佛");
        System.out.println("是佛挡杀佛");
        System.out.println("是佛挡杀佛");
        System.out.println("是佛挡杀佛");
        System.out.println("是佛挡杀佛");
    }

}
