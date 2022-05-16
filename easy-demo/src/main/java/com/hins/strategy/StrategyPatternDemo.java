package com.hins.strategy;

/**
 * 策略模式功能演示类
 *
 * @author PanHao
 * @date 2022/5/16 14:56
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {

        Context contextOne = new Context(new OptionOne());
        System.out.println(contextOne.executeStrategy(22, 10));
        System.out.println("=========================================");
        Context contextTwo = new Context(new OptionTwo());
        System.out.println(contextTwo.executeStrategy(22, 10));
        System.out.println("=========================================");
        Context contextThree = new Context(new OptionThree());
        System.out.println(contextThree.executeStrategy(22, 10));
        System.out.println("=========================================");


    }
}
