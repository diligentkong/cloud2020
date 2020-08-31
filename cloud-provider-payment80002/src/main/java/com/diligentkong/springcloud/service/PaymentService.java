package com.diligentkong.springcloud.service;

import com.diligentkong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author diligentkong
 * @date 2020/8/7 0007 10:58
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
