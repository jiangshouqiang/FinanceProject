package com.gr.jiang.project.util;

import com.gr.jiang.project.util.Enum.DateEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jiang on 2016/11/3.
 */
public class DateUtil {
    public static String DATE_YYYYMMDD = "yyyyMMdd";
    public static String DATE_YYYY_MM_DD = "yyyy-MM-dd";
    public static String DATE_YYYY_MM_DD_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
    public static String DATE_YYYY_MM_DD_HH_mm_ss_SS = "yyyy-MM-dd HH:mm:ss.SS";
    public static String DATE_YYYYMMDDHHMMss = "yyyyMMddHHmmss";
    public static String DATE_YYYYMMDDHHMMssSS = "yyyyMMddHHmmssSS";

    /**
     * 获取指定格式当前日期
     * @param dateFormat
     * @return
     */
    public static String getCurrentDate(String dateFormat){
        if(dateFormat == null)
            dateFormat = DATE_YYYYMMDD ;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        return simpleDateFormat.format(calendar.getTime());
    }
    public static String convertDateFormatStr(String srcdate,String srcFormat,String destFormat){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(srcFormat);
        try {
            Date date = simpleDateFormat.parse(srcdate);
            SimpleDateFormat destSimpleDateFormat = new SimpleDateFormat(destFormat);
            return destSimpleDateFormat.format(date);
        } catch (ParseException e) {
            return null;
        }
    }
    public static String calculateDate(String srcDate, String srcFormat, DateEnum dateEnum, int offset, String destFormat){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(srcFormat);
        try {
            Date date = simpleDateFormat.parse(srcDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(dateEnum.getCal(),offset);
            SimpleDateFormat destSimpleDateFormat = new SimpleDateFormat(destFormat);
            return destSimpleDateFormat.format(calendar.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null ;
    }
    public static String calculateYYYYMMDDDate(String srcDate,DateEnum dateEnum,int offset){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_YYYYMMDD);
        try {
            Date date = simpleDateFormat.parse(srcDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(dateEnum.getCal(),offset);
            SimpleDateFormat destSimpleDateFormat = new SimpleDateFormat(DATE_YYYYMMDD);
            return destSimpleDateFormat.format(calendar.getTime());
        } catch (ParseException e) {
            return null;
        }
    }

}
