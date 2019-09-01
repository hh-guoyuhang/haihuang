package haihuang.bean;

import java.io.Serializable;
import java.util.Date;

public class HhUserReport implements Serializable {
    private Long id;

    private Long userId;

    private Long reportUserId;

    private Long reportRoomId;

    private Long reportDynamicId;

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

    public Long getReportUserId() {
        return reportUserId;
    }

    public void setReportUserId(Long reportUserId) {
        this.reportUserId = reportUserId;
    }

    public Long getReportRoomId() {
        return reportRoomId;
    }

    public void setReportRoomId(Long reportRoomId) {
        this.reportRoomId = reportRoomId;
    }

    public Long getReportDynamicId() {
        return reportDynamicId;
    }

    public void setReportDynamicId(Long reportDynamicId) {
        this.reportDynamicId = reportDynamicId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}