package haihuang.bean;

import java.io.Serializable;
import java.util.Date;

public class HhUserAttention  implements Serializable {
    private Long id;

    private Long userId;

    private Long attentionUserId;

    private String attentionUserName;

    private String attentionUserPhoto;

    private Integer sex;

    private Integer grade;

    private Integer ranks;

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

    public Long getAttentionUserId() {
        return attentionUserId;
    }

    public void setAttentionUserId(Long attentionUserId) {
        this.attentionUserId = attentionUserId;
    }

    public String getAttentionUserName() {
        return attentionUserName;
    }

    public void setAttentionUserName(String attentionUserName) {
        this.attentionUserName = attentionUserName == null ? null : attentionUserName.trim();
    }

    public String getAttentionUserPhoto() {
        return attentionUserPhoto;
    }

    public void setAttentionUserPhoto(String attentionUserPhoto) {
        this.attentionUserPhoto = attentionUserPhoto == null ? null : attentionUserPhoto.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}