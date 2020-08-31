package com.diligentkong.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author diligentkong
 * @date 2020/8/19 0019 14:13
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);
    public String paymentCircuitBreaker(Integer id);
}
