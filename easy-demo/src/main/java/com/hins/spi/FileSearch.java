package com.hins.spi;

import java.util.List;

public class FileSearch implements Search{
    @Override
    public List<String> find(String keyword) {
        System.out.println("文件搜索 "+keyword);
        return null;
    }
}
