package com.yt.springcloud.service.impl;

import com.yt.springcloud.dao.PaymentDao;
import com.yt.springcloud.entities.Payment;
import com.yt.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Auther: yt
 * @Date: 2020/7/19 0019 22:20
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
