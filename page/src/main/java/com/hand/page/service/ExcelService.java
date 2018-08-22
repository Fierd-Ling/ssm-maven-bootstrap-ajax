package com.hand.page.service;

import com.github.pagehelper.PageInfo;
import com.hand.page.pojo.Excel;

/**
 * @author: ZhongLingYun
 * @date: 2018/8/21 18:43
 * @description:
 */
public interface ExcelService {

    /**
     * 　　* @description: 查询所有的
     * 　　* @param []
     * 　　* @return java.util.List<com.hand.page.pojo.Excel>
     * 　　* @throws
     * 　　* @author ZhongLingYun
     * 　　* @date 2018/8/21 18:43
     */
    PageInfo<Excel> listExcel(int page);
}
