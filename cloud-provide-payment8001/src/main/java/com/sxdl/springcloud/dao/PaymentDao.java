package com.sxdl.springcloud.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sxdl.springcloud.entity.Payment;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao  extends BaseMapper<Payment> {


}


