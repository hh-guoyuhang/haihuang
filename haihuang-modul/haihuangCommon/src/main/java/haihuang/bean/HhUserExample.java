package haihuang.bean;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhotoIsNull() {
            addCriterion("user_photo is null");
            return (Criteria) this;
        }

        public Criteria andUserPhotoIsNotNull() {
            addCriterion("user_photo is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhotoEqualTo(String value) {
            addCriterion("user_photo =", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotEqualTo(String value) {
            addCriterion("user_photo <>", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoGreaterThan(String value) {
            addCriterion("user_photo >", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("user_photo >=", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoLessThan(String value) {
            addCriterion("user_photo <", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoLessThanOrEqualTo(String value) {
            addCriterion("user_photo <=", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoLike(String value) {
            addCriterion("user_photo like", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotLike(String value) {
            addCriterion("user_photo not like", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoIn(List<String> values) {
            addCriterion("user_photo in", values, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotIn(List<String> values) {
            addCriterion("user_photo not in", values, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoBetween(String value1, String value2) {
            addCriterion("user_photo between", value1, value2, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotBetween(String value1, String value2) {
            addCriterion("user_photo not between", value1, value2, "userPhoto");
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

        public Criteria andEmpiricalValueIsNull() {
            addCriterion("empirical_value is null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueIsNotNull() {
            addCriterion("empirical_value is not null");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueEqualTo(Integer value) {
            addCriterion("empirical_value =", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueNotEqualTo(Integer value) {
            addCriterion("empirical_value <>", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueGreaterThan(Integer value) {
            addCriterion("empirical_value >", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("empirical_value >=", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueLessThan(Integer value) {
            addCriterion("empirical_value <", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueLessThanOrEqualTo(Integer value) {
            addCriterion("empirical_value <=", value, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueIn(List<Integer> values) {
            addCriterion("empirical_value in", values, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueNotIn(List<Integer> values) {
            addCriterion("empirical_value not in", values, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueBetween(Integer value1, Integer value2) {
            addCriterion("empirical_value between", value1, value2, "empiricalValue");
            return (Criteria) this;
        }

        public Criteria andEmpiricalValueNotBetween(Integer value1, Integer value2) {
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

        public Criteria andBelongToTheSeaEqualTo(Integer value) {
            addCriterion("belong_to_the_sea =", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaNotEqualTo(Integer value) {
            addCriterion("belong_to_the_sea <>", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaGreaterThan(Integer value) {
            addCriterion("belong_to_the_sea >", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaGreaterThanOrEqualTo(Integer value) {
            addCriterion("belong_to_the_sea >=", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaLessThan(Integer value) {
            addCriterion("belong_to_the_sea <", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaLessThanOrEqualTo(Integer value) {
            addCriterion("belong_to_the_sea <=", value, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaIn(List<Integer> values) {
            addCriterion("belong_to_the_sea in", values, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaNotIn(List<Integer> values) {
            addCriterion("belong_to_the_sea not in", values, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaBetween(Integer value1, Integer value2) {
            addCriterion("belong_to_the_sea between", value1, value2, "belongToTheSea");
            return (Criteria) this;
        }

        public Criteria andBelongToTheSeaNotBetween(Integer value1, Integer value2) {
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

        public Criteria andOnlineEqualTo(Integer value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Integer value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Integer value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Integer value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Integer> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Integer> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Integer value1, Integer value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIsNull() {
            addCriterion("logout_time is null");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIsNotNull() {
            addCriterion("logout_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeEqualTo(Date value) {
            addCriterion("logout_time =", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotEqualTo(Date value) {
            addCriterion("logout_time <>", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeGreaterThan(Date value) {
            addCriterion("logout_time >", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logout_time >=", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeLessThan(Date value) {
            addCriterion("logout_time <", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("logout_time <=", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIn(List<Date> values) {
            addCriterion("logout_time in", values, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotIn(List<Date> values) {
            addCriterion("logout_time not in", values, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeBetween(Date value1, Date value2) {
            addCriterion("logout_time between", value1, value2, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("logout_time not between", value1, value2, "logoutTime");
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

        public Criteria andLoginMethodEqualTo(Integer value) {
            addCriterion("login_method =", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodNotEqualTo(Integer value) {
            addCriterion("login_method <>", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodGreaterThan(Integer value) {
            addCriterion("login_method >", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_method >=", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodLessThan(Integer value) {
            addCriterion("login_method <", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodLessThanOrEqualTo(Integer value) {
            addCriterion("login_method <=", value, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodIn(List<Integer> values) {
            addCriterion("login_method in", values, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodNotIn(List<Integer> values) {
            addCriterion("login_method not in", values, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodBetween(Integer value1, Integer value2) {
            addCriterion("login_method between", value1, value2, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andLoginMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("login_method not between", value1, value2, "loginMethod");
            return (Criteria) this;
        }

        public Criteria andHhidIsNull() {
            addCriterion("hhId is null");
            return (Criteria) this;
        }

        public Criteria andHhidIsNotNull() {
            addCriterion("hhId is not null");
            return (Criteria) this;
        }

        public Criteria andHhidEqualTo(String value) {
            addCriterion("hhId =", value, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidNotEqualTo(String value) {
            addCriterion("hhId <>", value, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidGreaterThan(String value) {
            addCriterion("hhId >", value, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidGreaterThanOrEqualTo(String value) {
            addCriterion("hhId >=", value, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidLessThan(String value) {
            addCriterion("hhId <", value, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidLessThanOrEqualTo(String value) {
            addCriterion("hhId <=", value, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidLike(String value) {
            addCriterion("hhId like", value, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidNotLike(String value) {
            addCriterion("hhId not like", value, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidIn(List<String> values) {
            addCriterion("hhId in", values, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidNotIn(List<String> values) {
            addCriterion("hhId not in", values, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidBetween(String value1, String value2) {
            addCriterion("hhId between", value1, value2, "hhid");
            return (Criteria) this;
        }

        public Criteria andHhidNotBetween(String value1, String value2) {
            addCriterion("hhId not between", value1, value2, "hhid");
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
            addCriterion("gift_Id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Long value) {
            addCriterion("gift_Id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Long value) {
            addCriterion("gift_Id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Long value) {
            addCriterion("gift_Id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gift_Id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Long value) {
            addCriterion("gift_Id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Long value) {
            addCriterion("gift_Id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Long> values) {
            addCriterion("gift_Id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Long> values) {
            addCriterion("gift_Id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Long value1, Long value2) {
            addCriterion("gift_Id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Long value1, Long value2) {
            addCriterion("gift_Id not between", value1, value2, "giftId");
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

        public Criteria andThirdpartyaccountIsNull() {
            addCriterion("thirdPartyAccount is null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountIsNotNull() {
            addCriterion("thirdPartyAccount is not null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountEqualTo(String value) {
            addCriterion("thirdPartyAccount =", value, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountNotEqualTo(String value) {
            addCriterion("thirdPartyAccount <>", value, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountGreaterThan(String value) {
            addCriterion("thirdPartyAccount >", value, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountGreaterThanOrEqualTo(String value) {
            addCriterion("thirdPartyAccount >=", value, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountLessThan(String value) {
            addCriterion("thirdPartyAccount <", value, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountLessThanOrEqualTo(String value) {
            addCriterion("thirdPartyAccount <=", value, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountLike(String value) {
            addCriterion("thirdPartyAccount like", value, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountNotLike(String value) {
            addCriterion("thirdPartyAccount not like", value, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountIn(List<String> values) {
            addCriterion("thirdPartyAccount in", values, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountNotIn(List<String> values) {
            addCriterion("thirdPartyAccount not in", values, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountBetween(String value1, String value2) {
            addCriterion("thirdPartyAccount between", value1, value2, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andThirdpartyaccountNotBetween(String value1, String value2) {
            addCriterion("thirdPartyAccount not between", value1, value2, "thirdpartyaccount");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthIsNull() {
            addCriterion("year_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthIsNotNull() {
            addCriterion("year_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthEqualTo(String value) {
            addCriterion("year_of_birth =", value, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthNotEqualTo(String value) {
            addCriterion("year_of_birth <>", value, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthGreaterThan(String value) {
            addCriterion("year_of_birth >", value, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthGreaterThanOrEqualTo(String value) {
            addCriterion("year_of_birth >=", value, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthLessThan(String value) {
            addCriterion("year_of_birth <", value, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthLessThanOrEqualTo(String value) {
            addCriterion("year_of_birth <=", value, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthLike(String value) {
            addCriterion("year_of_birth like", value, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthNotLike(String value) {
            addCriterion("year_of_birth not like", value, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthIn(List<String> values) {
            addCriterion("year_of_birth in", values, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthNotIn(List<String> values) {
            addCriterion("year_of_birth not in", values, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthBetween(String value1, String value2) {
            addCriterion("year_of_birth between", value1, value2, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andYearOfBirthNotBetween(String value1, String value2) {
            addCriterion("year_of_birth not between", value1, value2, "yearOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthIsNull() {
            addCriterion("month_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthIsNotNull() {
            addCriterion("month_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthEqualTo(String value) {
            addCriterion("month_of_birth =", value, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthNotEqualTo(String value) {
            addCriterion("month_of_birth <>", value, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthGreaterThan(String value) {
            addCriterion("month_of_birth >", value, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthGreaterThanOrEqualTo(String value) {
            addCriterion("month_of_birth >=", value, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthLessThan(String value) {
            addCriterion("month_of_birth <", value, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthLessThanOrEqualTo(String value) {
            addCriterion("month_of_birth <=", value, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthLike(String value) {
            addCriterion("month_of_birth like", value, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthNotLike(String value) {
            addCriterion("month_of_birth not like", value, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthIn(List<String> values) {
            addCriterion("month_of_birth in", values, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthNotIn(List<String> values) {
            addCriterion("month_of_birth not in", values, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthBetween(String value1, String value2) {
            addCriterion("month_of_birth between", value1, value2, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andMonthOfBirthNotBetween(String value1, String value2) {
            addCriterion("month_of_birth not between", value1, value2, "monthOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthIsNull() {
            addCriterion("day_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthIsNotNull() {
            addCriterion("day_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthEqualTo(String value) {
            addCriterion("day_of_birth =", value, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthNotEqualTo(String value) {
            addCriterion("day_of_birth <>", value, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthGreaterThan(String value) {
            addCriterion("day_of_birth >", value, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthGreaterThanOrEqualTo(String value) {
            addCriterion("day_of_birth >=", value, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthLessThan(String value) {
            addCriterion("day_of_birth <", value, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthLessThanOrEqualTo(String value) {
            addCriterion("day_of_birth <=", value, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthLike(String value) {
            addCriterion("day_of_birth like", value, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthNotLike(String value) {
            addCriterion("day_of_birth not like", value, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthIn(List<String> values) {
            addCriterion("day_of_birth in", values, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthNotIn(List<String> values) {
            addCriterion("day_of_birth not in", values, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthBetween(String value1, String value2) {
            addCriterion("day_of_birth between", value1, value2, "dayOfBirth");
            return (Criteria) this;
        }

        public Criteria andDayOfBirthNotBetween(String value1, String value2) {
            addCriterion("day_of_birth not between", value1, value2, "dayOfBirth");
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