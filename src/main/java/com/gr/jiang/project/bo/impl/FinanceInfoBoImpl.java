package com.gr.jiang.project.bo.impl;

import com.gr.jiang.project.bo.FinanceInfoBo;
import com.gr.jiang.project.dao.FinanceInfoDao;
import com.gr.jiang.project.po.impl.FinanceInfoPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jiang on 16/7/9.
 */
@Component
public class FinanceInfoBoImpl implements FinanceInfoBo {
    @Autowired
    private FinanceInfoDao financeInfoDao;
    @Override
    public List<FinanceInfoPo> queryFinanceInfo(int start, int limit) {
        return null;
    }

    @Override
    public int queryRowNum(String organ) {
        return financeInfoDao.queryRowNum(organ);
    }
}
