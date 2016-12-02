package com.gr.jiang.project.util.Enum;

import java.util.Calendar;

/**
 * Created by jiang on 2016/11/3.
 */
public enum DateEnum {
    YEAR(Calendar.YEAR),
    MONTH(Calendar.MONTH),
    DAY(Calendar.DAY_OF_YEAR);

    int cal ;
    DateEnum(final int cal) {
        this.cal = cal ;
    }
    public int getCal(){
        return cal;
    }
}
