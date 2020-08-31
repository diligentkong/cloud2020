package com.diligentkong.springcloud.service;

import com.diligentkong.springcloud.entities.CommonResult;
import com.diligentkong.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author diligentkong
 * @date 2020/8/14 0014 15:02
 */
@Component
//调用的是哪一个微服务
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    // 与payment 8001 8002中controller里面的方法一致
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment>  getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

}
