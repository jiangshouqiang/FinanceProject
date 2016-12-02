package com.gr.jiang.project.dto.impl;


import com.gr.jiang.project.dto.BaseRequestDto;

/**
 * Created by jiang on 16/7/9.
 */
public class FinanceInfoNumRequestDto extends BaseRequestDto {
    private String organ;

    public FinanceInfoNumRequestDto() {
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    @Override
    public String toString() {
        return "FinanceInfoNumRequestDto{" +
                "organ='" + organ + '\'' +
                '}';
    }
}
