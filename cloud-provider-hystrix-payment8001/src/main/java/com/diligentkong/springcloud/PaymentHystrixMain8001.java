package com.diligentkong.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author diligentkong
 * @date 2020/8/19 0019 14:12
 */

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  //对hystrix熔断机制的支持
public class PaymentHystrixMain8001 {
        public static void main(String[] args) {

            SpringApplication.run(PaymentHystrixMain8001.class,args);
        }
        /*
        *此配置是为了服务监控而配置，与服务容错本身无关，springcloud升级后的坑
        *ServletRegistrationBean因为springCloud的默认路径不是“/hystrix.stream"，
        * 只要在自己的项目配置上 下面的servlet就可以了。
        */
        @Bean
        public ServletRegistrationBean getServlet(){
            HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
            ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
            registrationBean.setLoadOnStartup(1);
            registrationBean.addUrlMappings("/hystrix.stream");
            registrationBean.setName("HystrixMetricsStreamServlet");
            return registrationBean;
        }

}
