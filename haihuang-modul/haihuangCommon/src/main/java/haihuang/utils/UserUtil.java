package haihuang.utils;

import haihuang.bean.HhUser;
import haihuang.vo.UserVo;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

public class UserUtil implements Serializable {

    public static HhUser createUserVoToHhUser(UserVo userVo) {
        if(null == userVo){
            return null;
        }
        HhUser user = new HhUser();
        BeanUtils.copyProperties(userVo,user);
        return user;
    }

    public static UserVo createHhUserToUserVo(HhUser userResp) {
        if(null == userResp){
            return null;
        }
        UserVo user = new UserVo();
        BeanUtils.copyProperties(userResp,user);
        return user;
    }
}
