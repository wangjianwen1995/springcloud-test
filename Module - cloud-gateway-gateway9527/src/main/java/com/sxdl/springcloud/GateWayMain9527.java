package com.sxdl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;

@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext context = SpringApplication.run(GateWayMain9527.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        String prot = environment.getProperty("server.port");
        InetAddress inetAddress=InetAddress.getLocalHost();
        String ip=inetAddress.getHostAddress();//获得本机Ip
        System.out.println("http://"+ip+":"+prot);
    }
}
