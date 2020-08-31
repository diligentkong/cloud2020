package com.diligentkong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author diligentkong
 * @date 2020/8/14 0014 14:53
 */

@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
        public static void main(String[] args) {
            SpringApplication.run(OrderFeignMain80.class,args);
        }

}
