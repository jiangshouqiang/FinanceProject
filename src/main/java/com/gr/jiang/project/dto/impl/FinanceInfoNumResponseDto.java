package com.gr.jiang.project.dto.impl;


import com.gr.jiang.project.dto.BaseResponseDto;

/**
 * Created by jiang on 16/7/9.
 */
public class FinanceInfoNumResponseDto extends BaseResponseDto {
    private int num ;

    public FinanceInfoNumResponseDto() {
    }

    public FinanceInfoNumResponseDto(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "FinanceInfoNumResponseDto{" +
                "num=" + num +
                '}';
    }
}
