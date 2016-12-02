package com.gr.jiang.project.dao.impl;

import com.gr.jiang.project.dao.FinanceInfoDao;
import com.gr.jiang.project.db.MysqlBaseDB;
import com.gr.jiang.project.po.impl.FinanceInfoPo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jiang on 16/7/9.
 */
@Repository
@Transactional
public class FinanceInfoDaoImpl extends MysqlBaseDB  implements FinanceInfoDao {
    private String queryRowNumSql = "SELECT COUNT(1) domainCount FROM FINANCEINFO WHERE ORGAN=?" ;

    @Override
    public List<FinanceInfoPo> queryFinanceInfo(int start, int limit) {
        return null;
    }

    @Override
    public int queryRowNum(String organ) {
        return getMysqlJdbcTemplate().queryForObject(queryRowNumSql,new String[]{organ},Integer.class);
//        return 23;
    }
}
