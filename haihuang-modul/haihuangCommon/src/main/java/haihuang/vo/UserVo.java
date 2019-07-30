package haihuang.vo;

import java.io.Serializable;

public class UserVo implements Serializable {
    private Long id;//主键

    private String realName;//真实姓名

    private String nickName;//昵称

    private String mobilePhone;//手机号

    private String passWord;//密码

    private String idCard;//身份证

    private Integer age;//年龄

    private String area;//地区

    private Integer sex;//性别

    private Integer empiricalValue;//经验值

    private Integer grade;//等级 1-10

    private Integer ranks;//级别 1塘王 2河王 3江王 4海王 5海皇

    private String articleEnergy;//能量条

    private Integer belongToTheSea;//分属海洋 1太平洋 2大西洋 3印度洋 4印度洋

    private Integer online;//是否在线 1在线 0离线

    private Double money;//金额

    private Integer loginMethod;//登录方式 0手机 1微信 2 QQ

    private String hhId;//海皇ID

    private Long limits;//权限

    private String idiograph;//个性签名

    private String backgroundImage;//背景图

    private Long giftId;//礼物id

    private Long interpersonalId;//人际关系id

    private Long roomId;//房间id

    private Long dynamicId;//动态id

    private Long moneyId;//钱包id

    private Double balanceMoney;//余额

    private String headPhoto;//头像

    private String thirdPartyAccount;//第三方账号

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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

    public String getArticleEnergy() {
        return articleEnergy;
    }

    public void setArticleEnergy(String articleEnergy) {
        this.articleEnergy = articleEnergy == null ? null : articleEnergy.trim();
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getLoginMethod() {
        return loginMethod;
    }

    public void setLoginMethod(Integer loginMethod) {
        this.loginMethod = loginMethod;
    }

    public String getHhId() {
        return hhId;
    }

    public void setHhId(String hhId) {
        this.hhId = hhId == null ? null : hhId.trim();
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

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage == null ? null : backgroundImage.trim();
    }

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public Long getInterpersonalId() {
        return interpersonalId;
    }

    public void setInterpersonalId(Long interpersonalId) {
        this.interpersonalId = interpersonalId;
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

    public Double getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(Double balanceMoney) {
        this.balanceMoney = balanceMoney;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto == null ? null : headPhoto.trim();
    }

    public String getThirdPartyAccount() {
        return thirdPartyAccount;
    }

    public void setThirdPartyAccount(String thirdPartyAccount) {
        this.thirdPartyAccount = thirdPartyAccount;
    }
}