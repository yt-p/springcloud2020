package com.yt.springcloud.controller;

import com.yt.springcloud.entities.CommonResult;
import com.yt.springcloud.entities.Payment;
import com.yt.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description:
 * @Auther: yt
 * @Date: 2020/7/19 0019 22:23
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果："+result);
        if(result>0){
            return new CommonResult(200, "数据库插入成功！",result);
        }else{
            return new CommonResult(444, "数据库插入失败！",result);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果："+payment);
        if(payment!=null){
            return new CommonResult(200, "查询成功！",payment);
        }else{
            return new CommonResult(444, "没有对应记录，查询id+！"+id,null);
        }
    }
}
