package haihuang.bean;

import java.util.ArrayList;
import java.util.List;

public class HhDictionariesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HhDictionariesExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andDetailsNameIsNull() {
            addCriterion("details_name is null");
            return (Criteria) this;
        }

        public Criteria andDetailsNameIsNotNull() {
            addCriterion("details_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsNameEqualTo(String value) {
            addCriterion("details_name =", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameNotEqualTo(String value) {
            addCriterion("details_name <>", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameGreaterThan(String value) {
            addCriterion("details_name >", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameGreaterThanOrEqualTo(String value) {
            addCriterion("details_name >=", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameLessThan(String value) {
            addCriterion("details_name <", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameLessThanOrEqualTo(String value) {
            addCriterion("details_name <=", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameLike(String value) {
            addCriterion("details_name like", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameNotLike(String value) {
            addCriterion("details_name not like", value, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameIn(List<String> values) {
            addCriterion("details_name in", values, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameNotIn(List<String> values) {
            addCriterion("details_name not in", values, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameBetween(String value1, String value2) {
            addCriterion("details_name between", value1, value2, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetailsNameNotBetween(String value1, String value2) {
            addCriterion("details_name not between", value1, value2, "detailsName");
            return (Criteria) this;
        }

        public Criteria andDetails1IsNull() {
            addCriterion("details1 is null");
            return (Criteria) this;
        }

        public Criteria andDetails1IsNotNull() {
            addCriterion("details1 is not null");
            return (Criteria) this;
        }

        public Criteria andDetails1EqualTo(String value) {
            addCriterion("details1 =", value, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1NotEqualTo(String value) {
            addCriterion("details1 <>", value, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1GreaterThan(String value) {
            addCriterion("details1 >", value, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1GreaterThanOrEqualTo(String value) {
            addCriterion("details1 >=", value, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1LessThan(String value) {
            addCriterion("details1 <", value, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1LessThanOrEqualTo(String value) {
            addCriterion("details1 <=", value, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1Like(String value) {
            addCriterion("details1 like", value, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1NotLike(String value) {
            addCriterion("details1 not like", value, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1In(List<String> values) {
            addCriterion("details1 in", values, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1NotIn(List<String> values) {
            addCriterion("details1 not in", values, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1Between(String value1, String value2) {
            addCriterion("details1 between", value1, value2, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails1NotBetween(String value1, String value2) {
            addCriterion("details1 not between", value1, value2, "details1");
            return (Criteria) this;
        }

        public Criteria andDetails2IsNull() {
            addCriterion("details2 is null");
            return (Criteria) this;
        }

        public Criteria andDetails2IsNotNull() {
            addCriterion("details2 is not null");
            return (Criteria) this;
        }

        public Criteria andDetails2EqualTo(String value) {
            addCriterion("details2 =", value, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2NotEqualTo(String value) {
            addCriterion("details2 <>", value, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2GreaterThan(String value) {
            addCriterion("details2 >", value, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2GreaterThanOrEqualTo(String value) {
            addCriterion("details2 >=", value, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2LessThan(String value) {
            addCriterion("details2 <", value, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2LessThanOrEqualTo(String value) {
            addCriterion("details2 <=", value, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2Like(String value) {
            addCriterion("details2 like", value, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2NotLike(String value) {
            addCriterion("details2 not like", value, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2In(List<String> values) {
            addCriterion("details2 in", values, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2NotIn(List<String> values) {
            addCriterion("details2 not in", values, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2Between(String value1, String value2) {
            addCriterion("details2 between", value1, value2, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails2NotBetween(String value1, String value2) {
            addCriterion("details2 not between", value1, value2, "details2");
            return (Criteria) this;
        }

        public Criteria andDetails3IsNull() {
            addCriterion("details3 is null");
            return (Criteria) this;
        }

        public Criteria andDetails3IsNotNull() {
            addCriterion("details3 is not null");
            return (Criteria) this;
        }

        public Criteria andDetails3EqualTo(String value) {
            addCriterion("details3 =", value, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3NotEqualTo(String value) {
            addCriterion("details3 <>", value, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3GreaterThan(String value) {
            addCriterion("details3 >", value, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3GreaterThanOrEqualTo(String value) {
            addCriterion("details3 >=", value, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3LessThan(String value) {
            addCriterion("details3 <", value, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3LessThanOrEqualTo(String value) {
            addCriterion("details3 <=", value, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3Like(String value) {
            addCriterion("details3 like", value, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3NotLike(String value) {
            addCriterion("details3 not like", value, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3In(List<String> values) {
            addCriterion("details3 in", values, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3NotIn(List<String> values) {
            addCriterion("details3 not in", values, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3Between(String value1, String value2) {
            addCriterion("details3 between", value1, value2, "details3");
            return (Criteria) this;
        }

        public Criteria andDetails3NotBetween(String value1, String value2) {
            addCriterion("details3 not between", value1, value2, "details3");
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