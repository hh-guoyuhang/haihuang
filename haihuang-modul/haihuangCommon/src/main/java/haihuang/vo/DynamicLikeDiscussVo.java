package haihuang.vo;

import java.io.Serializable;
import java.util.Date;

public class DynamicLikeDiscussVo implements Serializable {

    private long dynamicId;

    private long userId;

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
}