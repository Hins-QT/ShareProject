package com.hins.spi;

import java.util.List;

public class DataSearch implements Search{
    @Override
    public List<String> find(String keyword) {
        System.out.println("数据搜索 "+keyword);
        return null;
    }
}
