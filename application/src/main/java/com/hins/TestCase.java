package com.hins;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author PanHao
 * @date 2022/5/17 11:41
 */
public class TestCase {
    public static void main(String[] args) {
        ServiceLoader<Pay> loader = ServiceLoader.load(Pay.class);
        Iterator<Pay> iterator = loader.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
