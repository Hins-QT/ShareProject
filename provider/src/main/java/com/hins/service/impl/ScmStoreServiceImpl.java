package com.hins.service.impl;

import com.hins.dio.ScmStoreDIO;
import com.hins.mybatis.mapper.ScmStoreMapper;
import com.hins.mybatis.model.ScmStore;
import com.hins.query.ScmStoreQuery;
import com.hins.service.ScmStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author PanHao
 * @date 2023/5/29 15:20
 */
@Service
public class ScmStoreServiceImpl implements ScmStoreService {
    @Autowired
    private ScmStoreMapper scmStoreMapper;

    @Override
    public void lockSotckNumber(ScmStoreDIO scmStoreDIO) {
        scmStoreMapper.lockSotckNumber(scmStoreDIO);
    }

    @Override
    public ScmStore findByKey(ScmStoreQuery query) {
        return scmStoreMapper.findByKey(query);
    }

    @Override
    public void updateSotckNumber(ScmStoreDIO scmStoreDIO) {

    }
}
