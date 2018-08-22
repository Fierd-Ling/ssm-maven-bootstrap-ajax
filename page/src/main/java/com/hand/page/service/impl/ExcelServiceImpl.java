package com.hand.page.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.page.mapper.ExcelMapper;
import com.hand.page.pojo.Excel;
import com.hand.page.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ZhongLingYun
 * @date: 2018/8/21 18:44
 * @description:
 */
@Service
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    private ExcelMapper excelMapper;

    /**
     * 　　* @description: 查询所有的
     * 　　* @param []
     * 　　* @return java.util.List<com.hand.page.pojo.Excel>
     * 　　* @throws
     * 　　* @author ZhongLingYun
     * 　　* @date 2018/8/21 18:43
     */
    @Override
    public PageInfo<Excel> listExcel(int page) {
       /* list操作已经返回分页的数据*/
       /* Page p=*/
        PageHelper.startPage(page, 10);
        List<Excel> list = excelMapper.listExcel();
        // pageInfo 将list数据和page数据进行封装
        PageInfo<Excel> pi = new PageInfo<>(list);
        return pi;
    }
}
