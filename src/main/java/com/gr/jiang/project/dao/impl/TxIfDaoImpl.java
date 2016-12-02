package com.gr.jiang.project.dao.impl;

import com.gr.jiang.project.dao.TxIfDao;
import com.gr.jiang.project.db.MysqlBaseDB;
import com.gr.jiang.project.logger.FinDebugLog;
import com.gr.jiang.project.po.impl.TxIfPo;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * Created by jiang on 2016/10/21.
 */
@Repository
@Transactional
public class TxIfDaoImpl extends MysqlBaseDB implements TxIfDao {
    /**
     * @param url 请求URL
     * @return
     */
    @Override
    public TxIfPo query(String url) {

        String sql = "select APP_ID,MOD_ID,URL,URL_DESC,TX_FLG,LOG_FLG,PWD_FLG from T_PUB_TXIF where URL=?";
        List<TxIfPo> txIfPoList = getMysqlJdbcTemplate().query(sql,new Object[]{url},txIfMapper);
        FinDebugLog.info(txIfPoList.size()+"==size");
        if(txIfPoList.size()==0)
            return null;
        return txIfPoList.get(0);
    }
    private RowMapper txIfMapper = new RowMapper() {
        @Override
        public TxIfPo mapRow(ResultSet rs, int rowNum) throws SQLException {
            TxIfPo txIfPo = new TxIfPo();
            txIfPo.setAppId(rs.getString("APP_ID"));
            txIfPo.setLogFlg(rs.getString("LOG_FLG"));
            txIfPo.setDesc(rs.getString("URL_DESC"));
            txIfPo.setModId(rs.getString("MOD_ID"));
            txIfPo.setPwdFlg(rs.getString("PWD_FLG"));
            txIfPo.setTxFlg(rs.getString("TX_FLG"));
            txIfPo.setUrl(rs.getString("URL"));
            return txIfPo;
        }
    };

}
