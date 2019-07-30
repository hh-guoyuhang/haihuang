package haihuang.bean;

import java.util.ArrayList;
import java.util.List;

public class HhGiftStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HhGiftStatisticsExample() {
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

        public Criteria andFishFoodMoneyIsNull() {
            addCriterion("fish_food_money is null");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyIsNotNull() {
            addCriterion("fish_food_money is not null");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyEqualTo(Double value) {
            addCriterion("fish_food_money =", value, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyNotEqualTo(Double value) {
            addCriterion("fish_food_money <>", value, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyGreaterThan(Double value) {
            addCriterion("fish_food_money >", value, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("fish_food_money >=", value, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyLessThan(Double value) {
            addCriterion("fish_food_money <", value, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyLessThanOrEqualTo(Double value) {
            addCriterion("fish_food_money <=", value, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyIn(List<Double> values) {
            addCriterion("fish_food_money in", values, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyNotIn(List<Double> values) {
            addCriterion("fish_food_money not in", values, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyBetween(Double value1, Double value2) {
            addCriterion("fish_food_money between", value1, value2, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodMoneyNotBetween(Double value1, Double value2) {
            addCriterion("fish_food_money not between", value1, value2, "fishFoodMoney");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountIsNull() {
            addCriterion("fish_food_count is null");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountIsNotNull() {
            addCriterion("fish_food_count is not null");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountEqualTo(Integer value) {
            addCriterion("fish_food_count =", value, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountNotEqualTo(Integer value) {
            addCriterion("fish_food_count <>", value, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountGreaterThan(Integer value) {
            addCriterion("fish_food_count >", value, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fish_food_count >=", value, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountLessThan(Integer value) {
            addCriterion("fish_food_count <", value, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountLessThanOrEqualTo(Integer value) {
            addCriterion("fish_food_count <=", value, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountIn(List<Integer> values) {
            addCriterion("fish_food_count in", values, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountNotIn(List<Integer> values) {
            addCriterion("fish_food_count not in", values, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountBetween(Integer value1, Integer value2) {
            addCriterion("fish_food_count between", value1, value2, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andFishFoodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fish_food_count not between", value1, value2, "fishFoodCount");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyIsNull() {
            addCriterion("\" pearl_money\" is null");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyIsNotNull() {
            addCriterion("\" pearl_money\" is not null");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyEqualTo(Double value) {
            addCriterion("\" pearl_money\" =", value, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyNotEqualTo(Double value) {
            addCriterion("\" pearl_money\" <>", value, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyGreaterThan(Double value) {
            addCriterion("\" pearl_money\" >", value, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("\" pearl_money\" >=", value, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyLessThan(Double value) {
            addCriterion("\" pearl_money\" <", value, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyLessThanOrEqualTo(Double value) {
            addCriterion("\" pearl_money\" <=", value, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyIn(List<Double> values) {
            addCriterion("\" pearl_money\" in", values, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyNotIn(List<Double> values) {
            addCriterion("\" pearl_money\" not in", values, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyBetween(Double value1, Double value2) {
            addCriterion("\" pearl_money\" between", value1, value2, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlMoneyNotBetween(Double value1, Double value2) {
            addCriterion("\" pearl_money\" not between", value1, value2, "pearlMoney");
            return (Criteria) this;
        }

        public Criteria andPearlCountIsNull() {
            addCriterion("\" pearl_count\" is null");
            return (Criteria) this;
        }

        public Criteria andPearlCountIsNotNull() {
            addCriterion("\" pearl_count\" is not null");
            return (Criteria) this;
        }

        public Criteria andPearlCountEqualTo(Integer value) {
            addCriterion("\" pearl_count\" =", value, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andPearlCountNotEqualTo(Integer value) {
            addCriterion("\" pearl_count\" <>", value, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andPearlCountGreaterThan(Integer value) {
            addCriterion("\" pearl_count\" >", value, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andPearlCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("\" pearl_count\" >=", value, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andPearlCountLessThan(Integer value) {
            addCriterion("\" pearl_count\" <", value, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andPearlCountLessThanOrEqualTo(Integer value) {
            addCriterion("\" pearl_count\" <=", value, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andPearlCountIn(List<Integer> values) {
            addCriterion("\" pearl_count\" in", values, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andPearlCountNotIn(List<Integer> values) {
            addCriterion("\" pearl_count\" not in", values, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andPearlCountBetween(Integer value1, Integer value2) {
            addCriterion("\" pearl_count\" between", value1, value2, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andPearlCountNotBetween(Integer value1, Integer value2) {
            addCriterion("\" pearl_count\" not between", value1, value2, "pearlCount");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyIsNull() {
            addCriterion("starfish_money is null");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyIsNotNull() {
            addCriterion("starfish_money is not null");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyEqualTo(Double value) {
            addCriterion("starfish_money =", value, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyNotEqualTo(Double value) {
            addCriterion("starfish_money <>", value, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyGreaterThan(Double value) {
            addCriterion("starfish_money >", value, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("starfish_money >=", value, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyLessThan(Double value) {
            addCriterion("starfish_money <", value, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyLessThanOrEqualTo(Double value) {
            addCriterion("starfish_money <=", value, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyIn(List<Double> values) {
            addCriterion("starfish_money in", values, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyNotIn(List<Double> values) {
            addCriterion("starfish_money not in", values, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyBetween(Double value1, Double value2) {
            addCriterion("starfish_money between", value1, value2, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishMoneyNotBetween(Double value1, Double value2) {
            addCriterion("starfish_money not between", value1, value2, "starfishMoney");
            return (Criteria) this;
        }

        public Criteria andStarfishCountIsNull() {
            addCriterion("starfish_count is null");
            return (Criteria) this;
        }

        public Criteria andStarfishCountIsNotNull() {
            addCriterion("starfish_count is not null");
            return (Criteria) this;
        }

        public Criteria andStarfishCountEqualTo(Integer value) {
            addCriterion("starfish_count =", value, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andStarfishCountNotEqualTo(Integer value) {
            addCriterion("starfish_count <>", value, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andStarfishCountGreaterThan(Integer value) {
            addCriterion("starfish_count >", value, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andStarfishCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("starfish_count >=", value, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andStarfishCountLessThan(Integer value) {
            addCriterion("starfish_count <", value, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andStarfishCountLessThanOrEqualTo(Integer value) {
            addCriterion("starfish_count <=", value, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andStarfishCountIn(List<Integer> values) {
            addCriterion("starfish_count in", values, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andStarfishCountNotIn(List<Integer> values) {
            addCriterion("starfish_count not in", values, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andStarfishCountBetween(Integer value1, Integer value2) {
            addCriterion("starfish_count between", value1, value2, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andStarfishCountNotBetween(Integer value1, Integer value2) {
            addCriterion("starfish_count not between", value1, value2, "starfishCount");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyIsNull() {
            addCriterion("coralline_money is null");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyIsNotNull() {
            addCriterion("coralline_money is not null");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyEqualTo(Double value) {
            addCriterion("coralline_money =", value, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyNotEqualTo(Double value) {
            addCriterion("coralline_money <>", value, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyGreaterThan(Double value) {
            addCriterion("coralline_money >", value, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("coralline_money >=", value, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyLessThan(Double value) {
            addCriterion("coralline_money <", value, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyLessThanOrEqualTo(Double value) {
            addCriterion("coralline_money <=", value, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyIn(List<Double> values) {
            addCriterion("coralline_money in", values, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyNotIn(List<Double> values) {
            addCriterion("coralline_money not in", values, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyBetween(Double value1, Double value2) {
            addCriterion("coralline_money between", value1, value2, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineMoneyNotBetween(Double value1, Double value2) {
            addCriterion("coralline_money not between", value1, value2, "corallineMoney");
            return (Criteria) this;
        }

        public Criteria andCorallineCountIsNull() {
            addCriterion("coralline_count is null");
            return (Criteria) this;
        }

        public Criteria andCorallineCountIsNotNull() {
            addCriterion("coralline_count is not null");
            return (Criteria) this;
        }

        public Criteria andCorallineCountEqualTo(Integer value) {
            addCriterion("coralline_count =", value, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andCorallineCountNotEqualTo(Integer value) {
            addCriterion("coralline_count <>", value, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andCorallineCountGreaterThan(Integer value) {
            addCriterion("coralline_count >", value, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andCorallineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("coralline_count >=", value, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andCorallineCountLessThan(Integer value) {
            addCriterion("coralline_count <", value, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andCorallineCountLessThanOrEqualTo(Integer value) {
            addCriterion("coralline_count <=", value, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andCorallineCountIn(List<Integer> values) {
            addCriterion("coralline_count in", values, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andCorallineCountNotIn(List<Integer> values) {
            addCriterion("coralline_count not in", values, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andCorallineCountBetween(Integer value1, Integer value2) {
            addCriterion("coralline_count between", value1, value2, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andCorallineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("coralline_count not between", value1, value2, "corallineCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyIsNull() {
            addCriterion("giant_clam_money is null");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyIsNotNull() {
            addCriterion("giant_clam_money is not null");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyEqualTo(Double value) {
            addCriterion("giant_clam_money =", value, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyNotEqualTo(Double value) {
            addCriterion("giant_clam_money <>", value, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyGreaterThan(Double value) {
            addCriterion("giant_clam_money >", value, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("giant_clam_money >=", value, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyLessThan(Double value) {
            addCriterion("giant_clam_money <", value, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyLessThanOrEqualTo(Double value) {
            addCriterion("giant_clam_money <=", value, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyIn(List<Double> values) {
            addCriterion("giant_clam_money in", values, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyNotIn(List<Double> values) {
            addCriterion("giant_clam_money not in", values, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyBetween(Double value1, Double value2) {
            addCriterion("giant_clam_money between", value1, value2, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamMoneyNotBetween(Double value1, Double value2) {
            addCriterion("giant_clam_money not between", value1, value2, "giantClamMoney");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountIsNull() {
            addCriterion("giant_clam_count is null");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountIsNotNull() {
            addCriterion("giant_clam_count is not null");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountEqualTo(Integer value) {
            addCriterion("giant_clam_count =", value, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountNotEqualTo(Integer value) {
            addCriterion("giant_clam_count <>", value, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountGreaterThan(Integer value) {
            addCriterion("giant_clam_count >", value, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("giant_clam_count >=", value, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountLessThan(Integer value) {
            addCriterion("giant_clam_count <", value, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountLessThanOrEqualTo(Integer value) {
            addCriterion("giant_clam_count <=", value, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountIn(List<Integer> values) {
            addCriterion("giant_clam_count in", values, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountNotIn(List<Integer> values) {
            addCriterion("giant_clam_count not in", values, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountBetween(Integer value1, Integer value2) {
            addCriterion("giant_clam_count between", value1, value2, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGiantClamCountNotBetween(Integer value1, Integer value2) {
            addCriterion("giant_clam_count not between", value1, value2, "giantClamCount");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyIsNull() {
            addCriterion("garnet_money is null");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyIsNotNull() {
            addCriterion("garnet_money is not null");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyEqualTo(Double value) {
            addCriterion("garnet_money =", value, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyNotEqualTo(Double value) {
            addCriterion("garnet_money <>", value, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyGreaterThan(Double value) {
            addCriterion("garnet_money >", value, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("garnet_money >=", value, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyLessThan(Double value) {
            addCriterion("garnet_money <", value, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyLessThanOrEqualTo(Double value) {
            addCriterion("garnet_money <=", value, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyIn(List<Double> values) {
            addCriterion("garnet_money in", values, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyNotIn(List<Double> values) {
            addCriterion("garnet_money not in", values, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyBetween(Double value1, Double value2) {
            addCriterion("garnet_money between", value1, value2, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetMoneyNotBetween(Double value1, Double value2) {
            addCriterion("garnet_money not between", value1, value2, "garnetMoney");
            return (Criteria) this;
        }

        public Criteria andGarnetCountIsNull() {
            addCriterion("garnet_count is null");
            return (Criteria) this;
        }

        public Criteria andGarnetCountIsNotNull() {
            addCriterion("garnet_count is not null");
            return (Criteria) this;
        }

        public Criteria andGarnetCountEqualTo(Integer value) {
            addCriterion("garnet_count =", value, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andGarnetCountNotEqualTo(Integer value) {
            addCriterion("garnet_count <>", value, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andGarnetCountGreaterThan(Integer value) {
            addCriterion("garnet_count >", value, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andGarnetCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("garnet_count >=", value, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andGarnetCountLessThan(Integer value) {
            addCriterion("garnet_count <", value, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andGarnetCountLessThanOrEqualTo(Integer value) {
            addCriterion("garnet_count <=", value, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andGarnetCountIn(List<Integer> values) {
            addCriterion("garnet_count in", values, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andGarnetCountNotIn(List<Integer> values) {
            addCriterion("garnet_count not in", values, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andGarnetCountBetween(Integer value1, Integer value2) {
            addCriterion("garnet_count between", value1, value2, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andGarnetCountNotBetween(Integer value1, Integer value2) {
            addCriterion("garnet_count not between", value1, value2, "garnetCount");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyIsNull() {
            addCriterion("fish_tear_money is null");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyIsNotNull() {
            addCriterion("fish_tear_money is not null");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyEqualTo(Double value) {
            addCriterion("fish_tear_money =", value, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyNotEqualTo(Double value) {
            addCriterion("fish_tear_money <>", value, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyGreaterThan(Double value) {
            addCriterion("fish_tear_money >", value, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("fish_tear_money >=", value, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyLessThan(Double value) {
            addCriterion("fish_tear_money <", value, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyLessThanOrEqualTo(Double value) {
            addCriterion("fish_tear_money <=", value, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyIn(List<Double> values) {
            addCriterion("fish_tear_money in", values, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyNotIn(List<Double> values) {
            addCriterion("fish_tear_money not in", values, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyBetween(Double value1, Double value2) {
            addCriterion("fish_tear_money between", value1, value2, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearMoneyNotBetween(Double value1, Double value2) {
            addCriterion("fish_tear_money not between", value1, value2, "fishTearMoney");
            return (Criteria) this;
        }

        public Criteria andFishTearCountIsNull() {
            addCriterion("fish_tear_count is null");
            return (Criteria) this;
        }

        public Criteria andFishTearCountIsNotNull() {
            addCriterion("fish_tear_count is not null");
            return (Criteria) this;
        }

        public Criteria andFishTearCountEqualTo(Integer value) {
            addCriterion("fish_tear_count =", value, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andFishTearCountNotEqualTo(Integer value) {
            addCriterion("fish_tear_count <>", value, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andFishTearCountGreaterThan(Integer value) {
            addCriterion("fish_tear_count >", value, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andFishTearCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fish_tear_count >=", value, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andFishTearCountLessThan(Integer value) {
            addCriterion("fish_tear_count <", value, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andFishTearCountLessThanOrEqualTo(Integer value) {
            addCriterion("fish_tear_count <=", value, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andFishTearCountIn(List<Integer> values) {
            addCriterion("fish_tear_count in", values, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andFishTearCountNotIn(List<Integer> values) {
            addCriterion("fish_tear_count not in", values, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andFishTearCountBetween(Integer value1, Integer value2) {
            addCriterion("fish_tear_count between", value1, value2, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andFishTearCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fish_tear_count not between", value1, value2, "fishTearCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyIsNull() {
            addCriterion("ocean_heart_money is null");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyIsNotNull() {
            addCriterion("ocean_heart_money is not null");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyEqualTo(Double value) {
            addCriterion("ocean_heart_money =", value, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyNotEqualTo(Double value) {
            addCriterion("ocean_heart_money <>", value, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyGreaterThan(Double value) {
            addCriterion("ocean_heart_money >", value, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ocean_heart_money >=", value, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyLessThan(Double value) {
            addCriterion("ocean_heart_money <", value, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ocean_heart_money <=", value, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyIn(List<Double> values) {
            addCriterion("ocean_heart_money in", values, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyNotIn(List<Double> values) {
            addCriterion("ocean_heart_money not in", values, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyBetween(Double value1, Double value2) {
            addCriterion("ocean_heart_money between", value1, value2, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ocean_heart_money not between", value1, value2, "oceanHeartMoney");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountIsNull() {
            addCriterion("ocean_heart_count is null");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountIsNotNull() {
            addCriterion("ocean_heart_count is not null");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountEqualTo(Integer value) {
            addCriterion("ocean_heart_count =", value, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountNotEqualTo(Integer value) {
            addCriterion("ocean_heart_count <>", value, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountGreaterThan(Integer value) {
            addCriterion("ocean_heart_count >", value, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ocean_heart_count >=", value, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountLessThan(Integer value) {
            addCriterion("ocean_heart_count <", value, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountLessThanOrEqualTo(Integer value) {
            addCriterion("ocean_heart_count <=", value, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountIn(List<Integer> values) {
            addCriterion("ocean_heart_count in", values, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountNotIn(List<Integer> values) {
            addCriterion("ocean_heart_count not in", values, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountBetween(Integer value1, Integer value2) {
            addCriterion("ocean_heart_count between", value1, value2, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andOceanHeartCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ocean_heart_count not between", value1, value2, "oceanHeartCount");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyIsNull() {
            addCriterion("trident_money is null");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyIsNotNull() {
            addCriterion("trident_money is not null");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyEqualTo(Double value) {
            addCriterion("trident_money =", value, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyNotEqualTo(Double value) {
            addCriterion("trident_money <>", value, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyGreaterThan(Double value) {
            addCriterion("trident_money >", value, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("trident_money >=", value, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyLessThan(Double value) {
            addCriterion("trident_money <", value, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyLessThanOrEqualTo(Double value) {
            addCriterion("trident_money <=", value, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyIn(List<Double> values) {
            addCriterion("trident_money in", values, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyNotIn(List<Double> values) {
            addCriterion("trident_money not in", values, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyBetween(Double value1, Double value2) {
            addCriterion("trident_money between", value1, value2, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentMoneyNotBetween(Double value1, Double value2) {
            addCriterion("trident_money not between", value1, value2, "tridentMoney");
            return (Criteria) this;
        }

        public Criteria andTridentCountIsNull() {
            addCriterion("trident_count is null");
            return (Criteria) this;
        }

        public Criteria andTridentCountIsNotNull() {
            addCriterion("trident_count is not null");
            return (Criteria) this;
        }

        public Criteria andTridentCountEqualTo(Integer value) {
            addCriterion("trident_count =", value, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTridentCountNotEqualTo(Integer value) {
            addCriterion("trident_count <>", value, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTridentCountGreaterThan(Integer value) {
            addCriterion("trident_count >", value, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTridentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("trident_count >=", value, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTridentCountLessThan(Integer value) {
            addCriterion("trident_count <", value, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTridentCountLessThanOrEqualTo(Integer value) {
            addCriterion("trident_count <=", value, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTridentCountIn(List<Integer> values) {
            addCriterion("trident_count in", values, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTridentCountNotIn(List<Integer> values) {
            addCriterion("trident_count not in", values, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTridentCountBetween(Integer value1, Integer value2) {
            addCriterion("trident_count between", value1, value2, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTridentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("trident_count not between", value1, value2, "tridentCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(Double value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(Double value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(Double value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(Double value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<Double> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<Double> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
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