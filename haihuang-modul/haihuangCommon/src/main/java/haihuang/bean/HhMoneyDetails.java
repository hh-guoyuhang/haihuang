package haihuang.bean;

import java.util.Date;

public class HhMoneyDetails {
    private Long id;

    private Long moneyId;

    private Integer shellIncomeAndExpenses;

    private Long originalShell;

    private Long currentShell;

    private Long shellOpponentUserId;

    private Integer rmbIncomeAndExpenses;

    private Double originalMoney;

    private Double currentMoney;

    private Long rmbOpponentUserId;

    private String wexinAccount;

    private String zhifubaoAccount;

    private String bankCard;

    private Date shellCreateTime;

    private Date rmbCreateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Long moneyId) {
        this.moneyId = moneyId;
    }

    public Integer getShellIncomeAndExpenses() {
        return shellIncomeAndExpenses;
    }

    public void setShellIncomeAndExpenses(Integer shellIncomeAndExpenses) {
        this.shellIncomeAndExpenses = shellIncomeAndExpenses;
    }

    public Long getOriginalShell() {
        return originalShell;
    }

    public void setOriginalShell(Long originalShell) {
        this.originalShell = originalShell;
    }

    public Long getCurrentShell() {
        return currentShell;
    }

    public void setCurrentShell(Long currentShell) {
        this.currentShell = currentShell;
    }

    public Long getShellOpponentUserId() {
        return shellOpponentUserId;
    }

    public void setShellOpponentUserId(Long shellOpponentUserId) {
        this.shellOpponentUserId = shellOpponentUserId;
    }

    public Integer getRmbIncomeAndExpenses() {
        return rmbIncomeAndExpenses;
    }

    public void setRmbIncomeAndExpenses(Integer rmbIncomeAndExpenses) {
        this.rmbIncomeAndExpenses = rmbIncomeAndExpenses;
    }

    public Double getOriginalMoney() {
        return originalMoney;
    }

    public void setOriginalMoney(Double originalMoney) {
        this.originalMoney = originalMoney;
    }

    public Double getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(Double currentMoney) {
        this.currentMoney = currentMoney;
    }

    public Long getRmbOpponentUserId() {
        return rmbOpponentUserId;
    }

    public void setRmbOpponentUserId(Long rmbOpponentUserId) {
        this.rmbOpponentUserId = rmbOpponentUserId;
    }

    public String getWexinAccount() {
        return wexinAccount;
    }

    public void setWexinAccount(String wexinAccount) {
        this.wexinAccount = wexinAccount == null ? null : wexinAccount.trim();
    }

    public String getZhifubaoAccount() {
        return zhifubaoAccount;
    }

    public void setZhifubaoAccount(String zhifubaoAccount) {
        this.zhifubaoAccount = zhifubaoAccount == null ? null : zhifubaoAccount.trim();
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public Date getShellCreateTime() {
        return shellCreateTime;
    }

    public void setShellCreateTime(Date shellCreateTime) {
        this.shellCreateTime = shellCreateTime;
    }

    public Date getRmbCreateTime() {
        return rmbCreateTime;
    }

    public void setRmbCreateTime(Date rmbCreateTime) {
        this.rmbCreateTime = rmbCreateTime;
    }
}