package com.gr.jiang.project.restController;

import com.gr.jiang.project.dto.impl.FinanceInfoNumRequestDto;
import com.gr.jiang.project.dto.impl.FinanceInfoNumResponseDto;
import com.gr.jiang.project.logger.FinBoLog;
import com.gr.jiang.project.service.FinanceInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by jiang on 16/7/9.
 */
@RestController
public class FinanceInfoRestController {
    @Autowired
    private FinanceInfoService financeInfoService;

    @RequestMapping(value={"/financeOrganNum.do"})
    @ResponseBody
    public FinanceInfoNumResponseDto FinanceOrganNum(
            @RequestBody FinanceInfoNumRequestDto financeInfoNumRequestDto){
//        System.out.println("val = "+bean.getParameterValues("val")[0]);
//        System.out.println("print = "+financeInfoNumRequestDto);
        FinanceInfoNumResponseDto dto =// new FinanceInfoNumResponseDto();
//        dto.setNum(1);
                new FinanceInfoNumResponseDto(
                        financeInfoService.queryRowNum(financeInfoNumRequestDto.getOrgan())
                );
        FinBoLog.info(dto.toString());
        FinBoLog.warn(dto.toString());

        return dto;
    }
//    public static void main(String [] args){
//        SpringApplication.run(FinanceInfoRestController.class,args);
//    }
}
