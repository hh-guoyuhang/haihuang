package com.chadianmeiyou.haihuanguser.dao.impl;

import com.chadianmeiyou.haihuanguser.dao.UserDao;
import com.chadianmeiyou.haihuanguser.mapper.HhUserMapper;
import haihuang.bean.HhUser;
import haihuang.bean.HhUserExample;
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
        if("0".equals(user.getLoginMethod())){
            if (StringUtils.isEmpty(user.getMobilePhone())){
                criteria.andMobilePhoneEqualTo(user.getMobilePhone());
            }
        }else{
            if (StringUtils.isEmpty(user.getThirdPartyAccount())){
                criteria.andThirdPartyAccountEqualTo(user.getThirdPartyAccount());
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
        return null;
    }


}
