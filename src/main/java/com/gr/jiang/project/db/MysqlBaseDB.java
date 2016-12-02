package com.gr.jiang.project.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by jiang on 16/9/18.
 */
public class MysqlBaseDB {
    private JdbcTemplate mysqlJdbcTemplate;
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.mysqlJdbcTemplate = jdbcTemplate;
    }
    public JdbcTemplate getMysqlJdbcTemplate() {
        return mysqlJdbcTemplate;
    }

//    public HibernateTemplate getHibernateTemplate() {
//        return hibernateTemplate;
//    }
//    @Autowired
//    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//        this.hibernateTemplate = hibernateTemplate;
//    }
}