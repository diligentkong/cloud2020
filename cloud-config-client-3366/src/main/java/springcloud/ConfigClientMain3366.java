package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author diligentkong
 * @date 2020/8/27 0027 15:34
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
        public static void main(String[] args) {
            SpringApplication.run(ConfigClientMain3366.class,args);
        }
}
