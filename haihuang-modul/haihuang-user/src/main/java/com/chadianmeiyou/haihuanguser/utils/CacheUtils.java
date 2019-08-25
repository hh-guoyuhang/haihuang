package com.chadianmeiyou.haihuanguser.utils;

import com.chadianmeiyou.haihuanguser.dao.UserDao;
import haihuang.bean.HhUser;
import haihuang.utils.CacheContents;
import haihuang.utils.RedisConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CacheUtils implements CommandLineRunner {

    @Autowired
    private RedisConfiguration redisConfiguration;
    @Autowired
    private UserDao userDao;
    @Override
    public void run(String... strings) throws Exception {
        List<HhUser> hhUsers = userDao.queryUser();
        if(null != hhUsers && !hhUsers.isEmpty()){
            for (HhUser user:hhUsers) {
                redisConfiguration.vos().set(CacheContents.USERKEY+user.getId().toString(),user);
            }
        }
    }
}
