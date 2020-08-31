package com.diligentkong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author diligentkong
 * @date 2020/8/10 0010 14:24
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
        public static void main(String[] args) {

            SpringApplication.run(EurekaMain7002.class,args);
        }

}
