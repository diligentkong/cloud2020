package com.diligentkong.springcloud.controller;

import com.diligentkong.springcloud.entities.CommonResult;
import com.diligentkong.springcloud.entities.Payment;
import com.diligentkong.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author diligentkong
 * @date 2020/8/7 0007 11:04
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create( Payment payment){
        int result = paymentService.create(payment);
        log.info("************插入结果："+result);
        if (result > 0) {
            return new CommonResult(200,"插入数据库成功,serverPort: "+serverPort,result);
        } else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******插入结果："+payment);
        if (payment != null){
            return new CommonResult(200,"查询成功，serverPort： "+serverPort,payment);
        } else {
            return new CommonResult(444,"没有对应记录，查询ID: "+id,null);
        }
    }
}
