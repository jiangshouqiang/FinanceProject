package com.gr.jiang.project.common.context;

import com.gr.jiang.project.util.StringUtil;

/**
 * Created by jiang on 2016/10/31.
 */
public class FinHttpRequestInfo {
    private String appId;
    private String modId;
    private String url;
    private String desc;
    private String txFlg;
    private String logFlg;
    private String pwdFlg;
    private String sip;
    private String sesId;
    private String tmSmp;

    public FinHttpRequestInfo() {
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

    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public String getSesId() {
        return sesId;
    }

    public void setSesId(String sesId) {
        this.sesId = sesId;
    }

    public String getTmSmp() {
        return tmSmp;
    }

    public void setTmSmp(String tmSmp) {
        this.tmSmp = tmSmp;
    }
    public boolean isAccess(){
        return "Y".equalsIgnoreCase(StringUtil.trimToNull(txFlg));
    }
    public boolean isPwd(){
        return "Y".equalsIgnoreCase(StringUtil.trimToNull(logFlg));
    }

    @Override
    public String toString() {
        return "FinHttpRequestInfo{" +
                "appId='" + appId + '\'' +
                ", modId='" + modId + '\'' +
                ", url='" + url + '\'' +
                ", desc='" + desc + '\'' +
                ", txFlg='" + txFlg + '\'' +
                ", logFlg='" + logFlg + '\'' +
                ", pwdFlg='" + pwdFlg + '\'' +
                ", sip='" + sip + '\'' +
                ", sesId='" + sesId + '\'' +
                ", tmSmp='" + tmSmp + '\'' +
                '}';
    }
}
