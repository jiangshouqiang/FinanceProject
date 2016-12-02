package com.gr.jiang.project.logger.base;


import org.apache.logging.log4j.Logger;

/**
 * Created by jiang on 2016/10/18.
 */
public class FinLogBase {
    public static Logger logger ;

    public void setLogger(final Logger logger) {
        this.logger = logger;
    }
    public void trace(String msg){
        logger.trace(msg);
    }
    public void trace(String msg,Throwable throwable){
        logger.trace(msg,throwable);
    }
    public void debug(String msg){
        logger.trace(msg);
    }
    public void debug(String msg,Throwable throwable){
        logger.trace(msg,throwable);
    }
    public void info(String msg){
        logger.info(msg);
    }
    public void info(String msg,Throwable throwable){
        logger.info(msg,throwable);
    }
    public void warn(String msg){
        logger.warn(msg);
    }
    public void warn(String msg , Throwable throwable){
        logger.warn(msg,throwable);
    }
    public void error(String msg , Throwable throwable){
        logger.error(msg,throwable);
    }
    public void error(String msg){
        logger.error(msg);
    }
}
