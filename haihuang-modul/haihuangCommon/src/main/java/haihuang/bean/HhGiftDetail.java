package haihuang.bean;

import java.io.Serializable;
import java.util.Date;

public class HhGiftDetail implements Serializable {
    private Long id;

    private Long outUserId;

    private Long inUserId;

    private String giftType;

    private String giftName;

    private Integer giftCount;

    private Double giftMoney;

    private String giver;

    private Date giverTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(Long outUserId) {
        this.outUserId = outUserId;
    }

    public Long getInUserId() {
        return inUserId;
    }

    public void setInUserId(Long inUserId) {
        this.inUserId = inUserId;
    }

    public String getGiftType() {
        return giftType;
    }

    public void setGiftType(String giftType) {
        this.giftType = giftType == null ? null : giftType.trim();
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName == null ? null : giftName.trim();
    }

    public Integer getGiftCount() {
        return giftCount;
    }

    public void setGiftCount(Integer giftCount) {
        this.giftCount = giftCount;
    }

    public Double getGiftMoney() {
        return giftMoney;
    }

    public void setGiftMoney(Double giftMoney) {
        this.giftMoney = giftMoney;
    }

    public String getGiver() {
        return giver;
    }

    public void setGiver(String giver) {
        this.giver = giver == null ? null : giver.trim();
    }

    public Date getGiverTime() {
        return giverTime;
    }

    public void setGiverTime(Date giverTime) {
        this.giverTime = giverTime;
    }
}