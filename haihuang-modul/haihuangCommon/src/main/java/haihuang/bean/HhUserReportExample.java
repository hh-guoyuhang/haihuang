package haihuang.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HhUserReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HhUserReportExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdIsNull() {
            addCriterion("report_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReportUserIdIsNotNull() {
            addCriterion("report_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportUserIdEqualTo(Long value) {
            addCriterion("report_user_id =", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdNotEqualTo(Long value) {
            addCriterion("report_user_id <>", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdGreaterThan(Long value) {
            addCriterion("report_user_id >", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("report_user_id >=", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdLessThan(Long value) {
            addCriterion("report_user_id <", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdLessThanOrEqualTo(Long value) {
            addCriterion("report_user_id <=", value, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdIn(List<Long> values) {
            addCriterion("report_user_id in", values, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdNotIn(List<Long> values) {
            addCriterion("report_user_id not in", values, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdBetween(Long value1, Long value2) {
            addCriterion("report_user_id between", value1, value2, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportUserIdNotBetween(Long value1, Long value2) {
            addCriterion("report_user_id not between", value1, value2, "reportUserId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdIsNull() {
            addCriterion("report_room_id is null");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdIsNotNull() {
            addCriterion("report_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdEqualTo(Long value) {
            addCriterion("report_room_id =", value, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdNotEqualTo(Long value) {
            addCriterion("report_room_id <>", value, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdGreaterThan(Long value) {
            addCriterion("report_room_id >", value, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("report_room_id >=", value, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdLessThan(Long value) {
            addCriterion("report_room_id <", value, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdLessThanOrEqualTo(Long value) {
            addCriterion("report_room_id <=", value, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdIn(List<Long> values) {
            addCriterion("report_room_id in", values, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdNotIn(List<Long> values) {
            addCriterion("report_room_id not in", values, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdBetween(Long value1, Long value2) {
            addCriterion("report_room_id between", value1, value2, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportRoomIdNotBetween(Long value1, Long value2) {
            addCriterion("report_room_id not between", value1, value2, "reportRoomId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdIsNull() {
            addCriterion("report_dynamic_id is null");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdIsNotNull() {
            addCriterion("report_dynamic_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdEqualTo(Long value) {
            addCriterion("report_dynamic_id =", value, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdNotEqualTo(Long value) {
            addCriterion("report_dynamic_id <>", value, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdGreaterThan(Long value) {
            addCriterion("report_dynamic_id >", value, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("report_dynamic_id >=", value, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdLessThan(Long value) {
            addCriterion("report_dynamic_id <", value, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdLessThanOrEqualTo(Long value) {
            addCriterion("report_dynamic_id <=", value, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdIn(List<Long> values) {
            addCriterion("report_dynamic_id in", values, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdNotIn(List<Long> values) {
            addCriterion("report_dynamic_id not in", values, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdBetween(Long value1, Long value2) {
            addCriterion("report_dynamic_id between", value1, value2, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andReportDynamicIdNotBetween(Long value1, Long value2) {
            addCriterion("report_dynamic_id not between", value1, value2, "reportDynamicId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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