package com.hins.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author ph
 */
public class TestCase {
    public static void main(String[] args) {
        ServiceLoader<Search> loader = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = loader.iterator();
        while (iterator.hasNext()){
            Search search = iterator.next();
            search.find("test");
        }

    }
}
