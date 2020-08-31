package com.diligentkong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author diligentkong
 * @date 2020/8/10 0010 13:38
 */
@SpringBootApplication
@EnableEurekaServer  // EurekaServer 服务端启动类 接受其他微服务注册进来
public class EurekaMain7001 {
        public static void main(String[] args) {
            SpringApplication.run(EurekaMain7001.class,args);
        }
}
