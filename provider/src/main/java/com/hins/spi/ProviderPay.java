package com.hins.spi;

import com.hins.Pay;

/**
 * @author PanHao
 * @date 2022/5/17 11:38
 */
public class ProviderPay implements Pay {
    @Override
    public String doPay() {
        return "this is ProviderPay";
    }
}
