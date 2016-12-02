package com.gr.jiang.project.logger;

import com.gr.jiang.project.logger.base.FinLogBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by jiang on 2016/10/18.
 */
public class FinITFLog {
    private static FinLogBase finLogBase = new FinLogBase();
    static{
        Logger logger = LogManager.getLogger("reqLogger");
        finLogBase.setLogger(logger);
    }
    public static void trace(String msg){
        finLogBase.trace(msg);
    }
    public static void trace(String msg,Throwable throwable){
        finLogBase.trace(msg,throwable);
    }
    public static void debug(String msg){
        finLogBase.debug(msg);
    }
    public static void debug(String msg,Throwable throwable){
        finLogBase.debug(msg,throwable);
    }
    public static void info(String msg){
        finLogBase.info(msg);
    }
    public static void info(String msg,Throwable throwable){
        finLogBase.info(msg,throwable);
    }
    public static void warn(String msg){
        finLogBase.warn(msg);
    }
    public static void warn(String msg,Throwable throwable){
        finLogBase.warn(msg,throwable);
    }
    public static void error(String msg){
        finLogBase.error(msg);
    }
    public static void error(String msg,Throwable throwable){
        finLogBase.error(msg,throwable);
    }
}
