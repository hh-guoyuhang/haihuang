package haihuang.vo;

public class UserRelationVo {

    private String userId;//用户id

    private String attentionUserId;//被关注用户

    private String blackUserId;//被拉黑用户

    private String reportUserId;//被举报用户

    private String reportRoomId;//被举报房间

    private String reportDynamicId;//被举报动态

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAttentionUserId() {
        return attentionUserId;
    }

    public void setAttentionUserId(String attentionUserId) {
        this.attentionUserId = attentionUserId;
    }

    public String getBlackUserId() {
        return blackUserId;
    }

    public void setBlackUserId(String blackUserId) {
        this.blackUserId = blackUserId;
    }

    public String getReportUserId() {
        return reportUserId;
    }

    public void setReportUserId(String reportUserId) {
        this.reportUserId = reportUserId;
    }

    public String getReportRoomId() {
        return reportRoomId;
    }

    public void setReportRoomId(String reportRoomId) {
        this.reportRoomId = reportRoomId;
    }

    public String getReportDynamicId() {
        return reportDynamicId;
    }

    public void setReportDynamicId(String reportDynamicId) {
        this.reportDynamicId = reportDynamicId;
    }
}
