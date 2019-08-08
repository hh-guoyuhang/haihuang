package haihuang.bean;

import java.util.Date;

public class HhUserBlack {
    private Long id;

    private Long userId;

    private Long blackUserId;

    private String blackUserName;

    private String blackUserPhoto;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBlackUserId() {
        return blackUserId;
    }

    public void setBlackUserId(Long blackUserId) {
        this.blackUserId = blackUserId;
    }

    public String getBlackUserName() {
        return blackUserName;
    }

    public void setBlackUserName(String blackUserName) {
        this.blackUserName = blackUserName == null ? null : blackUserName.trim();
    }

    public String getBlackUserPhoto() {
        return blackUserPhoto;
    }

    public void setBlackUserPhoto(String blackUserPhoto) {
        this.blackUserPhoto = blackUserPhoto == null ? null : blackUserPhoto.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}