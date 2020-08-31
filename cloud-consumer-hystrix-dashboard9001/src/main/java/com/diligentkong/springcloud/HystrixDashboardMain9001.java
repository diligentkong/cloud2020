package com.diligentkong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author diligentkong
 * @date 2020/8/21 0021 15:09
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
        public static void main(String[] args) {
            SpringApplication.run(HystrixDashboardMain9001.class,args);
        }
}
