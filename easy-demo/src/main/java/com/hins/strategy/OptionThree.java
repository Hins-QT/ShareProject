package com.hins.strategy;

/**
 * @author PanHao
 * @date 2022/5/16 14:48
 */
public class OptionThree implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
