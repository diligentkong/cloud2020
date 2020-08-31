package com.diligentkong.springcloud;

import com.diligentkong.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author diligentkong
 * @date 2020/8/7 0007 15:54
 * 在启动该微服务的时候就能去加载我们自定义Ribbon配置类，从而使配置生效
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
        public static void main(String[] args) {
            SpringApplication.run(OrderMain80.class,args);
        }

}
