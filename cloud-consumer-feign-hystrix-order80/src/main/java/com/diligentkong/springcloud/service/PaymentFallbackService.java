package com.diligentkong.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author diligentkong
 * @date 2020/8/19 0019 16:43
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------------PaymentFallbackService fall back-paymentInfo_OK,哈哈哈";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----------PaymentFallbackService fall back-paymentInfo_TimeOut,呜呜呜";
    }
}
