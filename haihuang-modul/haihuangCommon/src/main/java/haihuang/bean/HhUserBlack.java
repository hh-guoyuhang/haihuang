package haihuang.bean;

import java.io.Serializable;
import java.util.Date;

public class HhUserBlack implements Serializable {
    private Long id;

    private Long userId;

    private Long blackUserId;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}