package com.ecommerce.OnlineShopping.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
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
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andOrdidIsNull() {
            addCriterion("ordID is null");
            return (Criteria) this;
        }

        public Criteria andOrdidIsNotNull() {
            addCriterion("ordID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdidEqualTo(Long value) {
            addCriterion("ordID =", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidNotEqualTo(Long value) {
            addCriterion("ordID <>", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidGreaterThan(Long value) {
            addCriterion("ordID >", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidGreaterThanOrEqualTo(Long value) {
            addCriterion("ordID >=", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidLessThan(Long value) {
            addCriterion("ordID <", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidLessThanOrEqualTo(Long value) {
            addCriterion("ordID <=", value, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidIn(List<Long> values) {
            addCriterion("ordID in", values, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidNotIn(List<Long> values) {
            addCriterion("ordID not in", values, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidBetween(Long value1, Long value2) {
            addCriterion("ordID between", value1, value2, "ordid");
            return (Criteria) this;
        }

        public Criteria andOrdidNotBetween(Long value1, Long value2) {
            addCriterion("ordID not between", value1, value2, "ordid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidIsNull() {
            addCriterion("oderDetailsID is null");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidIsNotNull() {
            addCriterion("oderDetailsID is not null");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidEqualTo(Long value) {
            addCriterion("oderDetailsID =", value, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidNotEqualTo(Long value) {
            addCriterion("oderDetailsID <>", value, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidGreaterThan(Long value) {
            addCriterion("oderDetailsID >", value, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidGreaterThanOrEqualTo(Long value) {
            addCriterion("oderDetailsID >=", value, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidLessThan(Long value) {
            addCriterion("oderDetailsID <", value, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidLessThanOrEqualTo(Long value) {
            addCriterion("oderDetailsID <=", value, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidIn(List<Long> values) {
            addCriterion("oderDetailsID in", values, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidNotIn(List<Long> values) {
            addCriterion("oderDetailsID not in", values, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidBetween(Long value1, Long value2) {
            addCriterion("oderDetailsID between", value1, value2, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andOderdetailsidNotBetween(Long value1, Long value2) {
            addCriterion("oderDetailsID not between", value1, value2, "oderdetailsid");
            return (Criteria) this;
        }

        public Criteria andShpidIsNull() {
            addCriterion("shpID is null");
            return (Criteria) this;
        }

        public Criteria andShpidIsNotNull() {
            addCriterion("shpID is not null");
            return (Criteria) this;
        }

        public Criteria andShpidEqualTo(String value) {
            addCriterion("shpID =", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidNotEqualTo(String value) {
            addCriterion("shpID <>", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidGreaterThan(String value) {
            addCriterion("shpID >", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidGreaterThanOrEqualTo(String value) {
            addCriterion("shpID >=", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidLessThan(String value) {
            addCriterion("shpID <", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidLessThanOrEqualTo(String value) {
            addCriterion("shpID <=", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidLike(String value) {
            addCriterion("shpID like", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidNotLike(String value) {
            addCriterion("shpID not like", value, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidIn(List<String> values) {
            addCriterion("shpID in", values, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidNotIn(List<String> values) {
            addCriterion("shpID not in", values, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidBetween(String value1, String value2) {
            addCriterion("shpID between", value1, value2, "shpid");
            return (Criteria) this;
        }

        public Criteria andShpidNotBetween(String value1, String value2) {
            addCriterion("shpID not between", value1, value2, "shpid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOdtimeIsNull() {
            addCriterion("odTime is null");
            return (Criteria) this;
        }

        public Criteria andOdtimeIsNotNull() {
            addCriterion("odTime is not null");
            return (Criteria) this;
        }

        public Criteria andOdtimeEqualTo(Date value) {
            addCriterionForJDBCTime("odTime =", value, "odtime");
            return (Criteria) this;
        }

        public Criteria andOdtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("odTime <>", value, "odtime");
            return (Criteria) this;
        }

        public Criteria andOdtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("odTime >", value, "odtime");
            return (Criteria) this;
        }

        public Criteria andOdtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("odTime >=", value, "odtime");
            return (Criteria) this;
        }

        public Criteria andOdtimeLessThan(Date value) {
            addCriterionForJDBCTime("odTime <", value, "odtime");
            return (Criteria) this;
        }

        public Criteria andOdtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("odTime <=", value, "odtime");
            return (Criteria) this;
        }

        public Criteria andOdtimeIn(List<Date> values) {
            addCriterionForJDBCTime("odTime in", values, "odtime");
            return (Criteria) this;
        }

        public Criteria andOdtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("odTime not in", values, "odtime");
            return (Criteria) this;
        }

        public Criteria andOdtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("odTime between", value1, value2, "odtime");
            return (Criteria) this;
        }

        public Criteria andOdtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("odTime not between", value1, value2, "odtime");
            return (Criteria) this;
        }

        public Criteria andOddateIsNull() {
            addCriterion("odDate is null");
            return (Criteria) this;
        }

        public Criteria andOddateIsNotNull() {
            addCriterion("odDate is not null");
            return (Criteria) this;
        }

        public Criteria andOddateEqualTo(Date value) {
            addCriterionForJDBCDate("odDate =", value, "oddate");
            return (Criteria) this;
        }

        public Criteria andOddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("odDate <>", value, "oddate");
            return (Criteria) this;
        }

        public Criteria andOddateGreaterThan(Date value) {
            addCriterionForJDBCDate("odDate >", value, "oddate");
            return (Criteria) this;
        }

        public Criteria andOddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("odDate >=", value, "oddate");
            return (Criteria) this;
        }

        public Criteria andOddateLessThan(Date value) {
            addCriterionForJDBCDate("odDate <", value, "oddate");
            return (Criteria) this;
        }

        public Criteria andOddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("odDate <=", value, "oddate");
            return (Criteria) this;
        }

        public Criteria andOddateIn(List<Date> values) {
            addCriterionForJDBCDate("odDate in", values, "oddate");
            return (Criteria) this;
        }

        public Criteria andOddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("odDate not in", values, "oddate");
            return (Criteria) this;
        }

        public Criteria andOddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("odDate between", value1, value2, "oddate");
            return (Criteria) this;
        }

        public Criteria andOddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("odDate not between", value1, value2, "oddate");
            return (Criteria) this;
        }

        public Criteria andShpamtIsNull() {
            addCriterion("ShpAmt is null");
            return (Criteria) this;
        }

        public Criteria andShpamtIsNotNull() {
            addCriterion("ShpAmt is not null");
            return (Criteria) this;
        }

        public Criteria andShpamtEqualTo(BigDecimal value) {
            addCriterion("ShpAmt =", value, "shpamt");
            return (Criteria) this;
        }

        public Criteria andShpamtNotEqualTo(BigDecimal value) {
            addCriterion("ShpAmt <>", value, "shpamt");
            return (Criteria) this;
        }

        public Criteria andShpamtGreaterThan(BigDecimal value) {
            addCriterion("ShpAmt >", value, "shpamt");
            return (Criteria) this;
        }

        public Criteria andShpamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ShpAmt >=", value, "shpamt");
            return (Criteria) this;
        }

        public Criteria andShpamtLessThan(BigDecimal value) {
            addCriterion("ShpAmt <", value, "shpamt");
            return (Criteria) this;
        }

        public Criteria andShpamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ShpAmt <=", value, "shpamt");
            return (Criteria) this;
        }

        public Criteria andShpamtIn(List<BigDecimal> values) {
            addCriterion("ShpAmt in", values, "shpamt");
            return (Criteria) this;
        }

        public Criteria andShpamtNotIn(List<BigDecimal> values) {
            addCriterion("ShpAmt not in", values, "shpamt");
            return (Criteria) this;
        }

        public Criteria andShpamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShpAmt between", value1, value2, "shpamt");
            return (Criteria) this;
        }

        public Criteria andShpamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShpAmt not between", value1, value2, "shpamt");
            return (Criteria) this;
        }

        public Criteria andProdamtIsNull() {
            addCriterion("ProdAmt is null");
            return (Criteria) this;
        }

        public Criteria andProdamtIsNotNull() {
            addCriterion("ProdAmt is not null");
            return (Criteria) this;
        }

        public Criteria andProdamtEqualTo(BigDecimal value) {
            addCriterion("ProdAmt =", value, "prodamt");
            return (Criteria) this;
        }

        public Criteria andProdamtNotEqualTo(BigDecimal value) {
            addCriterion("ProdAmt <>", value, "prodamt");
            return (Criteria) this;
        }

        public Criteria andProdamtGreaterThan(BigDecimal value) {
            addCriterion("ProdAmt >", value, "prodamt");
            return (Criteria) this;
        }

        public Criteria andProdamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ProdAmt >=", value, "prodamt");
            return (Criteria) this;
        }

        public Criteria andProdamtLessThan(BigDecimal value) {
            addCriterion("ProdAmt <", value, "prodamt");
            return (Criteria) this;
        }

        public Criteria andProdamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ProdAmt <=", value, "prodamt");
            return (Criteria) this;
        }

        public Criteria andProdamtIn(List<BigDecimal> values) {
            addCriterion("ProdAmt in", values, "prodamt");
            return (Criteria) this;
        }

        public Criteria andProdamtNotIn(List<BigDecimal> values) {
            addCriterion("ProdAmt not in", values, "prodamt");
            return (Criteria) this;
        }

        public Criteria andProdamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProdAmt between", value1, value2, "prodamt");
            return (Criteria) this;
        }

        public Criteria andProdamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProdAmt not between", value1, value2, "prodamt");
            return (Criteria) this;
        }

        public Criteria andShpaddressIsNull() {
            addCriterion("shpAddress is null");
            return (Criteria) this;
        }

        public Criteria andShpaddressIsNotNull() {
            addCriterion("shpAddress is not null");
            return (Criteria) this;
        }

        public Criteria andShpaddressEqualTo(String value) {
            addCriterion("shpAddress =", value, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressNotEqualTo(String value) {
            addCriterion("shpAddress <>", value, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressGreaterThan(String value) {
            addCriterion("shpAddress >", value, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("shpAddress >=", value, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressLessThan(String value) {
            addCriterion("shpAddress <", value, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressLessThanOrEqualTo(String value) {
            addCriterion("shpAddress <=", value, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressLike(String value) {
            addCriterion("shpAddress like", value, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressNotLike(String value) {
            addCriterion("shpAddress not like", value, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressIn(List<String> values) {
            addCriterion("shpAddress in", values, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressNotIn(List<String> values) {
            addCriterion("shpAddress not in", values, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressBetween(String value1, String value2) {
            addCriterion("shpAddress between", value1, value2, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andShpaddressNotBetween(String value1, String value2) {
            addCriterion("shpAddress not between", value1, value2, "shpaddress");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("phoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("phoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("phoneNum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("phoneNum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("phoneNum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("phoneNum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("phoneNum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("phoneNum like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("phoneNum not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("phoneNum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("phoneNum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("phoneNum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("phoneNum not between", value1, value2, "phonenum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated do_not_delete_during_merge Thu Jun 04 12:39:36 NPT 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated Thu Jun 04 12:39:36 NPT 2020
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