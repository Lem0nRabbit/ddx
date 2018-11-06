package com.ddx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:27:05
 */
public class DdxQueueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DdxQueueExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQueueTypeIsNull() {
            addCriterion("queue_type is null");
            return (Criteria) this;
        }

        public Criteria andQueueTypeIsNotNull() {
            addCriterion("queue_type is not null");
            return (Criteria) this;
        }

        public Criteria andQueueTypeEqualTo(Byte value) {
            addCriterion("queue_type =", value, "queueType");
            return (Criteria) this;
        }

        public Criteria andQueueTypeNotEqualTo(Byte value) {
            addCriterion("queue_type <>", value, "queueType");
            return (Criteria) this;
        }

        public Criteria andQueueTypeGreaterThan(Byte value) {
            addCriterion("queue_type >", value, "queueType");
            return (Criteria) this;
        }

        public Criteria andQueueTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("queue_type >=", value, "queueType");
            return (Criteria) this;
        }

        public Criteria andQueueTypeLessThan(Byte value) {
            addCriterion("queue_type <", value, "queueType");
            return (Criteria) this;
        }

        public Criteria andQueueTypeLessThanOrEqualTo(Byte value) {
            addCriterion("queue_type <=", value, "queueType");
            return (Criteria) this;
        }

        public Criteria andQueueTypeIn(List<Byte> values) {
            addCriterion("queue_type in", values, "queueType");
            return (Criteria) this;
        }

        public Criteria andQueueTypeNotIn(List<Byte> values) {
            addCriterion("queue_type not in", values, "queueType");
            return (Criteria) this;
        }

        public Criteria andQueueTypeBetween(Byte value1, Byte value2) {
            addCriterion("queue_type between", value1, value2, "queueType");
            return (Criteria) this;
        }

        public Criteria andQueueTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("queue_type not between", value1, value2, "queueType");
            return (Criteria) this;
        }

        public Criteria andItemKeyIsNull() {
            addCriterion("item_key is null");
            return (Criteria) this;
        }

        public Criteria andItemKeyIsNotNull() {
            addCriterion("item_key is not null");
            return (Criteria) this;
        }

        public Criteria andItemKeyEqualTo(String value) {
            addCriterion("item_key =", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotEqualTo(String value) {
            addCriterion("item_key <>", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyGreaterThan(String value) {
            addCriterion("item_key >", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyGreaterThanOrEqualTo(String value) {
            addCriterion("item_key >=", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyLessThan(String value) {
            addCriterion("item_key <", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyLessThanOrEqualTo(String value) {
            addCriterion("item_key <=", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyLike(String value) {
            addCriterion("item_key like", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotLike(String value) {
            addCriterion("item_key not like", value, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyIn(List<String> values) {
            addCriterion("item_key in", values, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotIn(List<String> values) {
            addCriterion("item_key not in", values, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyBetween(String value1, String value2) {
            addCriterion("item_key between", value1, value2, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemKeyNotBetween(String value1, String value2) {
            addCriterion("item_key not between", value1, value2, "itemKey");
            return (Criteria) this;
        }

        public Criteria andItemParamsIsNull() {
            addCriterion("item_params is null");
            return (Criteria) this;
        }

        public Criteria andItemParamsIsNotNull() {
            addCriterion("item_params is not null");
            return (Criteria) this;
        }

        public Criteria andItemParamsEqualTo(String value) {
            addCriterion("item_params =", value, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsNotEqualTo(String value) {
            addCriterion("item_params <>", value, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsGreaterThan(String value) {
            addCriterion("item_params >", value, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsGreaterThanOrEqualTo(String value) {
            addCriterion("item_params >=", value, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsLessThan(String value) {
            addCriterion("item_params <", value, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsLessThanOrEqualTo(String value) {
            addCriterion("item_params <=", value, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsLike(String value) {
            addCriterion("item_params like", value, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsNotLike(String value) {
            addCriterion("item_params not like", value, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsIn(List<String> values) {
            addCriterion("item_params in", values, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsNotIn(List<String> values) {
            addCriterion("item_params not in", values, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsBetween(String value1, String value2) {
            addCriterion("item_params between", value1, value2, "itemParams");
            return (Criteria) this;
        }

        public Criteria andItemParamsNotBetween(String value1, String value2) {
            addCriterion("item_params not between", value1, value2, "itemParams");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNull() {
            addCriterion("push_time is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("push_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(Date value) {
            addCriterion("push_time =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(Date value) {
            addCriterion("push_time <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(Date value) {
            addCriterion("push_time >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("push_time >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(Date value) {
            addCriterion("push_time <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("push_time <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<Date> values) {
            addCriterion("push_time in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<Date> values) {
            addCriterion("push_time not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(Date value1, Date value2) {
            addCriterion("push_time between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("push_time not between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushByIsNull() {
            addCriterion("push_by is null");
            return (Criteria) this;
        }

        public Criteria andPushByIsNotNull() {
            addCriterion("push_by is not null");
            return (Criteria) this;
        }

        public Criteria andPushByEqualTo(Integer value) {
            addCriterion("push_by =", value, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPushByNotEqualTo(Integer value) {
            addCriterion("push_by <>", value, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPushByGreaterThan(Integer value) {
            addCriterion("push_by >", value, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPushByGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_by >=", value, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPushByLessThan(Integer value) {
            addCriterion("push_by <", value, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPushByLessThanOrEqualTo(Integer value) {
            addCriterion("push_by <=", value, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPushByIn(List<Integer> values) {
            addCriterion("push_by in", values, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPushByNotIn(List<Integer> values) {
            addCriterion("push_by not in", values, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPushByBetween(Integer value1, Integer value2) {
            addCriterion("push_by between", value1, value2, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPushByNotBetween(Integer value1, Integer value2) {
            addCriterion("push_by not between", value1, value2, "pushBy");
            return (Criteria) this;
        }

        public Criteria andPopTimeIsNull() {
            addCriterion("pop_time is null");
            return (Criteria) this;
        }

        public Criteria andPopTimeIsNotNull() {
            addCriterion("pop_time is not null");
            return (Criteria) this;
        }

        public Criteria andPopTimeEqualTo(Date value) {
            addCriterion("pop_time =", value, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopTimeNotEqualTo(Date value) {
            addCriterion("pop_time <>", value, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopTimeGreaterThan(Date value) {
            addCriterion("pop_time >", value, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pop_time >=", value, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopTimeLessThan(Date value) {
            addCriterion("pop_time <", value, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopTimeLessThanOrEqualTo(Date value) {
            addCriterion("pop_time <=", value, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopTimeIn(List<Date> values) {
            addCriterion("pop_time in", values, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopTimeNotIn(List<Date> values) {
            addCriterion("pop_time not in", values, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopTimeBetween(Date value1, Date value2) {
            addCriterion("pop_time between", value1, value2, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopTimeNotBetween(Date value1, Date value2) {
            addCriterion("pop_time not between", value1, value2, "popTime");
            return (Criteria) this;
        }

        public Criteria andPopByIsNull() {
            addCriterion("pop_by is null");
            return (Criteria) this;
        }

        public Criteria andPopByIsNotNull() {
            addCriterion("pop_by is not null");
            return (Criteria) this;
        }

        public Criteria andPopByEqualTo(String value) {
            addCriterion("pop_by =", value, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByNotEqualTo(String value) {
            addCriterion("pop_by <>", value, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByGreaterThan(String value) {
            addCriterion("pop_by >", value, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByGreaterThanOrEqualTo(String value) {
            addCriterion("pop_by >=", value, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByLessThan(String value) {
            addCriterion("pop_by <", value, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByLessThanOrEqualTo(String value) {
            addCriterion("pop_by <=", value, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByLike(String value) {
            addCriterion("pop_by like", value, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByNotLike(String value) {
            addCriterion("pop_by not like", value, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByIn(List<String> values) {
            addCriterion("pop_by in", values, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByNotIn(List<String> values) {
            addCriterion("pop_by not in", values, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByBetween(String value1, String value2) {
            addCriterion("pop_by between", value1, value2, "popBy");
            return (Criteria) this;
        }

        public Criteria andPopByNotBetween(String value1, String value2) {
            addCriterion("pop_by not between", value1, value2, "popBy");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(Date value) {
            addCriterion("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(Date value) {
            addCriterion("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(Date value) {
            addCriterion("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(Date value) {
            addCriterion("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(Date value) {
            addCriterion("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<Date> values) {
            addCriterion("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<Date> values) {
            addCriterion("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(Date value1, Date value2) {
            addCriterion("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(Date value1, Date value2) {
            addCriterion("stop_time not between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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