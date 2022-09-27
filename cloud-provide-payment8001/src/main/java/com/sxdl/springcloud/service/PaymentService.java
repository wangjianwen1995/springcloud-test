package com.sxdl.springcloud.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxdl.springcloud.dao.PaymentDao;
import com.sxdl.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService  extends ServiceImpl<PaymentDao, Payment> {

    @Autowired
    private PaymentDao paymentDao;



}
