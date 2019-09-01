package haihuang.bean;

import java.io.Serializable;
import java.util.Date;

public class HhDynamicDiscussDetails implements Serializable {
    private Long id;

    private Long userId;

    private Long dynamicId;

    private String discuss;

    private Date createTime;

    private Long parentId;

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

    public Long getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(Long dynamicId) {
        this.dynamicId = dynamicId;
    }

    public String getDiscuss() {
        return discuss;
    }

    public void setDiscuss(String discuss) {
        this.discuss = discuss == null ? null : discuss.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}