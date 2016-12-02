package com.gr.jiang.project.util;

/**
 * Created by jiang on 2016/10/31.
 */
public class StringUtil {
    public static String trimToNull(String str){
        final String ts = str == null?null:str.trim();
        return ts;
    }
}
