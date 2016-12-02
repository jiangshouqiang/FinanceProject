package com.gr.jiang.project.logger;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

/**
 * Created by jiang on 16/9/26.
 */
public class HelloWorld {
//    static {
//        LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
//        File file = new File("/Users/jiang/Documents/workspace/Finance/src/main/webapp/WEB-INF/log4j.properties");
//        System.out.println(file.toURI());
//        context.setConfigLocation(file.toURI());
//    }
    public static void main(String [] args){
//        PropertyConfigurator.configure("src/main/webapp/WEB-INF/log4j.properties");
//        LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
//        File file = new File("/Users/jiang/Documents/workspace/Finance/src/main/webapp/WEB-INF/log4j.properties");
//        System.out.println(file.toURI());
        FinBoLog.info("Hello");
    }
}
