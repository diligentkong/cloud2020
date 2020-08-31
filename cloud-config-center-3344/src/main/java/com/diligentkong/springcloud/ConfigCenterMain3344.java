package com.diligentkong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author diligentkong
 * @date 2020/8/27 0027 14:40
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
        public static void main(String[] args) {
            SpringApplication.run(ConfigCenterMain3344.class,args);
        }
}
