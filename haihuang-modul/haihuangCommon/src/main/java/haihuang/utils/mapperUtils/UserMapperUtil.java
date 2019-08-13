package haihuang.utils.mapperUtils;

import com.github.pagehelper.util.StringUtil;
import haihuang.bean.HhUser;
import haihuang.bean.HhUserExample;
import haihuang.vo.UserVo;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

public class UserMapperUtil implements Serializable {


    public static HhUserExample exampleIsNullCheck(HhUser user) {
        HhUserExample example = new HhUserExample();
        HhUserExample.Criteria criteria = example.createCriteria();
        if(StringUtil.isNotEmpty(user.getArea())){
            criteria.andAreaEqualTo(user.getArea());
        }
        if(StringUtil.isNotEmpty(user.getThirdpartyaccount())){
            criteria.andThirdpartyaccountEqualTo(user.getThirdpartyaccount());
        }
        if(StringUtil.isNotEmpty(user.getDayOfBirth())){
            criteria.andDayOfBirthEqualTo(user.getDayOfBirth());
        }
        if(StringUtil.isNotEmpty(user.getGradePhoto())){
            criteria.andGradePhotoEqualTo(user.getGradePhoto());
        }
        if(StringUtil.isNotEmpty(user.getHhid())){
            criteria.andHhidEqualTo(user.getHhid());
        }
        if(StringUtil.isNotEmpty(user.getIdCard())){
            criteria.andIdCardEqualTo(user.getIdCard());
        }
        if(StringUtil.isNotEmpty(user.getIdiograph())){
            criteria.andIdiographEqualTo(user.getIdiograph());
        }
        if(StringUtil.isNotEmpty(user.getMobilePhone())){
            criteria.andMobilePhoneEqualTo(user.getMobilePhone());
        }
        if(StringUtil.isNotEmpty(user.getMonthOfBirth())){
            criteria.andMonthOfBirthEqualTo(user.getMonthOfBirth());
        }
        if(StringUtil.isNotEmpty(user.getMyBackgroundImage())){
            criteria.andMyBackgroundImageEqualTo(user.getMyBackgroundImage());
        }
        if(StringUtil.isNotEmpty(user.getMydetailsBackgroundImage())){
            criteria.andMydetailsBackgroundImageEqualTo(user.getMydetailsBackgroundImage());
        }
        if(StringUtil.isNotEmpty(user.getPassWord())){
            criteria.andPassWordEqualTo(user.getPassWord());
        }
        if(StringUtil.isNotEmpty(user.getRealName())){
            criteria.andRealNameEqualTo(user.getRealName());
        }
        if(StringUtil.isNotEmpty(user.getUserName())){
            criteria.andUserNameEqualTo(user.getUserName());
        }
        if(StringUtil.isNotEmpty(user.getUserPhoto())){
            criteria.andUserPhotoEqualTo(user.getUserPhoto());
        }
        if(StringUtil.isNotEmpty(user.getYearOfBirth())){
            criteria.andYearOfBirthEqualTo(user.getYearOfBirth());
        }
        if(null != user.getAge()){
            criteria.andAgeEqualTo(user.getAge());
        }
        if(null != user.getArticleEnergyMax()){
            criteria.andArticleEnergyMaxEqualTo(user.getArticleEnergyMax());
        }
        if(null != user.getArticleEnergyMin()){
            criteria.andArticleEnergyMinEqualTo(user.getArticleEnergyMin());
        }
        if(null != user.getBelongToTheSea()){
            criteria.andBelongToTheSeaEqualTo(user.getBelongToTheSea());
        }
        if(null != user.getCreateTime()){
            criteria.andCreateTimeEqualTo(user.getCreateTime());
        }
        if(null != user.getDynamicId()){
            criteria.andDynamicIdEqualTo(user.getDynamicId());
        }
        if(null != user.getEmpiricalValue()){
            criteria.andEmpiricalValueEqualTo(user.getEmpiricalValue());
        }
        if(null != user.getGiftId()){
            criteria.andGiftIdEqualTo(user.getGiftId());
        }
        if(null != user.getGrade()){
            criteria.andGradeEqualTo(user.getGrade());
        }
        if(null != user.getId()){
            criteria.andIdEqualTo(user.getId());
        }
        if(null != user.getIsEditSex()){
            criteria.andIsEditSexEqualTo(user.getIsEditSex());
        }
        if(null != user.getLimits()){
            criteria.andLimitsEqualTo(user.getLimits());
        }
        if(null != user.getLoginMethod()){
            criteria.andLoginMethodEqualTo(user.getLoginMethod());
        }
        if(null != user.getLogoutTime()){
            criteria.andLogoutTimeEqualTo(user.getLogoutTime());
        }
        if(null != user.getMoneyId()){
            criteria.andMoneyIdEqualTo(user.getMoneyId());
        }
        if(null != user.getOnline()){
            criteria.andOnlineEqualTo(user.getOnline());
        }
        if(null != user.getRanks()){
            criteria.andRanksEqualTo(user.getRanks());
        }
        if(null != user.getRanksOrder()){
            criteria.andRanksOrderEqualTo(user.getRanksOrder());
        }
        if(null != user.getRoomId()){
            criteria.andRoomIdEqualTo(user.getRoomId());
        }
        if(null != user.getSex()){
            criteria.andSexEqualTo(user.getSex());
        }
        return example;
    }
}
