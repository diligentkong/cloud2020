package com.diligentkong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author diligentkong
 * @date 2020/8/26 0026 17:17
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
        public static void main(String[] args) {
            SpringApplication.run(GateWayMain9527.class,args);
        }

}
