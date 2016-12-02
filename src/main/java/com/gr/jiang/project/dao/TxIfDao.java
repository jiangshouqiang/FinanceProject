package com.gr.jiang.project.dao;

import com.gr.jiang.project.po.impl.TxIfPo;

/**
 * 查询请求URL权限是否合法
 * Created by jiang on 2016/10/21.
 */
public interface TxIfDao {
    /**
     *
     * @param url 请求URL
     * @return
     */
    public TxIfPo query(String url);
}
