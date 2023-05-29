package com.hins.action;

import com.hins.dio.ScmStoreDIO;
import com.hins.mybatis.model.ScmStore;
import com.hins.query.ScmStoreQuery;
import com.hins.service.ScmStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author PanHao
 * @date 2023/5/29 13:56
 */
@RestController
public class TestAction {
    @Autowired
    private ScmStoreService scmStoreService;

    @RequestMapping("/test")
    public String getNumber() {
        ScmStoreQuery query = new ScmStoreQuery();
        query.setId(106758874L);
        ScmStore byKey = scmStoreService.findByKey(query);
        return byKey.toString();

    }

    @RequestMapping("/deduction")
    public String setNumber(@RequestParam("number") BigDecimal number) {
        ScmStoreDIO scmStoreDIO = new ScmStoreDIO();
        scmStoreDIO.setDeductionAmount(number);
        scmStoreDIO.setId(106758874L);
        scmStoreService.lockSotckNumber(scmStoreDIO);
        return "ok";

    }
}
