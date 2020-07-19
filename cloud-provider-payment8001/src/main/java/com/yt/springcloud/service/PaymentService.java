package com.yt.springcloud.service;

import com.yt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Auther: yt
 * @Date: 2020/7/19 0019 22:19
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
