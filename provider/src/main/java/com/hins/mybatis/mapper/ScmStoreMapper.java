package com.hins.mybatis.mapper;

import com.hins.dio.ScmStoreDIO;
import com.hins.mybatis.model.ScmStore;
import com.hins.query.ScmStoreQuery;

import java.math.BigDecimal;

public interface ScmStoreMapper {
    int insert(ScmStore record);


    int insertSelective(ScmStore record);

    ScmStore findByKey(ScmStoreQuery query);

    int lockSotckNumber(ScmStoreDIO scmStoreDIO);

    int updateSotckNumber(ScmStoreDIO scmStoreDIO);


}