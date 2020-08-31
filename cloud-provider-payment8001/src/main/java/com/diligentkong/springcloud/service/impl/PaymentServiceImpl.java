package com.diligentkong.springcloud.service.impl;

import com.diligentkong.springcloud.dao.PaymentDao;
import com.diligentkong.springcloud.entities.Payment;
import com.diligentkong.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author diligentkong
 * @date 2020/8/7 0007 10:59
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
