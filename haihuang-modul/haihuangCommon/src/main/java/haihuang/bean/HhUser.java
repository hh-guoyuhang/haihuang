package haihuang.bean;

import java.io.Serializable;
import java.util.Date;

public class HhUser implements Serializable {
    private Long id;

    private String realName;

    private String userName;

    private String userPhoto;

    private String mobilePhone;

    private String passWord;

    private String idCard;

    private Integer age;

    private String area;

    private Integer sex;

    private Integer isEditSex;

    private Integer empiricalValue;

    private Integer grade;

    private String gradePhoto;

    private Integer ranks;

    private Long ranksOrder;

    private Integer articleEnergyMin;

    private Integer articleEnergyMax;

    private Integer belongToTheSea;

    private Integer online;

    private Date logoutTime;

    private Integer loginMethod;

    private String hhid;

    private Long limits;

    private String idiograph;

    private String myBackgroundImage;

    private String mydetailsBackgroundImage;

    private Long giftId;

    private Long roomId;

    private Long dynamicId;

    private Long moneyId;

    private String thirdpartyaccount;

    private String yearOfBirth;

    private String monthOfBirth;

    private String dayOfBirth;

    private Date createTime;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
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

    public Integer getIsEditSex() {
        return isEditSex;
    }

    public void setIsEditSex(Integer isEditSex) {
        this.isEditSex = isEditSex;
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

    public String getGradePhoto() {
        return gradePhoto;
    }

    public void setGradePhoto(String gradePhoto) {
        this.gradePhoto = gradePhoto == null ? null : gradePhoto.trim();
    }

    public Integer getRanks() {
        return ranks;
    }

    public void setRanks(Integer ranks) {
        this.ranks = ranks;
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

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public Integer getLoginMethod() {
        return loginMethod;
    }

    public void setLoginMethod(Integer loginMethod) {
        this.loginMethod = loginMethod;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid == null ? null : hhid.trim();
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

    public String getMyBackgroundImage() {
        return myBackgroundImage;
    }

    public void setMyBackgroundImage(String myBackgroundImage) {
        this.myBackgroundImage = myBackgroundImage == null ? null : myBackgroundImage.trim();
    }

    public String getMydetailsBackgroundImage() {
        return mydetailsBackgroundImage;
    }

    public void setMydetailsBackgroundImage(String mydetailsBackgroundImage) {
        this.mydetailsBackgroundImage = mydetailsBackgroundImage == null ? null : mydetailsBackgroundImage.trim();
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

    public String getThirdpartyaccount() {
        return thirdpartyaccount;
    }

    public void setThirdpartyaccount(String thirdpartyaccount) {
        this.thirdpartyaccount = thirdpartyaccount == null ? null : thirdpartyaccount.trim();
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth == null ? null : yearOfBirth.trim();
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth == null ? null : monthOfBirth.trim();
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth == null ? null : dayOfBirth.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}