package com.hand.page.mapper;


import com.hand.page.pojo.Excel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhongLingYun on 2018/8/16.
 */
@Repository
public interface ExcelMapper {

    /**
     * 　　* @description: 批量插入数据
     * 　　* @param [list] list<Excel>
     * 　　* @return void
     * 　　* @throws
     * 　　* @author ZhongLingYun
     * 　　* @date 2018/8/21 18:36
     */
    void ins(List<Excel> list);

    /**
     * 　　* @description: 查找所有的数据
     * 　　* @param []
     * 　　* @return java.util.List<com.hand.page.pojo.Excel>
     * 　　* @throws
     * 　　* @author ZhongLingYun
     * 　　* @date 2018/8/21 18:39
     */
    List<Excel> listExcel();
}
