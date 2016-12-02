package com.gr.jiang.project.bo.impl;

import com.gr.jiang.project.bo.TxIfBo;
import com.gr.jiang.project.dao.TxIfDao;
import com.gr.jiang.project.po.impl.TxIfPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jiang on 2016/10/24.
 */
@Component
public class TxIfBoImpl implements TxIfBo {
    @Autowired
    private TxIfDao txIfDao ;
    /**
     * 查询URL配置信息
     *
     * @param url
     * @return
     */
    @Override
    public TxIfPo query(String url) {
        return txIfDao.query(url);
    }
}
