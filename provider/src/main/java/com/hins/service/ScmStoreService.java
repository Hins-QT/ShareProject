package com.hins.service;

import com.hins.dio.ScmStoreDIO;
import com.hins.mybatis.model.ScmStore;
import com.hins.query.ScmStoreQuery;

/**
 * @author PanHao
 * @date 2023/5/26 15:48
 */

public interface ScmStoreService {
    /**
     * 锁定库存
     */
    void lockSotckNumber(ScmStoreDIO scmStoreDIO);

    /**
     * 扣减库存
     */
    void updateSotckNumber(ScmStoreDIO scmStoreDIO);

    /**
     * 查询
     *
     * @param query
     */
    ScmStore findByKey(ScmStoreQuery query);

}
