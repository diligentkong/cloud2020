package com.diligentkong.springcloud.controller;

import com.diligentkong.springcloud.entities.CommonResult;
import com.diligentkong.springcloud.entities.Payment;
import com.diligentkong.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author diligentkong
 * @date 2020/8/14 0014 15:06
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        // 80 通过Feign调用8001,8002，因此Feign中的接口与8001,8002中的一致
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {

        //openfeign-ribbon 客户端默认等待一秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
