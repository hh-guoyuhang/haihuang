package com.chadianmeiyou.haihuanguser.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhDynamic;
import haihuang.bean.HhDynamicDetails;
import haihuang.bean.HhUser;

public interface DynamicDao {
    /**
     * 新增动态表
     * @param hhDynamic
     * @return
     */
    public void saveDynamic(HhDynamic hhDynamic);
    /**
     * 新增动态清单表
     * @param hhDynamicDetails
     * @return
     */
    public void saveDynamicDetails(HhDynamicDetails hhDynamicDetails);
}
