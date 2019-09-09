package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.UserDao;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import haihuang.bean.HhUser;
import haihuang.bean.HhUserExample;
import haihuang.mapper.HhUserMapper;
import haihuang.utils.mapperUtils.UserMapperUtil;
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

    public HhUser queryUserByid(long id) {
        HhUser hhUser = hhUserMapper.selectByPrimaryKey(id);
        return hhUser;
    }




    @Override
    public HhUser addUser(HhUser user) {
        hhUserMapper.insert(user);
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
        if(0 == user.getLoginMethod()){
            if (!StringUtils.isEmpty(user.getMobilePhone())){
                criteria.andMobilePhoneEqualTo(user.getMobilePhone());
            }
        }else{
            if (StringUtils.isEmpty(user.getThirdpartyaccount())){
                criteria.andThirdpartyaccountEqualTo(user.getThirdpartyaccount());
            }
        }
        List<HhUser> hhUser = hhUserMapper.selectByExample(example);
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
}
