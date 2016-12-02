package com.gr.jiang.project.logger.base;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.RollingFileAppender;
import org.apache.logging.log4j.core.appender.rolling.SizeBasedTriggeringPolicy;
import org.apache.logging.log4j.core.appender.rolling.TriggeringPolicy;
import org.apache.logging.log4j.core.config.AppenderRef;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiang on 2016/10/15.
 */
public class JLoggerBase {
    private static LoggerContext ctx ;
    private static  Configuration config ;
    private static Map<String,String> configMap ;
    private static Layout layout ;
    static{
        ctx = (LoggerContext) LogManager.getContext(false);
        config = ctx.getConfiguration();
        configMap = handleConfig(config.getConfigurationSource());
        layout = PatternLayout.createLayout(configMap.get("Configuration.OutFileConfig.RollingFileAppender.pattern"),
                null,config,null,null,true,false,null,null);
    }
    public static void start(String logId,String fileName){
//        Appender appender = FileAppender.createAppender(
//                String.format("logs/test/"+fileName,logId),"true","false",
//                logId,null,"true","true",null,null,null,null,null,config
//        );
//        Appender appender1 = RollingFileAppender.createAppender(
//                String.format("logs/test/"+fileName,jobId),"true","false",
//                ""+jobId,null,"true","true",null,null,null,null,null,config
//        );
        TriggeringPolicy triggeringPolicy = SizeBasedTriggeringPolicy
                .createPolicy(configMap.get("Configuration.OutFileConfig.RollingFileAppender.triggeringPolicySize"));
        Appender appender = RollingFileAppender.createAppender(
                configMap.get("Configuration.OutFileConfig.RollingFileAppender.dir")+fileName,
                configMap.get("Configuration.OutFileConfig.RollingFileAppender.filePattern")+fileName+".${date:yyyyMMddHHmmssS}",
                "true",
                logId,
                configMap.get("Configuration.OutFileConfig.RollingFileAppender.bufferedIO"),
                configMap.get("Configuration.OutFileConfig.RollingFileAppender.bufferSize"),
                configMap.get("Configuration.OutFileConfig.RollingFileAppender.immediateFlush"),
                triggeringPolicy,
                null,
                layout,
                null,
                configMap.get("Configuration.OutFileConfig.RollingFileAppender.ignoreExceptions"),
                configMap.get("Configuration.OutFileConfig.RollingFileAppender.advertise"),
                configMap.get("Configuration.OutFileConfig.RollingFileAppender.advertiseURI"),
                config
        );
        appender.start();
        config.addAppender(appender);
        AppenderRef ref = AppenderRef.createAppenderRef(logId,null,null);
        AppenderRef[] refs = new AppenderRef[]{ref};
        config.getLoggerConfig(logId).addAppender(appender, null, null);
        ctx.updateLoggers();
    }
    public static void stop(String logId) {
//        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
//        final Configuration config = ctx.getConfiguration();
//        config.getAppender("" + jobId).stop();
        config.getLoggerConfig(logId).removeAppender(logId);
        config.removeLogger(logId);
        ctx.updateLoggers();
    }
    public static org.slf4j.Logger createLogger(String logId,String fileName) {
        start(logId,fileName);
        return LoggerFactory.getLogger(logId);
    }
    private static Map<String,String> handleConfig(final ConfigurationSource configurationSource){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Document document = null ;
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(configurationSource.getFile());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return getElementMapValue(document);
    }
    private static Map<String,String> getElementMapValue(Document document){
        Map<String,String> mapObject = new HashMap<>();
        setElementMapValue("",document.getChildNodes(),mapObject);
        return mapObject;
    }
    private static void setElementMapValue(String attrName, NodeList nodeList, Map map){
        if(null == nodeList || nodeList.getLength() <= 0)
            return ;
        for(int i = 0 ; i < nodeList.getLength() ; i ++){
            org.w3c.dom.Node node = nodeList.item(i);
            String attrNm = node.getNodeName();
            if(null == attrNm || "".equals(attrNm.trim()) || attrNm.startsWith("#"))
                continue;
            int leng = node.getChildNodes().getLength() ;
            if(leng <=1) {
                System.out.println(node.getNodeName());
                if(leng == 1)
                    map.put(attrName + "." + node.getNodeName(), node.getFirstChild().getNodeValue().trim());
                else
                    map.put(attrName + "." + node.getNodeName(), node.getAttributes().item(0).getTextContent());
            }
            else{
                if(null != attrName && !"".equals(attrName))
                    setElementMapValue(attrName+"."+node.getNodeName(),node.getChildNodes(),map);
                else
                    setElementMapValue(node.getNodeName(),node.getChildNodes(),map);
            }
        }
    }
}
