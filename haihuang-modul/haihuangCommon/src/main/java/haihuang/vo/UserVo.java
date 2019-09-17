package haihuang.vo;

import java.io.Serializable;
import java.util.Date;

public class UserVo implements Serializable {
    private Long id;//主键

    private String realName;//真实姓名

    private String userName;//用户姓名

    private String userPhoto;//用户头像

    private String mobilePhone;//手机号

    private String passWord;//密码

    private String idCard;//身份证

    private Integer age;//年龄

    private String area;//地区

    private Integer sex;//性别

    private Integer isEditSex;//是否编辑过性别

    private Integer empiricalValue;//经验值

    private Integer grade;//等级 1-10

    private String gradePhoto;//等级图片

    private Integer ranks;//级别 1塘王 2河王 3江王 4海王 5海皇

    private Long ranksOrder;//级别排序

    private Integer articleEnergyMin;//能量条最小值

    private Integer articleEnergyMax;//能量条最大值

    private Integer belongToTheSea;//所属海洋

    private Integer online;//是否在线 1在线 0离线

    private Date logoutTime;//登出时间

    private Integer loginMethod;//登录方式 0手机 1微信 2 QQ

    private String hhid;//海皇id

    private Long limits;//权限

    private String idiograph;//个性签名

    private String myBackgroundImage;//我的背景图

    private String mydetailsBackgroundImage;//我的详情背景图

    private Long giftId;//礼物外键

    private Long roomId;//房间外键

    private Long dynamicId;//动态id

    private Long moneyId;//钱包id

    private String thirdpartyaccount;//第三方登录

    private String yearOfBirth;//出生年

    private String monthOfBirth;//出生月

    private String dayOfBirth;//出生日

    private Date createTime;//创建时间

    private String orderByWhat;//通过什么字段排序

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getEmpiricalValue() {
        return empiricalValue;
    }

    public void setEmpiricalValue(Integer empiricalValue) {
        this.empiricalValue = empiricalValue;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getRanks() {
        return ranks;
    }

    public void setRanks(Integer ranks) {
        this.ranks = ranks;
    }

    public Integer getBelongToTheSea() {
        return belongToTheSea;
    }

    public void setBelongToTheSea(Integer belongToTheSea) {
        this.belongToTheSea = belongToTheSea;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Integer getLoginMethod() {
        return loginMethod;
    }

    public void setLoginMethod(Integer loginMethod) {
        this.loginMethod = loginMethod;
    }

    public Long getLimits() {
        return limits;
    }

    public void setLimits(Long limits) {
        this.limits = limits;
    }

    public String getIdiograph() {
        return idiograph;
    }

    public void setIdiograph(String idiograph) {
        this.idiograph = idiograph == null ? null : idiograph.trim();
    }

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(Long dynamicId) {
        this.dynamicId = dynamicId;
    }

    public Long getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Long moneyId) {
        this.moneyId = moneyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public Integer getIsEditSex() {
        return isEditSex;
    }

    public void setIsEditSex(Integer isEditSex) {
        this.isEditSex = isEditSex;
    }

    public String getGradePhoto() {
        return gradePhoto;
    }

    public void setGradePhoto(String gradePhoto) {
        this.gradePhoto = gradePhoto;
    }

    public Long getRanksOrder() {
        return ranksOrder;
    }

    public void setRanksOrder(Long ranksOrder) {
        this.ranksOrder = ranksOrder;
    }

    public Integer getArticleEnergyMin() {
        return articleEnergyMin;
    }

    public void setArticleEnergyMin(Integer articleEnergyMin) {
        this.articleEnergyMin = articleEnergyMin;
    }

    public Integer getArticleEnergyMax() {
        return articleEnergyMax;
    }

    public void setArticleEnergyMax(Integer articleEnergyMax) {
        this.articleEnergyMax = articleEnergyMax;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public String getMyBackgroundImage() {
        return myBackgroundImage;
    }

    public void setMyBackgroundImage(String myBackgroundImage) {
        this.myBackgroundImage = myBackgroundImage;
    }

    public String getMydetailsBackgroundImage() {
        return mydetailsBackgroundImage;
    }

    public void setMydetailsBackgroundImage(String mydetailsBackgroundImage) {
        this.mydetailsBackgroundImage = mydetailsBackgroundImage;
    }

    public String getThirdpartyaccount() {
        return thirdpartyaccount;
    }

    public void setThirdpartyaccount(String thirdpartyaccount) {
        this.thirdpartyaccount = thirdpartyaccount;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOrderByWhat() {
        return orderByWhat;
    }

    public void setOrderByWhat(String orderByWhat) {
        this.orderByWhat = orderByWhat;
    }
}