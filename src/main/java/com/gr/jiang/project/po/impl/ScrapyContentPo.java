package com.gr.jiang.project.po.impl;


import com.gr.jiang.project.po.BasePo;

/**
 * Created by jiang on 16/7/9.
 */
public class ScrapyContentPo extends BasePo {
    private long   contentId;
    private long   domainId;
    private String contentColumn;
    private String contentUrl;
    private String contentReUrl;
    private String contentReIsfollow;
    private String contentStartDt;
    private String contentEndDt;
    private String contentUrlFlag;
    private String contentSts;
    private String contentHandleFund;
    private String tmSmp;

    public ScrapyContentPo() {
    }

    public ScrapyContentPo(long contentId, long domainId, String contentColumn, String contentUrl, String contentReUrl, String contentReIsfollow, String contentStartDt, String contentEndDt, String contentUrlFlag, String contentSts, String contentHandleFund, String tmSmp) {
        this.contentId = contentId;
        this.domainId = domainId;
        this.contentColumn = contentColumn;
        this.contentUrl = contentUrl;
        this.contentReUrl = contentReUrl;
        this.contentReIsfollow = contentReIsfollow;
        this.contentStartDt = contentStartDt;
        this.contentEndDt = contentEndDt;
        this.contentUrlFlag = contentUrlFlag;
        this.contentSts = contentSts;
        this.contentHandleFund = contentHandleFund;
        this.tmSmp = tmSmp;
    }

    public long getContentId() {
        return contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    public long getDomainId() {
        return domainId;
    }

    public void setDomainId(long domainId) {
        this.domainId = domainId;
    }

    public String getContentColumn() {
        return contentColumn;
    }

    public void setContentColumn(String contentColumn) {
        this.contentColumn = contentColumn;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getContentReUrl() {
        return contentReUrl;
    }

    public void setContentReUrl(String contentReUrl) {
        this.contentReUrl = contentReUrl;
    }

    public String getContentReIsfollow() {
        return contentReIsfollow;
    }

    public void setContentReIsfollow(String contentReIsfollow) {
        this.contentReIsfollow = contentReIsfollow;
    }

    public String getContentStartDt() {
        return contentStartDt;
    }

    public void setContentStartDt(String contentStartDt) {
        this.contentStartDt = contentStartDt;
    }

    public String getContentEndDt() {
        return contentEndDt;
    }

    public void setContentEndDt(String contentEndDt) {
        this.contentEndDt = contentEndDt;
    }

    public String getContentUrlFlag() {
        return contentUrlFlag;
    }

    public void setContentUrlFlag(String contentUrlFlag) {
        this.contentUrlFlag = contentUrlFlag;
    }

    public String getContentSts() {
        return contentSts;
    }

    public void setContentSts(String contentSts) {
        this.contentSts = contentSts;
    }

    public String getContentHandleFund() {
        return contentHandleFund;
    }

    public void setContentHandleFund(String contentHandleFund) {
        this.contentHandleFund = contentHandleFund;
    }

    public String getTmSmp() {
        return tmSmp;
    }

    public void setTmSmp(String tmSmp) {
        this.tmSmp = tmSmp;
    }

    @Override
    public String toString() {
        return "ScrapyContentPo{" +
                "contentId=" + contentId +
                ", domainId=" + domainId +
                ", contentColumn='" + contentColumn + '\'' +
                ", contentUrl='" + contentUrl + '\'' +
                ", contentReUrl='" + contentReUrl + '\'' +
                ", contentReIsfollow='" + contentReIsfollow + '\'' +
                ", contentStartDt='" + contentStartDt + '\'' +
                ", contentEndDt='" + contentEndDt + '\'' +
                ", contentUrlFlag='" + contentUrlFlag + '\'' +
                ", contentSts='" + contentSts + '\'' +
                ", contentHandleFund='" + contentHandleFund + '\'' +
                ", tmSmp='" + tmSmp + '\'' +
                '}';
    }
}
