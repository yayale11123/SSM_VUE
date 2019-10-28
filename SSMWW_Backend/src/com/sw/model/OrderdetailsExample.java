package com.sw.model;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public OrderdetailsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
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

        public Criteria andOrderdetailsidIsNull() {
            addCriterion("orderdetailsid is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidIsNotNull() {
            addCriterion("orderdetailsid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidEqualTo(Integer value) {
            addCriterion("orderdetailsid =", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidNotEqualTo(Integer value) {
            addCriterion("orderdetailsid <>", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidGreaterThan(Integer value) {
            addCriterion("orderdetailsid >", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderdetailsid >=", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidLessThan(Integer value) {
            addCriterion("orderdetailsid <", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidLessThanOrEqualTo(Integer value) {
            addCriterion("orderdetailsid <=", value, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidIn(List<Integer> values) {
            addCriterion("orderdetailsid in", values, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidNotIn(List<Integer> values) {
            addCriterion("orderdetailsid not in", values, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidBetween(Integer value1, Integer value2) {
            addCriterion("orderdetailsid between", value1, value2, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailsidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderdetailsid not between", value1, value2, "orderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOrdervodeIsNull() {
            addCriterion("ordervode is null");
            return (Criteria) this;
        }

        public Criteria andOrdervodeIsNotNull() {
            addCriterion("ordervode is not null");
            return (Criteria) this;
        }

        public Criteria andOrdervodeEqualTo(String value) {
            addCriterion("ordervode =", value, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeNotEqualTo(String value) {
            addCriterion("ordervode <>", value, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeGreaterThan(String value) {
            addCriterion("ordervode >", value, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeGreaterThanOrEqualTo(String value) {
            addCriterion("ordervode >=", value, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeLessThan(String value) {
            addCriterion("ordervode <", value, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeLessThanOrEqualTo(String value) {
            addCriterion("ordervode <=", value, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeLike(String value) {
            addCriterion("ordervode like", value, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeNotLike(String value) {
            addCriterion("ordervode not like", value, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeIn(List<String> values) {
            addCriterion("ordervode in", values, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeNotIn(List<String> values) {
            addCriterion("ordervode not in", values, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeBetween(String value1, String value2) {
            addCriterion("ordervode between", value1, value2, "ordervode");
            return (Criteria) this;
        }

        public Criteria andOrdervodeNotBetween(String value1, String value2) {
            addCriterion("ordervode not between", value1, value2, "ordervode");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderdetails
     *
     * @mbg.generated do_not_delete_during_merge Sun Sep 02 15:46:59 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
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