package haihuang.vo;

import java.io.Serializable;
import java.util.Date;

public class DynamicLikeDiscussVo implements Serializable {

    private long dynamicId;

    private long userId;

    private String discuss;

    private long parentId;

    private long discussId;

    public long getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(long dynamicId) {
        this.dynamicId = dynamicId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDiscuss() {
        return discuss;
    }

    public void setDiscuss(String discuss) {
        this.discuss = discuss;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public long getDiscussId() {
        return discussId;
    }

    public void setDiscussId(long discussId) {
        this.discussId = discussId;
    }
}