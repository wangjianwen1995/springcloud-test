package com.sxdl.springcloud;


import com.sxdl.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain8002 {
    public static void main(String[] args) throws Exception  {
        ConfigurableApplicationContext context =  SpringApplication.run(OrderMain8002.class,args);
        ConfigurableEnvironment environment = context.getEnvironment();
        String prot = environment.getProperty("server.port");
        InetAddress inetAddress=InetAddress.getLocalHost();
        String ip=inetAddress.getHostAddress();//获得本机Ip
        System.out.println("http://"+ip+":"+prot);
    }

}


