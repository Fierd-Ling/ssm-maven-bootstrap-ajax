package com.hand.page.controller;

import com.github.pagehelper.PageInfo;
import com.hand.page.pojo.Excel;
import com.hand.page.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: ZhongLingYun
 * @date: 2018/8/21 18:45
 * @description: excel 控制器
 */
@Controller
@RequestMapping(value = "/excel")
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public
    @ResponseBody
    PageInfo<Excel> pageExcel(Integer page) {
        // 可以返回map 页面通过map.key获取value
        return excelService.listExcel(page);
    }


}
