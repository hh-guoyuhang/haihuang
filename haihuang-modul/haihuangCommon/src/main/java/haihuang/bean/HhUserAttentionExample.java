package haihuang.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HhUserAttentionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HhUserAttentionExample() {
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

        public Criteria andAttentionUserIdIsNull() {
            addCriterion("attention_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdIsNotNull() {
            addCriterion("attention_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdEqualTo(Long value) {
            addCriterion("attention_user_id =", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdNotEqualTo(Long value) {
            addCriterion("attention_user_id <>", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdGreaterThan(Long value) {
            addCriterion("attention_user_id >", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("attention_user_id >=", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdLessThan(Long value) {
            addCriterion("attention_user_id <", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdLessThanOrEqualTo(Long value) {
            addCriterion("attention_user_id <=", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdIn(List<Long> values) {
            addCriterion("attention_user_id in", values, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdNotIn(List<Long> values) {
            addCriterion("attention_user_id not in", values, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdBetween(Long value1, Long value2) {
            addCriterion("attention_user_id between", value1, value2, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdNotBetween(Long value1, Long value2) {
            addCriterion("attention_user_id not between", value1, value2, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameIsNull() {
            addCriterion("attention_user_name is null");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameIsNotNull() {
            addCriterion("attention_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameEqualTo(String value) {
            addCriterion("attention_user_name =", value, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameNotEqualTo(String value) {
            addCriterion("attention_user_name <>", value, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameGreaterThan(String value) {
            addCriterion("attention_user_name >", value, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("attention_user_name >=", value, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameLessThan(String value) {
            addCriterion("attention_user_name <", value, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameLessThanOrEqualTo(String value) {
            addCriterion("attention_user_name <=", value, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameLike(String value) {
            addCriterion("attention_user_name like", value, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameNotLike(String value) {
            addCriterion("attention_user_name not like", value, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameIn(List<String> values) {
            addCriterion("attention_user_name in", values, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameNotIn(List<String> values) {
            addCriterion("attention_user_name not in", values, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameBetween(String value1, String value2) {
            addCriterion("attention_user_name between", value1, value2, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserNameNotBetween(String value1, String value2) {
            addCriterion("attention_user_name not between", value1, value2, "attentionUserName");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoIsNull() {
            addCriterion("attention_user_photo is null");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoIsNotNull() {
            addCriterion("attention_user_photo is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoEqualTo(String value) {
            addCriterion("attention_user_photo =", value, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoNotEqualTo(String value) {
            addCriterion("attention_user_photo <>", value, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoGreaterThan(String value) {
            addCriterion("attention_user_photo >", value, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("attention_user_photo >=", value, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoLessThan(String value) {
            addCriterion("attention_user_photo <", value, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoLessThanOrEqualTo(String value) {
            addCriterion("attention_user_photo <=", value, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoLike(String value) {
            addCriterion("attention_user_photo like", value, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoNotLike(String value) {
            addCriterion("attention_user_photo not like", value, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoIn(List<String> values) {
            addCriterion("attention_user_photo in", values, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoNotIn(List<String> values) {
            addCriterion("attention_user_photo not in", values, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoBetween(String value1, String value2) {
            addCriterion("attention_user_photo between", value1, value2, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andAttentionUserPhotoNotBetween(String value1, String value2) {
            addCriterion("attention_user_photo not between", value1, value2, "attentionUserPhoto");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andRanksIsNull() {
            addCriterion("ranks is null");
            return (Criteria) this;
        }

        public Criteria andRanksIsNotNull() {
            addCriterion("ranks is not null");
            return (Criteria) this;
        }

        public Criteria andRanksEqualTo(Integer value) {
            addCriterion("ranks =", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksNotEqualTo(Integer value) {
            addCriterion("ranks <>", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksGreaterThan(Integer value) {
            addCriterion("ranks >", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranks >=", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksLessThan(Integer value) {
            addCriterion("ranks <", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksLessThanOrEqualTo(Integer value) {
            addCriterion("ranks <=", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksIn(List<Integer> values) {
            addCriterion("ranks in", values, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksNotIn(List<Integer> values) {
            addCriterion("ranks not in", values, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksBetween(Integer value1, Integer value2) {
            addCriterion("ranks between", value1, value2, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksNotBetween(Integer value1, Integer value2) {
            addCriterion("ranks not between", value1, value2, "ranks");
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