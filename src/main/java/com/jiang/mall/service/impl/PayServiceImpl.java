package com.jiang.mall.service.impl;

import com.jiang.mall.service.PayService;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;

import java.math.BigDecimal;

/**
 * @author jiang
 * @create 2023-07-29 18:02
 */
public class PayServiceImpl implements PayService {
    @Override
    public void create(String orderId, BigDecimal amount) {
        BestPayServiceImpl bestPayService = new BestPayServiceImpl();

        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId("wx3e6b9f1c5a7ff034");
        wxPayConfig.setMchId("1614433647");
        wxPayConfig.setMchId("Aa111111111122222222223333333333");
        bestPayService.setWxPayConfig(wxPayConfig);
        PayRequest payRequest = new PayRequest();
        bestPayService.pay(payRequest);
        //bestPayService.setAliPayConfig(aliPayConfig);
    }
}
