package com.gr.jiang.project.po.impl;


import com.gr.jiang.project.po.BasePo;

/**
 * Created by jiang on 16/7/9.
 */
public class FinanceInfoPo extends BasePo {
    private long financeId ;
    private String domain ;
    private String organ ;
    private String finName;
    private String proBate;
    private String userNUM ;
    private String beginAmt;
    private String proCycle;
    private String ProSize;
    private String allAmt;
    private String canAmt;
    private String buyButton;
    private String buyUrl;
    private String proFlag;
    private String fromUrl;
    private String process;
    private String HaStr;
    private String creDt;
    private String creTm;
    private String tmSmp;

    public FinanceInfoPo(long financeId, String domain, String organ, String finName, String proBate, String userNUM, String beginAmt, String proCycle, String proSize, String allAmt, String canAmt, String buyButton, String buyUrl, String proFlag, String fromUrl, String process, String haStr, String creDt, String creTm, String tmSmp) {
        this.financeId = financeId;
        this.domain = domain;
        this.organ = organ;
        this.finName = finName;
        this.proBate = proBate;
        this.userNUM = userNUM;
        this.beginAmt = beginAmt;
        this.proCycle = proCycle;
        ProSize = proSize;
        this.allAmt = allAmt;
        this.canAmt = canAmt;
        this.buyButton = buyButton;
        this.buyUrl = buyUrl;
        this.proFlag = proFlag;
        this.fromUrl = fromUrl;
        this.process = process;
        HaStr = haStr;
        this.creDt = creDt;
        this.creTm = creTm;
        this.tmSmp = tmSmp;
    }

    public FinanceInfoPo() {
    }

    public String getBuyButton() {
        return buyButton;
    }

    public void setBuyButton(String buyButton) {
        this.buyButton = buyButton;
    }

    public long getFinanceId() {
        return financeId;
    }

    public void setFinanceId(long financeId) {
        this.financeId = financeId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getFinName() {
        return finName;
    }

    public void setFinName(String finName) {
        this.finName = finName;
    }

    public String getProBate() {
        return proBate;
    }

    public void setProBate(String proBate) {
        this.proBate = proBate;
    }

    public String getUserNUM() {
        return userNUM;
    }

    public void setUserNUM(String userNUM) {
        this.userNUM = userNUM;
    }

    public String getBeginAmt() {
        return beginAmt;
    }

    public void setBeginAmt(String beginAmt) {
        this.beginAmt = beginAmt;
    }

    public String getProCycle() {
        return proCycle;
    }

    public void setProCycle(String proCycle) {
        this.proCycle = proCycle;
    }

    public String getProSize() {
        return ProSize;
    }

    public void setProSize(String proSize) {
        ProSize = proSize;
    }

    public String getAllAmt() {
        return allAmt;
    }

    public void setAllAmt(String allAmt) {
        this.allAmt = allAmt;
    }

    public String getCanAmt() {
        return canAmt;
    }

    public void setCanAmt(String canAmt) {
        this.canAmt = canAmt;
    }

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public String getProFlag() {
        return proFlag;
    }

    public void setProFlag(String proFlag) {
        this.proFlag = proFlag;
    }

    public String getFromUrl() {
        return fromUrl;
    }

    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getHaStr() {
        return HaStr;
    }

    public void setHaStr(String haStr) {
        HaStr = haStr;
    }

    public String getCreDt() {
        return creDt;
    }

    public void setCreDt(String creDt) {
        this.creDt = creDt;
    }

    public String getCreTm() {
        return creTm;
    }

    public void setCreTm(String creTm) {
        this.creTm = creTm;
    }

    public String getTmSmp() {
        return tmSmp;
    }

    public void setTmSmp(String tmSmp) {
        this.tmSmp = tmSmp;
    }

    @Override
    public String toString() {
        return "FinanceInfoPo{" +
                "financeId=" + financeId +
                ", domain='" + domain + '\'' +
                ", organ='" + organ + '\'' +
                ", finName='" + finName + '\'' +
                ", proBate='" + proBate + '\'' +
                ", userNUM='" + userNUM + '\'' +
                ", beginAmt='" + beginAmt + '\'' +
                ", proCycle='" + proCycle + '\'' +
                ", ProSize='" + ProSize + '\'' +
                ", allAmt='" + allAmt + '\'' +
                ", canAmt='" + canAmt + '\'' +
                ", buyButton='" + buyButton + '\'' +
                ", buyUrl='" + buyUrl + '\'' +
                ", proFlag='" + proFlag + '\'' +
                ", fromUrl='" + fromUrl + '\'' +
                ", process='" + process + '\'' +
                ", HaStr='" + HaStr + '\'' +
                ", creDt='" + creDt + '\'' +
                ", creTm='" + creTm + '\'' +
                ", tmSmp='" + tmSmp + '\'' +
                '}';
    }
}
