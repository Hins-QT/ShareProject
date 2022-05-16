package com.hins.strategy;

/**
 * @author PanHao
 * @date 2022/5/16 14:30
 */
public interface Strategy {
    /**
     * 策略模式方法
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);
}
