package com.gr.jiang.project.po.impl;

import com.gr.jiang.project.po.BasePo;
import com.sun.jmx.snmp.Timestamp;

/**
 * Created by jiang on 2016/10/21.
 */
public class TxIfPo extends BasePo {
    private String appId;
    private String modId;
    private String url;
    private String desc;
    private String txFlg;
    private String logFlg;
    private String pwdFlg;
    private String tmSmp;

    public TxIfPo() {
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTxFlg() {
        return txFlg;
    }

    public void setTxFlg(String txFlg) {
        this.txFlg = txFlg;
    }

    public String getLogFlg() {
        return logFlg;
    }

    public void setLogFlg(String logFlg) {
        this.logFlg = logFlg;
    }

    public String getPwdFlg() {
        return pwdFlg;
    }

    public void setPwdFlg(String pwdFlg) {
        this.pwdFlg = pwdFlg;
    }

    public String getTmSmp() {
        return tmSmp;
    }

    public void setTmSmp(String tmSmp) {
        this.tmSmp = tmSmp;
    }

    @Override
    public String toString() {
        return "TxIfPo{" +
                "appId='" + appId + '\'' +
                ", modId='" + modId + '\'' +
                ", url='" + url + '\'' +
                ", desc='" + desc + '\'' +
                ", txFlg='" + txFlg + '\'' +
                ", logFlg='" + logFlg + '\'' +
                ", pwdFlg='" + pwdFlg + '\'' +
                ", tmSmp=" + tmSmp +
                '}';
    }
}
