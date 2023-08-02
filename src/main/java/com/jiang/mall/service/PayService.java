package com.jiang.mall.service;

import java.math.BigDecimal;

/**
 * @author jiang
 * @create 2023-07-29 17:59
 */
public interface PayService {
    /*创建支付，或者发起支付*/
    void create(String orderId, BigDecimal amount);
}
