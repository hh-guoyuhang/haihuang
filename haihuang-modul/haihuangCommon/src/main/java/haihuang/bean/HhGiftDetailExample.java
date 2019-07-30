package haihuang.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HhGiftDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HhGiftDetailExample() {
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

        public Criteria andOutUserIdIsNull() {
            addCriterion("out_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIsNotNull() {
            addCriterion("out_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutUserIdEqualTo(Long value) {
            addCriterion("out_user_id =", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotEqualTo(Long value) {
            addCriterion("out_user_id <>", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdGreaterThan(Long value) {
            addCriterion("out_user_id >", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("out_user_id >=", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdLessThan(Long value) {
            addCriterion("out_user_id <", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdLessThanOrEqualTo(Long value) {
            addCriterion("out_user_id <=", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIn(List<Long> values) {
            addCriterion("out_user_id in", values, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotIn(List<Long> values) {
            addCriterion("out_user_id not in", values, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdBetween(Long value1, Long value2) {
            addCriterion("out_user_id between", value1, value2, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotBetween(Long value1, Long value2) {
            addCriterion("out_user_id not between", value1, value2, "outUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdIsNull() {
            addCriterion("in_user_id is null");
            return (Criteria) this;
        }

        public Criteria andInUserIdIsNotNull() {
            addCriterion("in_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andInUserIdEqualTo(Long value) {
            addCriterion("in_user_id =", value, "inUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdNotEqualTo(Long value) {
            addCriterion("in_user_id <>", value, "inUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdGreaterThan(Long value) {
            addCriterion("in_user_id >", value, "inUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("in_user_id >=", value, "inUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdLessThan(Long value) {
            addCriterion("in_user_id <", value, "inUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdLessThanOrEqualTo(Long value) {
            addCriterion("in_user_id <=", value, "inUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdIn(List<Long> values) {
            addCriterion("in_user_id in", values, "inUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdNotIn(List<Long> values) {
            addCriterion("in_user_id not in", values, "inUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdBetween(Long value1, Long value2) {
            addCriterion("in_user_id between", value1, value2, "inUserId");
            return (Criteria) this;
        }

        public Criteria andInUserIdNotBetween(Long value1, Long value2) {
            addCriterion("in_user_id not between", value1, value2, "inUserId");
            return (Criteria) this;
        }

        public Criteria andGiftTypeIsNull() {
            addCriterion("gift_type is null");
            return (Criteria) this;
        }

        public Criteria andGiftTypeIsNotNull() {
            addCriterion("gift_type is not null");
            return (Criteria) this;
        }

        public Criteria andGiftTypeEqualTo(String value) {
            addCriterion("gift_type =", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeNotEqualTo(String value) {
            addCriterion("gift_type <>", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeGreaterThan(String value) {
            addCriterion("gift_type >", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gift_type >=", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeLessThan(String value) {
            addCriterion("gift_type <", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeLessThanOrEqualTo(String value) {
            addCriterion("gift_type <=", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeLike(String value) {
            addCriterion("gift_type like", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeNotLike(String value) {
            addCriterion("gift_type not like", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeIn(List<String> values) {
            addCriterion("gift_type in", values, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeNotIn(List<String> values) {
            addCriterion("gift_type not in", values, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeBetween(String value1, String value2) {
            addCriterion("gift_type between", value1, value2, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeNotBetween(String value1, String value2) {
            addCriterion("gift_type not between", value1, value2, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNull() {
            addCriterion("gift_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNotNull() {
            addCriterion("gift_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftNameEqualTo(String value) {
            addCriterion("gift_name =", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotEqualTo(String value) {
            addCriterion("gift_name <>", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThan(String value) {
            addCriterion("gift_name >", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("gift_name >=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThan(String value) {
            addCriterion("gift_name <", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThanOrEqualTo(String value) {
            addCriterion("gift_name <=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLike(String value) {
            addCriterion("gift_name like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotLike(String value) {
            addCriterion("gift_name not like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameIn(List<String> values) {
            addCriterion("gift_name in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotIn(List<String> values) {
            addCriterion("gift_name not in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameBetween(String value1, String value2) {
            addCriterion("gift_name between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotBetween(String value1, String value2) {
            addCriterion("gift_name not between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftCountIsNull() {
            addCriterion("gift_count is null");
            return (Criteria) this;
        }

        public Criteria andGiftCountIsNotNull() {
            addCriterion("gift_count is not null");
            return (Criteria) this;
        }

        public Criteria andGiftCountEqualTo(Integer value) {
            addCriterion("gift_count =", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotEqualTo(Integer value) {
            addCriterion("gift_count <>", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountGreaterThan(Integer value) {
            addCriterion("gift_count >", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_count >=", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountLessThan(Integer value) {
            addCriterion("gift_count <", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountLessThanOrEqualTo(Integer value) {
            addCriterion("gift_count <=", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountIn(List<Integer> values) {
            addCriterion("gift_count in", values, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotIn(List<Integer> values) {
            addCriterion("gift_count not in", values, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountBetween(Integer value1, Integer value2) {
            addCriterion("gift_count between", value1, value2, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_count not between", value1, value2, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNull() {
            addCriterion("gift_money is null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNotNull() {
            addCriterion("gift_money is not null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyEqualTo(Double value) {
            addCriterion("gift_money =", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotEqualTo(Double value) {
            addCriterion("gift_money <>", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThan(Double value) {
            addCriterion("gift_money >", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("gift_money >=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThan(Double value) {
            addCriterion("gift_money <", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThanOrEqualTo(Double value) {
            addCriterion("gift_money <=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIn(List<Double> values) {
            addCriterion("gift_money in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotIn(List<Double> values) {
            addCriterion("gift_money not in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyBetween(Double value1, Double value2) {
            addCriterion("gift_money between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotBetween(Double value1, Double value2) {
            addCriterion("gift_money not between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiverIsNull() {
            addCriterion("giver is null");
            return (Criteria) this;
        }

        public Criteria andGiverIsNotNull() {
            addCriterion("giver is not null");
            return (Criteria) this;
        }

        public Criteria andGiverEqualTo(String value) {
            addCriterion("giver =", value, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverNotEqualTo(String value) {
            addCriterion("giver <>", value, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverGreaterThan(String value) {
            addCriterion("giver >", value, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverGreaterThanOrEqualTo(String value) {
            addCriterion("giver >=", value, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverLessThan(String value) {
            addCriterion("giver <", value, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverLessThanOrEqualTo(String value) {
            addCriterion("giver <=", value, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverLike(String value) {
            addCriterion("giver like", value, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverNotLike(String value) {
            addCriterion("giver not like", value, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverIn(List<String> values) {
            addCriterion("giver in", values, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverNotIn(List<String> values) {
            addCriterion("giver not in", values, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverBetween(String value1, String value2) {
            addCriterion("giver between", value1, value2, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverNotBetween(String value1, String value2) {
            addCriterion("giver not between", value1, value2, "giver");
            return (Criteria) this;
        }

        public Criteria andGiverTimeIsNull() {
            addCriterion("giver_time is null");
            return (Criteria) this;
        }

        public Criteria andGiverTimeIsNotNull() {
            addCriterion("giver_time is not null");
            return (Criteria) this;
        }

        public Criteria andGiverTimeEqualTo(Date value) {
            addCriterion("giver_time =", value, "giverTime");
            return (Criteria) this;
        }

        public Criteria andGiverTimeNotEqualTo(Date value) {
            addCriterion("giver_time <>", value, "giverTime");
            return (Criteria) this;
        }

        public Criteria andGiverTimeGreaterThan(Date value) {
            addCriterion("giver_time >", value, "giverTime");
            return (Criteria) this;
        }

        public Criteria andGiverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("giver_time >=", value, "giverTime");
            return (Criteria) this;
        }

        public Criteria andGiverTimeLessThan(Date value) {
            addCriterion("giver_time <", value, "giverTime");
            return (Criteria) this;
        }

        public Criteria andGiverTimeLessThanOrEqualTo(Date value) {
            addCriterion("giver_time <=", value, "giverTime");
            return (Criteria) this;
        }

        public Criteria andGiverTimeIn(List<Date> values) {
            addCriterion("giver_time in", values, "giverTime");
            return (Criteria) this;
        }

        public Criteria andGiverTimeNotIn(List<Date> values) {
            addCriterion("giver_time not in", values, "giverTime");
            return (Criteria) this;
        }

        public Criteria andGiverTimeBetween(Date value1, Date value2) {
            addCriterion("giver_time between", value1, value2, "giverTime");
            return (Criteria) this;
        }

        public Criteria andGiverTimeNotBetween(Date value1, Date value2) {
            addCriterion("giver_time not between", value1, value2, "giverTime");
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