package haihuang.bean;

import java.util.ArrayList;
import java.util.List;

public class HhDynamicDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HhDynamicDetailsExample() {
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

        public Criteria andPhoto1IsNull() {
            addCriterion("photo1 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto1IsNotNull() {
            addCriterion("photo1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto1EqualTo(String value) {
            addCriterion("photo1 =", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotEqualTo(String value) {
            addCriterion("photo1 <>", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1GreaterThan(String value) {
            addCriterion("photo1 >", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1GreaterThanOrEqualTo(String value) {
            addCriterion("photo1 >=", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1LessThan(String value) {
            addCriterion("photo1 <", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1LessThanOrEqualTo(String value) {
            addCriterion("photo1 <=", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1Like(String value) {
            addCriterion("photo1 like", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotLike(String value) {
            addCriterion("photo1 not like", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1In(List<String> values) {
            addCriterion("photo1 in", values, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotIn(List<String> values) {
            addCriterion("photo1 not in", values, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1Between(String value1, String value2) {
            addCriterion("photo1 between", value1, value2, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotBetween(String value1, String value2) {
            addCriterion("photo1 not between", value1, value2, "photo1");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNull() {
            addCriterion("voice is null");
            return (Criteria) this;
        }

        public Criteria andVoiceIsNotNull() {
            addCriterion("voice is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceEqualTo(String value) {
            addCriterion("voice =", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotEqualTo(String value) {
            addCriterion("voice <>", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThan(String value) {
            addCriterion("voice >", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceGreaterThanOrEqualTo(String value) {
            addCriterion("voice >=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThan(String value) {
            addCriterion("voice <", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLessThanOrEqualTo(String value) {
            addCriterion("voice <=", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceLike(String value) {
            addCriterion("voice like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotLike(String value) {
            addCriterion("voice not like", value, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceIn(List<String> values) {
            addCriterion("voice in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotIn(List<String> values) {
            addCriterion("voice not in", values, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceBetween(String value1, String value2) {
            addCriterion("voice between", value1, value2, "voice");
            return (Criteria) this;
        }

        public Criteria andVoiceNotBetween(String value1, String value2) {
            addCriterion("voice not between", value1, value2, "voice");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andWordIsNull() {
            addCriterion("word is null");
            return (Criteria) this;
        }

        public Criteria andWordIsNotNull() {
            addCriterion("word is not null");
            return (Criteria) this;
        }

        public Criteria andWordEqualTo(String value) {
            addCriterion("word =", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotEqualTo(String value) {
            addCriterion("word <>", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThan(String value) {
            addCriterion("word >", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThanOrEqualTo(String value) {
            addCriterion("word >=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThan(String value) {
            addCriterion("word <", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThanOrEqualTo(String value) {
            addCriterion("word <=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLike(String value) {
            addCriterion("word like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotLike(String value) {
            addCriterion("word not like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordIn(List<String> values) {
            addCriterion("word in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotIn(List<String> values) {
            addCriterion("word not in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordBetween(String value1, String value2) {
            addCriterion("word between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotBetween(String value1, String value2) {
            addCriterion("word not between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andPhoto2IsNull() {
            addCriterion("photo2 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto2IsNotNull() {
            addCriterion("photo2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto2EqualTo(String value) {
            addCriterion("photo2 =", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotEqualTo(String value) {
            addCriterion("photo2 <>", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2GreaterThan(String value) {
            addCriterion("photo2 >", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2GreaterThanOrEqualTo(String value) {
            addCriterion("photo2 >=", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2LessThan(String value) {
            addCriterion("photo2 <", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2LessThanOrEqualTo(String value) {
            addCriterion("photo2 <=", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2Like(String value) {
            addCriterion("photo2 like", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotLike(String value) {
            addCriterion("photo2 not like", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2In(List<String> values) {
            addCriterion("photo2 in", values, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotIn(List<String> values) {
            addCriterion("photo2 not in", values, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2Between(String value1, String value2) {
            addCriterion("photo2 between", value1, value2, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotBetween(String value1, String value2) {
            addCriterion("photo2 not between", value1, value2, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto3IsNull() {
            addCriterion("photo3 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto3IsNotNull() {
            addCriterion("photo3 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto3EqualTo(String value) {
            addCriterion("photo3 =", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotEqualTo(String value) {
            addCriterion("photo3 <>", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3GreaterThan(String value) {
            addCriterion("photo3 >", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3GreaterThanOrEqualTo(String value) {
            addCriterion("photo3 >=", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3LessThan(String value) {
            addCriterion("photo3 <", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3LessThanOrEqualTo(String value) {
            addCriterion("photo3 <=", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3Like(String value) {
            addCriterion("photo3 like", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotLike(String value) {
            addCriterion("photo3 not like", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3In(List<String> values) {
            addCriterion("photo3 in", values, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotIn(List<String> values) {
            addCriterion("photo3 not in", values, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3Between(String value1, String value2) {
            addCriterion("photo3 between", value1, value2, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotBetween(String value1, String value2) {
            addCriterion("photo3 not between", value1, value2, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto4IsNull() {
            addCriterion("photo4 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto4IsNotNull() {
            addCriterion("photo4 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto4EqualTo(String value) {
            addCriterion("photo4 =", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotEqualTo(String value) {
            addCriterion("photo4 <>", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4GreaterThan(String value) {
            addCriterion("photo4 >", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4GreaterThanOrEqualTo(String value) {
            addCriterion("photo4 >=", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4LessThan(String value) {
            addCriterion("photo4 <", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4LessThanOrEqualTo(String value) {
            addCriterion("photo4 <=", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4Like(String value) {
            addCriterion("photo4 like", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotLike(String value) {
            addCriterion("photo4 not like", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4In(List<String> values) {
            addCriterion("photo4 in", values, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotIn(List<String> values) {
            addCriterion("photo4 not in", values, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4Between(String value1, String value2) {
            addCriterion("photo4 between", value1, value2, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotBetween(String value1, String value2) {
            addCriterion("photo4 not between", value1, value2, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto5IsNull() {
            addCriterion("photo5 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto5IsNotNull() {
            addCriterion("photo5 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto5EqualTo(String value) {
            addCriterion("photo5 =", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotEqualTo(String value) {
            addCriterion("photo5 <>", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5GreaterThan(String value) {
            addCriterion("photo5 >", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5GreaterThanOrEqualTo(String value) {
            addCriterion("photo5 >=", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5LessThan(String value) {
            addCriterion("photo5 <", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5LessThanOrEqualTo(String value) {
            addCriterion("photo5 <=", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5Like(String value) {
            addCriterion("photo5 like", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotLike(String value) {
            addCriterion("photo5 not like", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5In(List<String> values) {
            addCriterion("photo5 in", values, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotIn(List<String> values) {
            addCriterion("photo5 not in", values, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5Between(String value1, String value2) {
            addCriterion("photo5 between", value1, value2, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotBetween(String value1, String value2) {
            addCriterion("photo5 not between", value1, value2, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto6IsNull() {
            addCriterion("photo6 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto6IsNotNull() {
            addCriterion("photo6 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto6EqualTo(String value) {
            addCriterion("photo6 =", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotEqualTo(String value) {
            addCriterion("photo6 <>", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6GreaterThan(String value) {
            addCriterion("photo6 >", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6GreaterThanOrEqualTo(String value) {
            addCriterion("photo6 >=", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6LessThan(String value) {
            addCriterion("photo6 <", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6LessThanOrEqualTo(String value) {
            addCriterion("photo6 <=", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6Like(String value) {
            addCriterion("photo6 like", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotLike(String value) {
            addCriterion("photo6 not like", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6In(List<String> values) {
            addCriterion("photo6 in", values, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotIn(List<String> values) {
            addCriterion("photo6 not in", values, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6Between(String value1, String value2) {
            addCriterion("photo6 between", value1, value2, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotBetween(String value1, String value2) {
            addCriterion("photo6 not between", value1, value2, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto7IsNull() {
            addCriterion("photo7 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto7IsNotNull() {
            addCriterion("photo7 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto7EqualTo(String value) {
            addCriterion("photo7 =", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotEqualTo(String value) {
            addCriterion("photo7 <>", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7GreaterThan(String value) {
            addCriterion("photo7 >", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7GreaterThanOrEqualTo(String value) {
            addCriterion("photo7 >=", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7LessThan(String value) {
            addCriterion("photo7 <", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7LessThanOrEqualTo(String value) {
            addCriterion("photo7 <=", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7Like(String value) {
            addCriterion("photo7 like", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotLike(String value) {
            addCriterion("photo7 not like", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7In(List<String> values) {
            addCriterion("photo7 in", values, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotIn(List<String> values) {
            addCriterion("photo7 not in", values, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7Between(String value1, String value2) {
            addCriterion("photo7 between", value1, value2, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotBetween(String value1, String value2) {
            addCriterion("photo7 not between", value1, value2, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto8IsNull() {
            addCriterion("photo8 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto8IsNotNull() {
            addCriterion("photo8 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto8EqualTo(String value) {
            addCriterion("photo8 =", value, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8NotEqualTo(String value) {
            addCriterion("photo8 <>", value, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8GreaterThan(String value) {
            addCriterion("photo8 >", value, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8GreaterThanOrEqualTo(String value) {
            addCriterion("photo8 >=", value, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8LessThan(String value) {
            addCriterion("photo8 <", value, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8LessThanOrEqualTo(String value) {
            addCriterion("photo8 <=", value, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8Like(String value) {
            addCriterion("photo8 like", value, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8NotLike(String value) {
            addCriterion("photo8 not like", value, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8In(List<String> values) {
            addCriterion("photo8 in", values, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8NotIn(List<String> values) {
            addCriterion("photo8 not in", values, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8Between(String value1, String value2) {
            addCriterion("photo8 between", value1, value2, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto8NotBetween(String value1, String value2) {
            addCriterion("photo8 not between", value1, value2, "photo8");
            return (Criteria) this;
        }

        public Criteria andPhoto9IsNull() {
            addCriterion("photo9 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto9IsNotNull() {
            addCriterion("photo9 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto9EqualTo(String value) {
            addCriterion("photo9 =", value, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9NotEqualTo(String value) {
            addCriterion("photo9 <>", value, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9GreaterThan(String value) {
            addCriterion("photo9 >", value, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9GreaterThanOrEqualTo(String value) {
            addCriterion("photo9 >=", value, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9LessThan(String value) {
            addCriterion("photo9 <", value, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9LessThanOrEqualTo(String value) {
            addCriterion("photo9 <=", value, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9Like(String value) {
            addCriterion("photo9 like", value, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9NotLike(String value) {
            addCriterion("photo9 not like", value, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9In(List<String> values) {
            addCriterion("photo9 in", values, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9NotIn(List<String> values) {
            addCriterion("photo9 not in", values, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9Between(String value1, String value2) {
            addCriterion("photo9 between", value1, value2, "photo9");
            return (Criteria) this;
        }

        public Criteria andPhoto9NotBetween(String value1, String value2) {
            addCriterion("photo9 not between", value1, value2, "photo9");
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