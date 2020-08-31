package com.diligentkong.springcloud.service.imp;

import cn.hutool.core.util.IdUtil;
import com.diligentkong.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author diligentkong
 * @date 2020/8/19 0019 14:15
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池： "+Thread.currentThread().getName() + " paymentInfo_OK,id:  " + id+"\t"+"O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    @Override
    public String paymentInfo_TimeOut(Integer id) {
  /*    int timeNumber = 5;
         try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       int age = 10/0;
        return "线程池： "+Thread.currentThread().getName() + " paymentInfo_TimeOut,id:  " + id+"\t"+"┭┮﹏┭┮ 呜呜"+ "耗时";
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "我是支付服务8001， 线程池： "+Thread.currentThread().getName() + " paymentInfo_TimeOutHandler,id: "+id+"\t"+"┭┮﹏┭┮";
    }

    // ---------------服务熔断
    @Override
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")})//失败率达到多少后跳闸
    public String paymentCircuitBreaker(Integer id){
        if (id < 0){
            throw new RuntimeException("**********id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号： " + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(Integer id){
        return "id 不能为负数， 请稍后再试，呜呜---  id：" + id;
    }

}
