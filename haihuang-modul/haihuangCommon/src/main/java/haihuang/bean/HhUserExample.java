package haihuang.bean;

import java.util.ArrayList;
import java.util.List;

public class HhUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HhUserExample() {
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

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("pass_word is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("pass_word is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("pass_word =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("pass_word <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("pass_word >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("pass_word >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("pass_word <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("pass_word <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("pass_word like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("pass_word not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("pass_word in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("pass_word not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("pass_word between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("pass_word not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
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

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueIsNull() {
            addCriterion("empirical_value is null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueIsNotNull() {
            addCriterion("empirical_value is not null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueEqualTo(String value) {
            addCriterion("empirical_value =", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueNotEqualTo(String value) {
            addCriterion("empirical_value <>", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueGreaterThan(String value) {
            addCriterion("empirical_value >", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueGreaterThanOrEqualTo(String value) {
            addCriterion("empirical_value >=", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueLessThan(String value) {
            addCriterion("empirical_value <", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueLessThanOrEqualTo(String value) {
            addCriterion("empirical_value <=", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueLike(String value) {
            addCriterion("empirical_value like", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueNotLike(String value) {
            addCriterion("empirical_value not like", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueIn(List<String> values) {
            addCriterion("empirical_value in", values, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueNotIn(List<String> values) {
            addCriterion("empirical_value not in", values, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueBetween(String value1, String value2) {
            addCriterion("empirical_value between", value1, value2, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueNotBetween(String value1, String value2) {
            addCriterion("empirical_value not between", value1, value2, "empiricalValue");
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

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
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

        public Criteria andRanksEqualTo(String value) {
            addCriterion("ranks =", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksNotEqualTo(String value) {
            addCriterion("ranks <>", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksGreaterThan(String value) {
            addCriterion("ranks >", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksGreaterThanOrEqualTo(String value) {
            addCriterion("ranks >=", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksLessThan(String value) {
            addCriterion("ranks <", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksLessThanOrEqualTo(String value) {
            addCriterion("ranks <=", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksLike(String value) {
            addCriterion("ranks like", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksNotLike(String value) {
            addCriterion("ranks not like", value, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksIn(List<String> values) {
            addCriterion("ranks in", values, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksNotIn(List<String> values) {
            addCriterion("ranks not in", values, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksBetween(String value1, String value2) {
            addCriterion("ranks between", value1, value2, "ranks");
            return (Criteria) this;
        }

        public Criteria andRanksNotBetween(String value1, String value2) {
            addCriterion("ranks not between", value1, value2, "ranks");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyIsNull() {
            addCriterion("article_energy is null");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyIsNotNull() {
            addCriterion("article_energy is not null");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyEqualTo(String value) {
            addCriterion("article_energy =", value, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyNotEqualTo(String value) {
            addCriterion("article_energy <>", value, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyGreaterThan(String value) {
            addCriterion("article_energy >", value, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyGreaterThanOrEqualTo(String value) {
            addCriterion("article_energy >=", value, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyLessThan(String value) {
            addCriterion("article_energy <", value, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyLessThanOrEqualTo(String value) {
            addCriterion("article_energy <=", value, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyLike(String value) {
            addCriterion("article_energy like", value, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyNotLike(String value) {
            addCriterion("article_energy not like", value, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyIn(List<String> values) {
            addCriterion("article_energy in", values, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyNotIn(List<String> values) {
            addCriterion("article_energy not in", values, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyBetween(String value1, String value2) {
            addCriterion("article_energy between", value1, value2, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andArticleEnergyNotBetween(String value1, String value2) {
            addCriterion("article_energy not between", value1, value2, "articleEnergy");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaIsNull() {
            addCriterion("belong_to_the_sea is null");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaIsNotNull() {
            addCriterion("belong_to_the_sea is not null");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaEqualTo(String value) {
            addCriterion("belong_to_the_sea =", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaNotEqualTo(String value) {
            addCriterion("belong_to_the_sea <>", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaGreaterThan(String value) {
            addCriterion("belong_to_the_sea >", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaGreaterThanOrEqualTo(String value) {
            addCriterion("belong_to_the_sea >=", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaLessThan(String value) {
            addCriterion("belong_to_the_sea <", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaLessThanOrEqualTo(String value) {
            addCriterion("belong_to_the_sea <=", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaLike(String value) {
            addCriterion("belong_to_the_sea like", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaNotLike(String value) {
            addCriterion("belong_to_the_sea not like", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaIn(List<String> values) {
            addCriterion("belong_to_the_sea in", values, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaNotIn(List<String> values) {
            addCriterion("belong_to_the_sea not in", values, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaBetween(String value1, String value2) {
            addCriterion("belong_to_the_sea between", value1, value2, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaNotBetween(String value1, String value2) {
            addCriterion("belong_to_the_sea not between", value1, value2, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(String value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(String value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(String value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(String value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(String value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLike(String value) {
            addCriterion("online like", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotLike(String value) {
            addCriterion("online not like", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<String> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<String> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(String value1, String value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(String value1, String value2) {
            addCriterion("online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andLoginMethodIsNull() {
            addCriterion("login_method is null");
            return (Criteria) this;
        }

        public Criteria andLoginMethodIsNotNull() {
            addCriterion("login_method is not null");
            return (Criteria) this;
        }

        public Criteria andLoginMethodEqualTo(String value) {
            addCriterion("login_method =", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodNotEqualTo(String value) {
            addCriterion("login_method <>", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodGreaterThan(String value) {
            addCriterion("login_method >", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodGreaterThanOrEqualTo(String value) {
            addCriterion("login_method >=", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodLessThan(String value) {
            addCriterion("login_method <", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodLessThanOrEqualTo(String value) {
            addCriterion("login_method <=", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodLike(String value) {
            addCriterion("login_method like", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodNotLike(String value) {
            addCriterion("login_method not like", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodIn(List<String> values) {
            addCriterion("login_method in", values, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodNotIn(List<String> values) {
            addCriterion("login_method not in", values, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodBetween(String value1, String value2) {
            addCriterion("login_method between", value1, value2, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodNotBetween(String value1, String value2) {
            addCriterion("login_method not between", value1, value2, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andHhIdIsNull() {
            addCriterion("hh_id is null");
            return (Criteria) this;
        }

        public Criteria andHhIdIsNotNull() {
            addCriterion("hh_id is not null");
            return (Criteria) this;
        }

        public Criteria andHhIdEqualTo(String value) {
            addCriterion("hh_id =", value, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdNotEqualTo(String value) {
            addCriterion("hh_id <>", value, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdGreaterThan(String value) {
            addCriterion("hh_id >", value, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdGreaterThanOrEqualTo(String value) {
            addCriterion("hh_id >=", value, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdLessThan(String value) {
            addCriterion("hh_id <", value, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdLessThanOrEqualTo(String value) {
            addCriterion("hh_id <=", value, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdLike(String value) {
            addCriterion("hh_id like", value, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdNotLike(String value) {
            addCriterion("hh_id not like", value, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdIn(List<String> values) {
            addCriterion("hh_id in", values, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdNotIn(List<String> values) {
            addCriterion("hh_id not in", values, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdBetween(String value1, String value2) {
            addCriterion("hh_id between", value1, value2, "hhId");
            return (Criteria) this;
        }

        public Criteria andHhIdNotBetween(String value1, String value2) {
            addCriterion("hh_id not between", value1, value2, "hhId");
            return (Criteria) this;
        }

        public Criteria andLimitsIsNull() {
            addCriterion("limits is null");
            return (Criteria) this;
        }

        public Criteria andLimitsIsNotNull() {
            addCriterion("limits is not null");
            return (Criteria) this;
        }

        public Criteria andLimitsEqualTo(Long value) {
            addCriterion("limits =", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsNotEqualTo(Long value) {
            addCriterion("limits <>", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsGreaterThan(Long value) {
            addCriterion("limits >", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsGreaterThanOrEqualTo(Long value) {
            addCriterion("limits >=", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsLessThan(Long value) {
            addCriterion("limits <", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsLessThanOrEqualTo(Long value) {
            addCriterion("limits <=", value, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsIn(List<Long> values) {
            addCriterion("limits in", values, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsNotIn(List<Long> values) {
            addCriterion("limits not in", values, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsBetween(Long value1, Long value2) {
            addCriterion("limits between", value1, value2, "limits");
            return (Criteria) this;
        }

        public Criteria andLimitsNotBetween(Long value1, Long value2) {
            addCriterion("limits not between", value1, value2, "limits");
            return (Criteria) this;
        }

        public Criteria andIdiographIsNull() {
            addCriterion("idiograph is null");
            return (Criteria) this;
        }

        public Criteria andIdiographIsNotNull() {
            addCriterion("idiograph is not null");
            return (Criteria) this;
        }

        public Criteria andIdiographEqualTo(String value) {
            addCriterion("idiograph =", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographNotEqualTo(String value) {
            addCriterion("idiograph <>", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographGreaterThan(String value) {
            addCriterion("idiograph >", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographGreaterThanOrEqualTo(String value) {
            addCriterion("idiograph >=", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographLessThan(String value) {
            addCriterion("idiograph <", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographLessThanOrEqualTo(String value) {
            addCriterion("idiograph <=", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographLike(String value) {
            addCriterion("idiograph like", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographNotLike(String value) {
            addCriterion("idiograph not like", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographIn(List<String> values) {
            addCriterion("idiograph in", values, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographNotIn(List<String> values) {
            addCriterion("idiograph not in", values, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographBetween(String value1, String value2) {
            addCriterion("idiograph between", value1, value2, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographNotBetween(String value1, String value2) {
            addCriterion("idiograph not between", value1, value2, "idiograph");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageIsNull() {
            addCriterion("background_image is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageIsNotNull() {
            addCriterion("background_image is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageEqualTo(String value) {
            addCriterion("background_image =", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageNotEqualTo(String value) {
            addCriterion("background_image <>", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageGreaterThan(String value) {
            addCriterion("background_image >", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageGreaterThanOrEqualTo(String value) {
            addCriterion("background_image >=", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageLessThan(String value) {
            addCriterion("background_image <", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageLessThanOrEqualTo(String value) {
            addCriterion("background_image <=", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageLike(String value) {
            addCriterion("background_image like", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageNotLike(String value) {
            addCriterion("background_image not like", value, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageIn(List<String> values) {
            addCriterion("background_image in", values, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageNotIn(List<String> values) {
            addCriterion("background_image not in", values, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageBetween(String value1, String value2) {
            addCriterion("background_image between", value1, value2, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andBackgroundImageNotBetween(String value1, String value2) {
            addCriterion("background_image not between", value1, value2, "backgroundImage");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNull() {
            addCriterion("gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Long value) {
            addCriterion("gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Long value) {
            addCriterion("gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Long value) {
            addCriterion("gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Long value) {
            addCriterion("gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Long value) {
            addCriterion("gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Long> values) {
            addCriterion("gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Long> values) {
            addCriterion("gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Long value1, Long value2) {
            addCriterion("gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Long value1, Long value2) {
            addCriterion("gift_id not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdIsNull() {
            addCriterion("interpersonal_id is null");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdIsNotNull() {
            addCriterion("interpersonal_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdEqualTo(Long value) {
            addCriterion("interpersonal_id =", value, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdNotEqualTo(Long value) {
            addCriterion("interpersonal_id <>", value, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdGreaterThan(Long value) {
            addCriterion("interpersonal_id >", value, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("interpersonal_id >=", value, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdLessThan(Long value) {
            addCriterion("interpersonal_id <", value, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdLessThanOrEqualTo(Long value) {
            addCriterion("interpersonal_id <=", value, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdIn(List<Long> values) {
            addCriterion("interpersonal_id in", values, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdNotIn(List<Long> values) {
            addCriterion("interpersonal_id not in", values, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdBetween(Long value1, Long value2) {
            addCriterion("interpersonal_id between", value1, value2, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andInterpersonalIdNotBetween(Long value1, Long value2) {
            addCriterion("interpersonal_id not between", value1, value2, "interpersonalId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Long value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Long value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Long value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Long value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Long value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Long> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Long> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Long value1, Long value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Long value1, Long value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIsNull() {
            addCriterion("dynamic_id is null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIsNotNull() {
            addCriterion("dynamic_id is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdEqualTo(Long value) {
            addCriterion("dynamic_id =", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotEqualTo(Long value) {
            addCriterion("dynamic_id <>", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThan(Long value) {
            addCriterion("dynamic_id >", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dynamic_id >=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThan(Long value) {
            addCriterion("dynamic_id <", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThanOrEqualTo(Long value) {
            addCriterion("dynamic_id <=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIn(List<Long> values) {
            addCriterion("dynamic_id in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotIn(List<Long> values) {
            addCriterion("dynamic_id not in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdBetween(Long value1, Long value2) {
            addCriterion("dynamic_id between", value1, value2, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotBetween(Long value1, Long value2) {
            addCriterion("dynamic_id not between", value1, value2, "dynamicId");
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

        public Criteria andBalanceMoneyIsNull() {
            addCriterion("balance_money is null");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyIsNotNull() {
            addCriterion("balance_money is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyEqualTo(Double value) {
            addCriterion("balance_money =", value, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyNotEqualTo(Double value) {
            addCriterion("balance_money <>", value, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyGreaterThan(Double value) {
            addCriterion("balance_money >", value, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("balance_money >=", value, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyLessThan(Double value) {
            addCriterion("balance_money <", value, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyLessThanOrEqualTo(Double value) {
            addCriterion("balance_money <=", value, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyIn(List<Double> values) {
            addCriterion("balance_money in", values, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyNotIn(List<Double> values) {
            addCriterion("balance_money not in", values, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyBetween(Double value1, Double value2) {
            addCriterion("balance_money between", value1, value2, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceMoneyNotBetween(Double value1, Double value2) {
            addCriterion("balance_money not between", value1, value2, "balanceMoney");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIsNull() {
            addCriterion("head_photo is null");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIsNotNull() {
            addCriterion("head_photo is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoEqualTo(String value) {
            addCriterion("head_photo =", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoNotEqualTo(String value) {
            addCriterion("head_photo <>", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoGreaterThan(String value) {
            addCriterion("head_photo >", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("head_photo >=", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoLessThan(String value) {
            addCriterion("head_photo <", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoLessThanOrEqualTo(String value) {
            addCriterion("head_photo <=", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoLike(String value) {
            addCriterion("head_photo like", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoNotLike(String value) {
            addCriterion("head_photo not like", value, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIn(List<String> values) {
            addCriterion("head_photo in", values, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoNotIn(List<String> values) {
            addCriterion("head_photo not in", values, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoBetween(String value1, String value2) {
            addCriterion("head_photo between", value1, value2, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoNotBetween(String value1, String value2) {
            addCriterion("head_photo not between", value1, value2, "headPhoto");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountIsNull() {
            addCriterion("third_party_account is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountIsNotNull() {
            addCriterion("third_party_account is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountEqualTo(String value) {
            addCriterion("third_party_account =", value, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountNotEqualTo(String value) {
            addCriterion("third_party_account <>", value, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountGreaterThan(String value) {
            addCriterion("third_party_account >", value, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountGreaterThanOrEqualTo(String value) {
            addCriterion("third_party_account >=", value, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountLessThan(String value) {
            addCriterion("third_party_account <", value, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountLessThanOrEqualTo(String value) {
            addCriterion("third_party_account <=", value, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountLike(String value) {
            addCriterion("third_party_account like", value, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountNotLike(String value) {
            addCriterion("third_party_account not like", value, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountIn(List<String> values) {
            addCriterion("third_party_account in", values, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountNotIn(List<String> values) {
            addCriterion("third_party_account not in", values, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountBetween(String value1, String value2) {
            addCriterion("third_party_account between", value1, value2, "thirdPartyAccount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyAccountNotBetween(String value1, String value2) {
            addCriterion("third_party_account not between", value1, value2, "thirdPartyAccount");
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