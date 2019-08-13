package haihuang.utils.serviceUtils;

import com.github.pagehelper.PageInfo;
import haihuang.bean.HhUser;
import haihuang.vo.UserVo;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    public static PageInfo<UserVo> createHhUserListToUserVoList(PageInfo<HhUser> userResp) {
        if(null == userResp){
            return null;
        }
        PageInfo list = new PageInfo();
        list = userResp;
        List<UserVo> userVos = new ArrayList<>();
        for (HhUser user: userResp.getList()) {
            UserVo respvo = UserUtil.createHhUserToUserVo(user);
            userVos.add(respvo);
        }
        list.setList(userVos);

        return list;
    }














//        list.setPageNum(userResp.getPageNum());
//        list.setPageSize(userResp.getPageSize());
//        list.setPrePage(userResp.getPrePage());
//        list.setSize(userResp.getSize());
//        list.setStartRow(userResp.getStartRow());
//        list.setTotal(userResp.getTotal());
//        list.setPages(userResp.getPages());
//        list.setNextPage(userResp.getNextPage());
//        list.setEndRow(userResp.getEndRow());
}
