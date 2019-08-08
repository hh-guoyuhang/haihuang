package haihuang.bean;

import java.util.Date;

public class HhUserReport {
    private Long id;

    private Long userId;

    private Long reportUserId;

    private String reportUserName;

    private String reportUserPhoto;

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

    public String getReportUserName() {
        return reportUserName;
    }

    public void setReportUserName(String reportUserName) {
        this.reportUserName = reportUserName == null ? null : reportUserName.trim();
    }

    public String getReportUserPhoto() {
        return reportUserPhoto;
    }

    public void setReportUserPhoto(String reportUserPhoto) {
        this.reportUserPhoto = reportUserPhoto == null ? null : reportUserPhoto.trim();
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