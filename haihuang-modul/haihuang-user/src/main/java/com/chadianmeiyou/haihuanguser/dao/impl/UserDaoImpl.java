package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.UserDao;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import haihuang.bean.*;
import haihuang.mapper.HhUserAttentionMapper;
import haihuang.mapper.HhUserBlackMapper;
import haihuang.mapper.HhUserMapper;
import haihuang.mapper.HhUserReportMapper;
import haihuang.utils.mapperUtils.UserMapperUtil;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private HhUserMapper hhUserMapper;
    @Autowired
    private HhUserAttentionMapper hhUserAttentionMapper;
    @Autowired
    private HhUserBlackMapper hhUserBlackMapper;
    @Autowired
    private HhUserReportMapper hhUserReportMapper;
    public HhUser queryUserByid(long id) {
        HhUser hhUser = hhUserMapper.selectByPrimaryKey(id);
        return hhUser;
    }




    @Override
    public HhUser addUser(HhUser user) {
        hhUserMapper.insertSelective(user);
        return user;
    }

    @Override
    public HhUser updateUser(HhUser user) {
        hhUserMapper.updateByPrimaryKeySelective(user);
        return user;
    }

    @Override
    public HhUser queryUserByPassWord(HhUser user) {
        HhUserExample example = new HhUserExample();
        HhUserExample.Criteria criteria = example.createCriteria();
        List<HhUser> hhUser = null;
        if(null != user.getLoginMethod()){
            if(0 == user.getLoginMethod()){
                if (!StringUtils.isEmpty(user.getMobilePhone())){
                    criteria.andMobilePhoneEqualTo(user.getMobilePhone());
                }else{
                    throw new ServiceException("电话号码必输！");
                }
            }else{
                if (!StringUtils.isEmpty(user.getThirdpartyaccount())){
                    criteria.andThirdpartyaccountEqualTo(user.getThirdpartyaccount());
                }else{
                    throw new ServiceException("第三方账号必输！");
                }
            }
            hhUser = hhUserMapper.selectByExample(example);

        }else{
            throw new ServiceException("登录方式必输！");
        }
        if(hhUser.size() == 0){
            return null;
        }
        return hhUser.get(0);
    }

    @Override
    public HhUser selectUserByUser(HhUser user) {
        HhUserExample example = UserMapperUtil.exampleIsNullCheck(user);
        List<HhUser> hhUser = hhUserMapper.selectByExample(example);
        if(hhUser.size() == 0){
            return null;
        }
        return hhUser.get(0);
    }

    @Override
    public PageInfo<HhUser> selectUserByPage(HhUser user, Page page) {
        HhUserExample example = UserMapperUtil.exampleIsNullCheck(user);
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<HhUser> hhUser = hhUserMapper.selectByExample(example);
        PageInfo<HhUser> pageInfo = new PageInfo<HhUser>(hhUser);
        return pageInfo;
    }


    @Override
    public List<HhUser> queryUser() {
        HhUser user = new HhUser();
        HhUserExample example = UserMapperUtil.exampleIsNullCheck(user);
        List<HhUser> hhUser = hhUserMapper.selectByExample(example);
        return hhUser;
    }

    @Override
    public void addAttention(HhUserAttention hhUserAttention) {
        hhUserAttentionMapper.insert(hhUserAttention);
    }

    @Override
    public void addBlack(HhUserBlack hhUserBlack) {
        hhUserBlackMapper.insert(hhUserBlack);
    }

    @Override
    public void addReport(HhUserReport hhUserBlack) {
        hhUserReportMapper.insert(hhUserBlack);
    }

}
