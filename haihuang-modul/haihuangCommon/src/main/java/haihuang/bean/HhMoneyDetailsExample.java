package haihuang.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HhMoneyDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HhMoneyDetailsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMoneyIdIsNull() {
            addCriterion("money_id is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIdIsNotNull() {
            addCriterion("money_id is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyIdEqualTo(Long value) {
            addCriterion("money_id =", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdNotEqualTo(Long value) {
            addCriterion("money_id <>", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdGreaterThan(Long value) {
            addCriterion("money_id >", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("money_id >=", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdLessThan(Long value) {
            addCriterion("money_id <", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdLessThanOrEqualTo(Long value) {
            addCriterion("money_id <=", value, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdIn(List<Long> values) {
            addCriterion("money_id in", values, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdNotIn(List<Long> values) {
            addCriterion("money_id not in", values, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdBetween(Long value1, Long value2) {
            addCriterion("money_id between", value1, value2, "moneyId");
            return (Criteria) this;
        }

        public Criteria andMoneyIdNotBetween(Long value1, Long value2) {
            addCriterion("money_id not between", value1, value2, "moneyId");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesIsNull() {
            addCriterion("shell_income_and_expenses is null");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesIsNotNull() {
            addCriterion("shell_income_and_expenses is not null");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesEqualTo(Integer value) {
            addCriterion("shell_income_and_expenses =", value, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesNotEqualTo(Integer value) {
            addCriterion("shell_income_and_expenses <>", value, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesGreaterThan(Integer value) {
            addCriterion("shell_income_and_expenses >", value, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesGreaterThanOrEqualTo(Integer value) {
            addCriterion("shell_income_and_expenses >=", value, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesLessThan(Integer value) {
            addCriterion("shell_income_and_expenses <", value, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesLessThanOrEqualTo(Integer value) {
            addCriterion("shell_income_and_expenses <=", value, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesIn(List<Integer> values) {
            addCriterion("shell_income_and_expenses in", values, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesNotIn(List<Integer> values) {
            addCriterion("shell_income_and_expenses not in", values, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesBetween(Integer value1, Integer value2) {
            addCriterion("shell_income_and_expenses between", value1, value2, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andShellIncomeAndExpensesNotBetween(Integer value1, Integer value2) {
            addCriterion("shell_income_and_expenses not between", value1, value2, "shellIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andOriginalShellIsNull() {
            addCriterion("original_shell is null");
            return (Criteria) this;
        }

        public Criteria andOriginalShellIsNotNull() {
            addCriterion("original_shell is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalShellEqualTo(Long value) {
            addCriterion("original_shell =", value, "originalShell");
            return (Criteria) this;
        }

        public Criteria andOriginalShellNotEqualTo(Long value) {
            addCriterion("original_shell <>", value, "originalShell");
            return (Criteria) this;
        }

        public Criteria andOriginalShellGreaterThan(Long value) {
            addCriterion("original_shell >", value, "originalShell");
            return (Criteria) this;
        }

        public Criteria andOriginalShellGreaterThanOrEqualTo(Long value) {
            addCriterion("original_shell >=", value, "originalShell");
            return (Criteria) this;
        }

        public Criteria andOriginalShellLessThan(Long value) {
            addCriterion("original_shell <", value, "originalShell");
            return (Criteria) this;
        }

        public Criteria andOriginalShellLessThanOrEqualTo(Long value) {
            addCriterion("original_shell <=", value, "originalShell");
            return (Criteria) this;
        }

        public Criteria andOriginalShellIn(List<Long> values) {
            addCriterion("original_shell in", values, "originalShell");
            return (Criteria) this;
        }

        public Criteria andOriginalShellNotIn(List<Long> values) {
            addCriterion("original_shell not in", values, "originalShell");
            return (Criteria) this;
        }

        public Criteria andOriginalShellBetween(Long value1, Long value2) {
            addCriterion("original_shell between", value1, value2, "originalShell");
            return (Criteria) this;
        }

        public Criteria andOriginalShellNotBetween(Long value1, Long value2) {
            addCriterion("original_shell not between", value1, value2, "originalShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellIsNull() {
            addCriterion("current_shell is null");
            return (Criteria) this;
        }

        public Criteria andCurrentShellIsNotNull() {
            addCriterion("current_shell is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentShellEqualTo(Long value) {
            addCriterion("current_shell =", value, "currentShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellNotEqualTo(Long value) {
            addCriterion("current_shell <>", value, "currentShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellGreaterThan(Long value) {
            addCriterion("current_shell >", value, "currentShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellGreaterThanOrEqualTo(Long value) {
            addCriterion("current_shell >=", value, "currentShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellLessThan(Long value) {
            addCriterion("current_shell <", value, "currentShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellLessThanOrEqualTo(Long value) {
            addCriterion("current_shell <=", value, "currentShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellIn(List<Long> values) {
            addCriterion("current_shell in", values, "currentShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellNotIn(List<Long> values) {
            addCriterion("current_shell not in", values, "currentShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellBetween(Long value1, Long value2) {
            addCriterion("current_shell between", value1, value2, "currentShell");
            return (Criteria) this;
        }

        public Criteria andCurrentShellNotBetween(Long value1, Long value2) {
            addCriterion("current_shell not between", value1, value2, "currentShell");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdIsNull() {
            addCriterion("shell_opponent_user_id is null");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdIsNotNull() {
            addCriterion("shell_opponent_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdEqualTo(Long value) {
            addCriterion("shell_opponent_user_id =", value, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdNotEqualTo(Long value) {
            addCriterion("shell_opponent_user_id <>", value, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdGreaterThan(Long value) {
            addCriterion("shell_opponent_user_id >", value, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shell_opponent_user_id >=", value, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdLessThan(Long value) {
            addCriterion("shell_opponent_user_id <", value, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdLessThanOrEqualTo(Long value) {
            addCriterion("shell_opponent_user_id <=", value, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdIn(List<Long> values) {
            addCriterion("shell_opponent_user_id in", values, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdNotIn(List<Long> values) {
            addCriterion("shell_opponent_user_id not in", values, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdBetween(Long value1, Long value2) {
            addCriterion("shell_opponent_user_id between", value1, value2, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andShellOpponentUserIdNotBetween(Long value1, Long value2) {
            addCriterion("shell_opponent_user_id not between", value1, value2, "shellOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesIsNull() {
            addCriterion("rmb_income_and_expenses is null");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesIsNotNull() {
            addCriterion("rmb_income_and_expenses is not null");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesEqualTo(Integer value) {
            addCriterion("rmb_income_and_expenses =", value, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesNotEqualTo(Integer value) {
            addCriterion("rmb_income_and_expenses <>", value, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesGreaterThan(Integer value) {
            addCriterion("rmb_income_and_expenses >", value, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesGreaterThanOrEqualTo(Integer value) {
            addCriterion("rmb_income_and_expenses >=", value, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesLessThan(Integer value) {
            addCriterion("rmb_income_and_expenses <", value, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesLessThanOrEqualTo(Integer value) {
            addCriterion("rmb_income_and_expenses <=", value, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesIn(List<Integer> values) {
            addCriterion("rmb_income_and_expenses in", values, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesNotIn(List<Integer> values) {
            addCriterion("rmb_income_and_expenses not in", values, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesBetween(Integer value1, Integer value2) {
            addCriterion("rmb_income_and_expenses between", value1, value2, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andRmbIncomeAndExpensesNotBetween(Integer value1, Integer value2) {
            addCriterion("rmb_income_and_expenses not between", value1, value2, "rmbIncomeAndExpenses");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyIsNull() {
            addCriterion("original_money is null");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyIsNotNull() {
            addCriterion("original_money is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyEqualTo(Double value) {
            addCriterion("original_money =", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyNotEqualTo(Double value) {
            addCriterion("original_money <>", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyGreaterThan(Double value) {
            addCriterion("original_money >", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("original_money >=", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyLessThan(Double value) {
            addCriterion("original_money <", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("original_money <=", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyIn(List<Double> values) {
            addCriterion("original_money in", values, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyNotIn(List<Double> values) {
            addCriterion("original_money not in", values, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyBetween(Double value1, Double value2) {
            addCriterion("original_money between", value1, value2, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("original_money not between", value1, value2, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyIsNull() {
            addCriterion("current_money is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyIsNotNull() {
            addCriterion("current_money is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyEqualTo(Double value) {
            addCriterion("current_money =", value, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyNotEqualTo(Double value) {
            addCriterion("current_money <>", value, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyGreaterThan(Double value) {
            addCriterion("current_money >", value, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("current_money >=", value, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyLessThan(Double value) {
            addCriterion("current_money <", value, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyLessThanOrEqualTo(Double value) {
            addCriterion("current_money <=", value, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyIn(List<Double> values) {
            addCriterion("current_money in", values, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyNotIn(List<Double> values) {
            addCriterion("current_money not in", values, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyBetween(Double value1, Double value2) {
            addCriterion("current_money between", value1, value2, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMoneyNotBetween(Double value1, Double value2) {
            addCriterion("current_money not between", value1, value2, "currentMoney");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdIsNull() {
            addCriterion("rmb_opponent_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdIsNotNull() {
            addCriterion("rmb_opponent_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdEqualTo(Long value) {
            addCriterion("rmb_opponent_user_id =", value, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdNotEqualTo(Long value) {
            addCriterion("rmb_opponent_user_id <>", value, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdGreaterThan(Long value) {
            addCriterion("rmb_opponent_user_id >", value, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rmb_opponent_user_id >=", value, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdLessThan(Long value) {
            addCriterion("rmb_opponent_user_id <", value, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdLessThanOrEqualTo(Long value) {
            addCriterion("rmb_opponent_user_id <=", value, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdIn(List<Long> values) {
            addCriterion("rmb_opponent_user_id in", values, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdNotIn(List<Long> values) {
            addCriterion("rmb_opponent_user_id not in", values, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdBetween(Long value1, Long value2) {
            addCriterion("rmb_opponent_user_id between", value1, value2, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andRmbOpponentUserIdNotBetween(Long value1, Long value2) {
            addCriterion("rmb_opponent_user_id not between", value1, value2, "rmbOpponentUserId");
            return (Criteria) this;
        }

        public Criteria andWexinAccountIsNull() {
            addCriterion("wexin_account is null");
            return (Criteria) this;
        }

        public Criteria andWexinAccountIsNotNull() {
            addCriterion("wexin_account is not null");
            return (Criteria) this;
        }

        public Criteria andWexinAccountEqualTo(String value) {
            addCriterion("wexin_account =", value, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountNotEqualTo(String value) {
            addCriterion("wexin_account <>", value, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountGreaterThan(String value) {
            addCriterion("wexin_account >", value, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountGreaterThanOrEqualTo(String value) {
            addCriterion("wexin_account >=", value, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountLessThan(String value) {
            addCriterion("wexin_account <", value, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountLessThanOrEqualTo(String value) {
            addCriterion("wexin_account <=", value, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountLike(String value) {
            addCriterion("wexin_account like", value, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountNotLike(String value) {
            addCriterion("wexin_account not like", value, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountIn(List<String> values) {
            addCriterion("wexin_account in", values, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountNotIn(List<String> values) {
            addCriterion("wexin_account not in", values, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountBetween(String value1, String value2) {
            addCriterion("wexin_account between", value1, value2, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andWexinAccountNotBetween(String value1, String value2) {
            addCriterion("wexin_account not between", value1, value2, "wexinAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountIsNull() {
            addCriterion("zhifubao_account is null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountIsNotNull() {
            addCriterion("zhifubao_account is not null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountEqualTo(String value) {
            addCriterion("zhifubao_account =", value, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountNotEqualTo(String value) {
            addCriterion("zhifubao_account <>", value, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountGreaterThan(String value) {
            addCriterion("zhifubao_account >", value, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountGreaterThanOrEqualTo(String value) {
            addCriterion("zhifubao_account >=", value, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountLessThan(String value) {
            addCriterion("zhifubao_account <", value, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountLessThanOrEqualTo(String value) {
            addCriterion("zhifubao_account <=", value, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountLike(String value) {
            addCriterion("zhifubao_account like", value, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountNotLike(String value) {
            addCriterion("zhifubao_account not like", value, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountIn(List<String> values) {
            addCriterion("zhifubao_account in", values, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountNotIn(List<String> values) {
            addCriterion("zhifubao_account not in", values, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountBetween(String value1, String value2) {
            addCriterion("zhifubao_account between", value1, value2, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoAccountNotBetween(String value1, String value2) {
            addCriterion("zhifubao_account not between", value1, value2, "zhifubaoAccount");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("bank_card like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("bank_card not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeIsNull() {
            addCriterion("shell_create_time is null");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeIsNotNull() {
            addCriterion("shell_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeEqualTo(Date value) {
            addCriterion("shell_create_time =", value, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeNotEqualTo(Date value) {
            addCriterion("shell_create_time <>", value, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeGreaterThan(Date value) {
            addCriterion("shell_create_time >", value, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shell_create_time >=", value, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeLessThan(Date value) {
            addCriterion("shell_create_time <", value, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("shell_create_time <=", value, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeIn(List<Date> values) {
            addCriterion("shell_create_time in", values, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeNotIn(List<Date> values) {
            addCriterion("shell_create_time not in", values, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeBetween(Date value1, Date value2) {
            addCriterion("shell_create_time between", value1, value2, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andShellCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("shell_create_time not between", value1, value2, "shellCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeIsNull() {
            addCriterion("rmb_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeIsNotNull() {
            addCriterion("rmb_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeEqualTo(Date value) {
            addCriterion("rmb_create_time =", value, "rmbCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeNotEqualTo(Date value) {
            addCriterion("rmb_create_time <>", value, "rmbCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeGreaterThan(Date value) {
            addCriterion("rmb_create_time >", value, "rmbCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rmb_create_time >=", value, "rmbCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeLessThan(Date value) {
            addCriterion("rmb_create_time <", value, "rmbCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("rmb_create_time <=", value, "rmbCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeIn(List<Date> values) {
            addCriterion("rmb_create_time in", values, "rmbCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeNotIn(List<Date> values) {
            addCriterion("rmb_create_time not in", values, "rmbCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeBetween(Date value1, Date value2) {
            addCriterion("rmb_create_time between", value1, value2, "rmbCreateTime");
            return (Criteria) this;
        }

        public Criteria andRmbCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("rmb_create_time not between", value1, value2, "rmbCreateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}