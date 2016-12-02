package util;

import com.gr.jiang.project.util.Enum.DateEnum;
import com.gr.jiang.project.util.DateUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by jiang on 2016/11/3.
 */
public class DateUtilTest {
    @Test
    public void testGetDate(){
        System.out.println(DateUtil.getCurrentDate(DateUtil.DATE_YYYYMMDD));
        System.out.println(DateUtil.getCurrentDate(DateUtil.DATE_YYYY_MM_DD));
        System.out.println(DateUtil.getCurrentDate(DateUtil.DATE_YYYYMMDDHHMMss));
        System.out.println(DateUtil.getCurrentDate(DateUtil.DATE_YYYYMMDDHHMMssSS));
        System.out.println(DateUtil.getCurrentDate(DateUtil.DATE_YYYY_MM_DD_HH_mm_ss));
        System.out.println(DateUtil.getCurrentDate(DateUtil.DATE_YYYY_MM_DD_HH_mm_ss_SS));
    }
    @Test
    public void testConvertDateFormatStr(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtil.DATE_YYYY_MM_DD);
        try {
            System.out.println((new SimpleDateFormat(DateUtil.DATE_YYYYMMDD).format(simpleDateFormat.parse("2016-11-02"))));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(DateUtil.convertDateFormatStr("2016-11-03",DateUtil.DATE_YYYY_MM_DD,DateUtil.DATE_YYYYMMDD));
    }
    @Test
    public void testCalculateDate(){
        System.out.println(DateUtil.calculateDate("2016-11-03",DateUtil.DATE_YYYY_MM_DD, DateEnum.DAY,1,DateUtil.DATE_YYYY_MM_DD));
    }
    @Test
    public void testCalculateYYYYMMDDDate(){
        System.out.println(DateUtil.calculateYYYYMMDDDate("20161104",DateEnum.YEAR,20));
    }
}
