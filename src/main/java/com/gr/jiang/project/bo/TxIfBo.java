package com.gr.jiang.project.bo;

import com.gr.jiang.project.po.impl.TxIfPo;

/**
 * Created by jiang on 2016/10/24.
 */
public interface TxIfBo {
    /**
     * 查询URL配置信息
     * @param url
     * @return
     */
    TxIfPo query(String url);
}
