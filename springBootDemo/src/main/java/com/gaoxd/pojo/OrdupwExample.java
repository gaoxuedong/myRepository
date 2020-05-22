package com.gaoxd.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrdupwExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdupwExample() {
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

        public Criteria andPwCodeCompanyIsNull() {
            addCriterion("PW_CODE_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyIsNotNull() {
            addCriterion("PW_CODE_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyEqualTo(String value) {
            addCriterion("PW_CODE_COMPANY =", value, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyNotEqualTo(String value) {
            addCriterion("PW_CODE_COMPANY <>", value, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyGreaterThan(String value) {
            addCriterion("PW_CODE_COMPANY >", value, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("PW_CODE_COMPANY >=", value, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyLessThan(String value) {
            addCriterion("PW_CODE_COMPANY <", value, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyLessThanOrEqualTo(String value) {
            addCriterion("PW_CODE_COMPANY <=", value, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyLike(String value) {
            addCriterion("PW_CODE_COMPANY like", value, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyNotLike(String value) {
            addCriterion("PW_CODE_COMPANY not like", value, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyIn(List<String> values) {
            addCriterion("PW_CODE_COMPANY in", values, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyNotIn(List<String> values) {
            addCriterion("PW_CODE_COMPANY not in", values, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyBetween(String value1, String value2) {
            addCriterion("PW_CODE_COMPANY between", value1, value2, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwCodeCompanyNotBetween(String value1, String value2) {
            addCriterion("PW_CODE_COMPANY not between", value1, value2, "pwCodeCompany");
            return (Criteria) this;
        }

        public Criteria andPwPlanIsNull() {
            addCriterion("PW_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andPwPlanIsNotNull() {
            addCriterion("PW_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andPwPlanEqualTo(String value) {
            addCriterion("PW_PLAN =", value, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanNotEqualTo(String value) {
            addCriterion("PW_PLAN <>", value, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanGreaterThan(String value) {
            addCriterion("PW_PLAN >", value, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanGreaterThanOrEqualTo(String value) {
            addCriterion("PW_PLAN >=", value, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanLessThan(String value) {
            addCriterion("PW_PLAN <", value, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanLessThanOrEqualTo(String value) {
            addCriterion("PW_PLAN <=", value, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanLike(String value) {
            addCriterion("PW_PLAN like", value, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanNotLike(String value) {
            addCriterion("PW_PLAN not like", value, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanIn(List<String> values) {
            addCriterion("PW_PLAN in", values, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanNotIn(List<String> values) {
            addCriterion("PW_PLAN not in", values, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanBetween(String value1, String value2) {
            addCriterion("PW_PLAN between", value1, value2, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwPlanNotBetween(String value1, String value2) {
            addCriterion("PW_PLAN not between", value1, value2, "pwPlan");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleIsNull() {
            addCriterion("PW_RATE_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleIsNotNull() {
            addCriterion("PW_RATE_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleEqualTo(String value) {
            addCriterion("PW_RATE_SCALE =", value, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleNotEqualTo(String value) {
            addCriterion("PW_RATE_SCALE <>", value, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleGreaterThan(String value) {
            addCriterion("PW_RATE_SCALE >", value, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleGreaterThanOrEqualTo(String value) {
            addCriterion("PW_RATE_SCALE >=", value, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleLessThan(String value) {
            addCriterion("PW_RATE_SCALE <", value, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleLessThanOrEqualTo(String value) {
            addCriterion("PW_RATE_SCALE <=", value, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleLike(String value) {
            addCriterion("PW_RATE_SCALE like", value, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleNotLike(String value) {
            addCriterion("PW_RATE_SCALE not like", value, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleIn(List<String> values) {
            addCriterion("PW_RATE_SCALE in", values, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleNotIn(List<String> values) {
            addCriterion("PW_RATE_SCALE not in", values, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleBetween(String value1, String value2) {
            addCriterion("PW_RATE_SCALE between", value1, value2, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwRateScaleNotBetween(String value1, String value2) {
            addCriterion("PW_RATE_SCALE not between", value1, value2, "pwRateScale");
            return (Criteria) this;
        }

        public Criteria andPwLanguageIsNull() {
            addCriterion("PW_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andPwLanguageIsNotNull() {
            addCriterion("PW_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPwLanguageEqualTo(String value) {
            addCriterion("PW_LANGUAGE =", value, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageNotEqualTo(String value) {
            addCriterion("PW_LANGUAGE <>", value, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageGreaterThan(String value) {
            addCriterion("PW_LANGUAGE >", value, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("PW_LANGUAGE >=", value, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageLessThan(String value) {
            addCriterion("PW_LANGUAGE <", value, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageLessThanOrEqualTo(String value) {
            addCriterion("PW_LANGUAGE <=", value, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageLike(String value) {
            addCriterion("PW_LANGUAGE like", value, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageNotLike(String value) {
            addCriterion("PW_LANGUAGE not like", value, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageIn(List<String> values) {
            addCriterion("PW_LANGUAGE in", values, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageNotIn(List<String> values) {
            addCriterion("PW_LANGUAGE not in", values, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageBetween(String value1, String value2) {
            addCriterion("PW_LANGUAGE between", value1, value2, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwLanguageNotBetween(String value1, String value2) {
            addCriterion("PW_LANGUAGE not between", value1, value2, "pwLanguage");
            return (Criteria) this;
        }

        public Criteria andPwIlocIsNull() {
            addCriterion("PW_ILOC is null");
            return (Criteria) this;
        }

        public Criteria andPwIlocIsNotNull() {
            addCriterion("PW_ILOC is not null");
            return (Criteria) this;
        }

        public Criteria andPwIlocEqualTo(String value) {
            addCriterion("PW_ILOC =", value, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocNotEqualTo(String value) {
            addCriterion("PW_ILOC <>", value, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocGreaterThan(String value) {
            addCriterion("PW_ILOC >", value, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocGreaterThanOrEqualTo(String value) {
            addCriterion("PW_ILOC >=", value, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocLessThan(String value) {
            addCriterion("PW_ILOC <", value, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocLessThanOrEqualTo(String value) {
            addCriterion("PW_ILOC <=", value, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocLike(String value) {
            addCriterion("PW_ILOC like", value, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocNotLike(String value) {
            addCriterion("PW_ILOC not like", value, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocIn(List<String> values) {
            addCriterion("PW_ILOC in", values, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocNotIn(List<String> values) {
            addCriterion("PW_ILOC not in", values, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocBetween(String value1, String value2) {
            addCriterion("PW_ILOC between", value1, value2, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwIlocNotBetween(String value1, String value2) {
            addCriterion("PW_ILOC not between", value1, value2, "pwIloc");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleIsNull() {
            addCriterion("PW_PLAN_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleIsNotNull() {
            addCriterion("PW_PLAN_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleEqualTo(String value) {
            addCriterion("PW_PLAN_TITLE =", value, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleNotEqualTo(String value) {
            addCriterion("PW_PLAN_TITLE <>", value, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleGreaterThan(String value) {
            addCriterion("PW_PLAN_TITLE >", value, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PW_PLAN_TITLE >=", value, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleLessThan(String value) {
            addCriterion("PW_PLAN_TITLE <", value, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleLessThanOrEqualTo(String value) {
            addCriterion("PW_PLAN_TITLE <=", value, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleLike(String value) {
            addCriterion("PW_PLAN_TITLE like", value, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleNotLike(String value) {
            addCriterion("PW_PLAN_TITLE not like", value, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleIn(List<String> values) {
            addCriterion("PW_PLAN_TITLE in", values, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleNotIn(List<String> values) {
            addCriterion("PW_PLAN_TITLE not in", values, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleBetween(String value1, String value2) {
            addCriterion("PW_PLAN_TITLE between", value1, value2, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleNotBetween(String value1, String value2) {
            addCriterion("PW_PLAN_TITLE not between", value1, value2, "pwPlanTitle");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpIsNull() {
            addCriterion("PW_PLAN_TITLE_UP is null");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpIsNotNull() {
            addCriterion("PW_PLAN_TITLE_UP is not null");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpEqualTo(String value) {
            addCriterion("PW_PLAN_TITLE_UP =", value, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpNotEqualTo(String value) {
            addCriterion("PW_PLAN_TITLE_UP <>", value, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpGreaterThan(String value) {
            addCriterion("PW_PLAN_TITLE_UP >", value, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpGreaterThanOrEqualTo(String value) {
            addCriterion("PW_PLAN_TITLE_UP >=", value, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpLessThan(String value) {
            addCriterion("PW_PLAN_TITLE_UP <", value, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpLessThanOrEqualTo(String value) {
            addCriterion("PW_PLAN_TITLE_UP <=", value, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpLike(String value) {
            addCriterion("PW_PLAN_TITLE_UP like", value, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpNotLike(String value) {
            addCriterion("PW_PLAN_TITLE_UP not like", value, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpIn(List<String> values) {
            addCriterion("PW_PLAN_TITLE_UP in", values, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpNotIn(List<String> values) {
            addCriterion("PW_PLAN_TITLE_UP not in", values, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpBetween(String value1, String value2) {
            addCriterion("PW_PLAN_TITLE_UP between", value1, value2, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwPlanTitleUpNotBetween(String value1, String value2) {
            addCriterion("PW_PLAN_TITLE_UP not between", value1, value2, "pwPlanTitleUp");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleIsNull() {
            addCriterion("PW_WVR_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleIsNotNull() {
            addCriterion("PW_WVR_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleEqualTo(String value) {
            addCriterion("PW_WVR_TITLE =", value, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleNotEqualTo(String value) {
            addCriterion("PW_WVR_TITLE <>", value, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleGreaterThan(String value) {
            addCriterion("PW_WVR_TITLE >", value, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PW_WVR_TITLE >=", value, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleLessThan(String value) {
            addCriterion("PW_WVR_TITLE <", value, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleLessThanOrEqualTo(String value) {
            addCriterion("PW_WVR_TITLE <=", value, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleLike(String value) {
            addCriterion("PW_WVR_TITLE like", value, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleNotLike(String value) {
            addCriterion("PW_WVR_TITLE not like", value, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleIn(List<String> values) {
            addCriterion("PW_WVR_TITLE in", values, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleNotIn(List<String> values) {
            addCriterion("PW_WVR_TITLE not in", values, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleBetween(String value1, String value2) {
            addCriterion("PW_WVR_TITLE between", value1, value2, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwWvrTitleNotBetween(String value1, String value2) {
            addCriterion("PW_WVR_TITLE not between", value1, value2, "pwWvrTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleIsNull() {
            addCriterion("PW_ADB_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleIsNotNull() {
            addCriterion("PW_ADB_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleEqualTo(String value) {
            addCriterion("PW_ADB_TITLE =", value, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleNotEqualTo(String value) {
            addCriterion("PW_ADB_TITLE <>", value, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleGreaterThan(String value) {
            addCriterion("PW_ADB_TITLE >", value, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PW_ADB_TITLE >=", value, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleLessThan(String value) {
            addCriterion("PW_ADB_TITLE <", value, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleLessThanOrEqualTo(String value) {
            addCriterion("PW_ADB_TITLE <=", value, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleLike(String value) {
            addCriterion("PW_ADB_TITLE like", value, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleNotLike(String value) {
            addCriterion("PW_ADB_TITLE not like", value, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleIn(List<String> values) {
            addCriterion("PW_ADB_TITLE in", values, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleNotIn(List<String> values) {
            addCriterion("PW_ADB_TITLE not in", values, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleBetween(String value1, String value2) {
            addCriterion("PW_ADB_TITLE between", value1, value2, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwAdbTitleNotBetween(String value1, String value2) {
            addCriterion("PW_ADB_TITLE not between", value1, value2, "pwAdbTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleIsNull() {
            addCriterion("PW_FE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleIsNotNull() {
            addCriterion("PW_FE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleEqualTo(String value) {
            addCriterion("PW_FE_TITLE =", value, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleNotEqualTo(String value) {
            addCriterion("PW_FE_TITLE <>", value, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleGreaterThan(String value) {
            addCriterion("PW_FE_TITLE >", value, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PW_FE_TITLE >=", value, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleLessThan(String value) {
            addCriterion("PW_FE_TITLE <", value, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleLessThanOrEqualTo(String value) {
            addCriterion("PW_FE_TITLE <=", value, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleLike(String value) {
            addCriterion("PW_FE_TITLE like", value, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleNotLike(String value) {
            addCriterion("PW_FE_TITLE not like", value, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleIn(List<String> values) {
            addCriterion("PW_FE_TITLE in", values, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleNotIn(List<String> values) {
            addCriterion("PW_FE_TITLE not in", values, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleBetween(String value1, String value2) {
            addCriterion("PW_FE_TITLE between", value1, value2, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwFeTitleNotBetween(String value1, String value2) {
            addCriterion("PW_FE_TITLE not between", value1, value2, "pwFeTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleIsNull() {
            addCriterion("PW_MR_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleIsNotNull() {
            addCriterion("PW_MR_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleEqualTo(String value) {
            addCriterion("PW_MR_TITLE =", value, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleNotEqualTo(String value) {
            addCriterion("PW_MR_TITLE <>", value, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleGreaterThan(String value) {
            addCriterion("PW_MR_TITLE >", value, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PW_MR_TITLE >=", value, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleLessThan(String value) {
            addCriterion("PW_MR_TITLE <", value, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleLessThanOrEqualTo(String value) {
            addCriterion("PW_MR_TITLE <=", value, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleLike(String value) {
            addCriterion("PW_MR_TITLE like", value, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleNotLike(String value) {
            addCriterion("PW_MR_TITLE not like", value, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleIn(List<String> values) {
            addCriterion("PW_MR_TITLE in", values, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleNotIn(List<String> values) {
            addCriterion("PW_MR_TITLE not in", values, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleBetween(String value1, String value2) {
            addCriterion("PW_MR_TITLE between", value1, value2, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwMrTitleNotBetween(String value1, String value2) {
            addCriterion("PW_MR_TITLE not between", value1, value2, "pwMrTitle");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanIsNull() {
            addCriterion("PW_BASIC_PA_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanIsNotNull() {
            addCriterion("PW_BASIC_PA_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanEqualTo(String value) {
            addCriterion("PW_BASIC_PA_PLAN =", value, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanNotEqualTo(String value) {
            addCriterion("PW_BASIC_PA_PLAN <>", value, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanGreaterThan(String value) {
            addCriterion("PW_BASIC_PA_PLAN >", value, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanGreaterThanOrEqualTo(String value) {
            addCriterion("PW_BASIC_PA_PLAN >=", value, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanLessThan(String value) {
            addCriterion("PW_BASIC_PA_PLAN <", value, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanLessThanOrEqualTo(String value) {
            addCriterion("PW_BASIC_PA_PLAN <=", value, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanLike(String value) {
            addCriterion("PW_BASIC_PA_PLAN like", value, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanNotLike(String value) {
            addCriterion("PW_BASIC_PA_PLAN not like", value, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanIn(List<String> values) {
            addCriterion("PW_BASIC_PA_PLAN in", values, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanNotIn(List<String> values) {
            addCriterion("PW_BASIC_PA_PLAN not in", values, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanBetween(String value1, String value2) {
            addCriterion("PW_BASIC_PA_PLAN between", value1, value2, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaPlanNotBetween(String value1, String value2) {
            addCriterion("PW_BASIC_PA_PLAN not between", value1, value2, "pwBasicPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsIsNull() {
            addCriterion("PW_BASIC_PA_RS is null");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsIsNotNull() {
            addCriterion("PW_BASIC_PA_RS is not null");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsEqualTo(String value) {
            addCriterion("PW_BASIC_PA_RS =", value, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsNotEqualTo(String value) {
            addCriterion("PW_BASIC_PA_RS <>", value, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsGreaterThan(String value) {
            addCriterion("PW_BASIC_PA_RS >", value, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsGreaterThanOrEqualTo(String value) {
            addCriterion("PW_BASIC_PA_RS >=", value, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsLessThan(String value) {
            addCriterion("PW_BASIC_PA_RS <", value, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsLessThanOrEqualTo(String value) {
            addCriterion("PW_BASIC_PA_RS <=", value, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsLike(String value) {
            addCriterion("PW_BASIC_PA_RS like", value, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsNotLike(String value) {
            addCriterion("PW_BASIC_PA_RS not like", value, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsIn(List<String> values) {
            addCriterion("PW_BASIC_PA_RS in", values, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsNotIn(List<String> values) {
            addCriterion("PW_BASIC_PA_RS not in", values, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsBetween(String value1, String value2) {
            addCriterion("PW_BASIC_PA_RS between", value1, value2, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaRsNotBetween(String value1, String value2) {
            addCriterion("PW_BASIC_PA_RS not between", value1, value2, "pwBasicPaRs");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangIsNull() {
            addCriterion("PW_BASIC_PA_LANG is null");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangIsNotNull() {
            addCriterion("PW_BASIC_PA_LANG is not null");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangEqualTo(String value) {
            addCriterion("PW_BASIC_PA_LANG =", value, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangNotEqualTo(String value) {
            addCriterion("PW_BASIC_PA_LANG <>", value, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangGreaterThan(String value) {
            addCriterion("PW_BASIC_PA_LANG >", value, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangGreaterThanOrEqualTo(String value) {
            addCriterion("PW_BASIC_PA_LANG >=", value, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangLessThan(String value) {
            addCriterion("PW_BASIC_PA_LANG <", value, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangLessThanOrEqualTo(String value) {
            addCriterion("PW_BASIC_PA_LANG <=", value, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangLike(String value) {
            addCriterion("PW_BASIC_PA_LANG like", value, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangNotLike(String value) {
            addCriterion("PW_BASIC_PA_LANG not like", value, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangIn(List<String> values) {
            addCriterion("PW_BASIC_PA_LANG in", values, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangNotIn(List<String> values) {
            addCriterion("PW_BASIC_PA_LANG not in", values, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangBetween(String value1, String value2) {
            addCriterion("PW_BASIC_PA_LANG between", value1, value2, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaLangNotBetween(String value1, String value2) {
            addCriterion("PW_BASIC_PA_LANG not between", value1, value2, "pwBasicPaLang");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocIsNull() {
            addCriterion("PW_BASIC_PA_ILOC is null");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocIsNotNull() {
            addCriterion("PW_BASIC_PA_ILOC is not null");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocEqualTo(String value) {
            addCriterion("PW_BASIC_PA_ILOC =", value, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocNotEqualTo(String value) {
            addCriterion("PW_BASIC_PA_ILOC <>", value, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocGreaterThan(String value) {
            addCriterion("PW_BASIC_PA_ILOC >", value, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocGreaterThanOrEqualTo(String value) {
            addCriterion("PW_BASIC_PA_ILOC >=", value, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocLessThan(String value) {
            addCriterion("PW_BASIC_PA_ILOC <", value, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocLessThanOrEqualTo(String value) {
            addCriterion("PW_BASIC_PA_ILOC <=", value, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocLike(String value) {
            addCriterion("PW_BASIC_PA_ILOC like", value, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocNotLike(String value) {
            addCriterion("PW_BASIC_PA_ILOC not like", value, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocIn(List<String> values) {
            addCriterion("PW_BASIC_PA_ILOC in", values, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocNotIn(List<String> values) {
            addCriterion("PW_BASIC_PA_ILOC not in", values, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocBetween(String value1, String value2) {
            addCriterion("PW_BASIC_PA_ILOC between", value1, value2, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwBasicPaIlocNotBetween(String value1, String value2) {
            addCriterion("PW_BASIC_PA_ILOC not between", value1, value2, "pwBasicPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanIsNull() {
            addCriterion("PW_WVR_PA_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanIsNotNull() {
            addCriterion("PW_WVR_PA_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanEqualTo(String value) {
            addCriterion("PW_WVR_PA_PLAN =", value, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanNotEqualTo(String value) {
            addCriterion("PW_WVR_PA_PLAN <>", value, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanGreaterThan(String value) {
            addCriterion("PW_WVR_PA_PLAN >", value, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanGreaterThanOrEqualTo(String value) {
            addCriterion("PW_WVR_PA_PLAN >=", value, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanLessThan(String value) {
            addCriterion("PW_WVR_PA_PLAN <", value, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanLessThanOrEqualTo(String value) {
            addCriterion("PW_WVR_PA_PLAN <=", value, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanLike(String value) {
            addCriterion("PW_WVR_PA_PLAN like", value, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanNotLike(String value) {
            addCriterion("PW_WVR_PA_PLAN not like", value, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanIn(List<String> values) {
            addCriterion("PW_WVR_PA_PLAN in", values, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanNotIn(List<String> values) {
            addCriterion("PW_WVR_PA_PLAN not in", values, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanBetween(String value1, String value2) {
            addCriterion("PW_WVR_PA_PLAN between", value1, value2, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaPlanNotBetween(String value1, String value2) {
            addCriterion("PW_WVR_PA_PLAN not between", value1, value2, "pwWvrPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsIsNull() {
            addCriterion("PW_WVR_PA_RS is null");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsIsNotNull() {
            addCriterion("PW_WVR_PA_RS is not null");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsEqualTo(String value) {
            addCriterion("PW_WVR_PA_RS =", value, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsNotEqualTo(String value) {
            addCriterion("PW_WVR_PA_RS <>", value, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsGreaterThan(String value) {
            addCriterion("PW_WVR_PA_RS >", value, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsGreaterThanOrEqualTo(String value) {
            addCriterion("PW_WVR_PA_RS >=", value, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsLessThan(String value) {
            addCriterion("PW_WVR_PA_RS <", value, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsLessThanOrEqualTo(String value) {
            addCriterion("PW_WVR_PA_RS <=", value, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsLike(String value) {
            addCriterion("PW_WVR_PA_RS like", value, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsNotLike(String value) {
            addCriterion("PW_WVR_PA_RS not like", value, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsIn(List<String> values) {
            addCriterion("PW_WVR_PA_RS in", values, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsNotIn(List<String> values) {
            addCriterion("PW_WVR_PA_RS not in", values, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsBetween(String value1, String value2) {
            addCriterion("PW_WVR_PA_RS between", value1, value2, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaRsNotBetween(String value1, String value2) {
            addCriterion("PW_WVR_PA_RS not between", value1, value2, "pwWvrPaRs");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangIsNull() {
            addCriterion("PW_WVR_PA_LANG is null");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangIsNotNull() {
            addCriterion("PW_WVR_PA_LANG is not null");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangEqualTo(String value) {
            addCriterion("PW_WVR_PA_LANG =", value, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangNotEqualTo(String value) {
            addCriterion("PW_WVR_PA_LANG <>", value, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangGreaterThan(String value) {
            addCriterion("PW_WVR_PA_LANG >", value, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangGreaterThanOrEqualTo(String value) {
            addCriterion("PW_WVR_PA_LANG >=", value, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangLessThan(String value) {
            addCriterion("PW_WVR_PA_LANG <", value, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangLessThanOrEqualTo(String value) {
            addCriterion("PW_WVR_PA_LANG <=", value, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangLike(String value) {
            addCriterion("PW_WVR_PA_LANG like", value, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangNotLike(String value) {
            addCriterion("PW_WVR_PA_LANG not like", value, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangIn(List<String> values) {
            addCriterion("PW_WVR_PA_LANG in", values, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangNotIn(List<String> values) {
            addCriterion("PW_WVR_PA_LANG not in", values, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangBetween(String value1, String value2) {
            addCriterion("PW_WVR_PA_LANG between", value1, value2, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaLangNotBetween(String value1, String value2) {
            addCriterion("PW_WVR_PA_LANG not between", value1, value2, "pwWvrPaLang");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocIsNull() {
            addCriterion("PW_WVR_PA_ILOC is null");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocIsNotNull() {
            addCriterion("PW_WVR_PA_ILOC is not null");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocEqualTo(String value) {
            addCriterion("PW_WVR_PA_ILOC =", value, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocNotEqualTo(String value) {
            addCriterion("PW_WVR_PA_ILOC <>", value, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocGreaterThan(String value) {
            addCriterion("PW_WVR_PA_ILOC >", value, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocGreaterThanOrEqualTo(String value) {
            addCriterion("PW_WVR_PA_ILOC >=", value, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocLessThan(String value) {
            addCriterion("PW_WVR_PA_ILOC <", value, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocLessThanOrEqualTo(String value) {
            addCriterion("PW_WVR_PA_ILOC <=", value, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocLike(String value) {
            addCriterion("PW_WVR_PA_ILOC like", value, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocNotLike(String value) {
            addCriterion("PW_WVR_PA_ILOC not like", value, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocIn(List<String> values) {
            addCriterion("PW_WVR_PA_ILOC in", values, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocNotIn(List<String> values) {
            addCriterion("PW_WVR_PA_ILOC not in", values, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocBetween(String value1, String value2) {
            addCriterion("PW_WVR_PA_ILOC between", value1, value2, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwWvrPaIlocNotBetween(String value1, String value2) {
            addCriterion("PW_WVR_PA_ILOC not between", value1, value2, "pwWvrPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanIsNull() {
            addCriterion("PW_ADB_PA_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanIsNotNull() {
            addCriterion("PW_ADB_PA_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanEqualTo(String value) {
            addCriterion("PW_ADB_PA_PLAN =", value, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanNotEqualTo(String value) {
            addCriterion("PW_ADB_PA_PLAN <>", value, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanGreaterThan(String value) {
            addCriterion("PW_ADB_PA_PLAN >", value, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanGreaterThanOrEqualTo(String value) {
            addCriterion("PW_ADB_PA_PLAN >=", value, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanLessThan(String value) {
            addCriterion("PW_ADB_PA_PLAN <", value, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanLessThanOrEqualTo(String value) {
            addCriterion("PW_ADB_PA_PLAN <=", value, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanLike(String value) {
            addCriterion("PW_ADB_PA_PLAN like", value, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanNotLike(String value) {
            addCriterion("PW_ADB_PA_PLAN not like", value, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanIn(List<String> values) {
            addCriterion("PW_ADB_PA_PLAN in", values, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanNotIn(List<String> values) {
            addCriterion("PW_ADB_PA_PLAN not in", values, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanBetween(String value1, String value2) {
            addCriterion("PW_ADB_PA_PLAN between", value1, value2, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaPlanNotBetween(String value1, String value2) {
            addCriterion("PW_ADB_PA_PLAN not between", value1, value2, "pwAdbPaPlan");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsIsNull() {
            addCriterion("PW_ADB_PA_RS is null");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsIsNotNull() {
            addCriterion("PW_ADB_PA_RS is not null");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsEqualTo(String value) {
            addCriterion("PW_ADB_PA_RS =", value, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsNotEqualTo(String value) {
            addCriterion("PW_ADB_PA_RS <>", value, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsGreaterThan(String value) {
            addCriterion("PW_ADB_PA_RS >", value, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsGreaterThanOrEqualTo(String value) {
            addCriterion("PW_ADB_PA_RS >=", value, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsLessThan(String value) {
            addCriterion("PW_ADB_PA_RS <", value, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsLessThanOrEqualTo(String value) {
            addCriterion("PW_ADB_PA_RS <=", value, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsLike(String value) {
            addCriterion("PW_ADB_PA_RS like", value, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsNotLike(String value) {
            addCriterion("PW_ADB_PA_RS not like", value, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsIn(List<String> values) {
            addCriterion("PW_ADB_PA_RS in", values, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsNotIn(List<String> values) {
            addCriterion("PW_ADB_PA_RS not in", values, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsBetween(String value1, String value2) {
            addCriterion("PW_ADB_PA_RS between", value1, value2, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaRsNotBetween(String value1, String value2) {
            addCriterion("PW_ADB_PA_RS not between", value1, value2, "pwAdbPaRs");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangIsNull() {
            addCriterion("PW_ADB_PA_LANG is null");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangIsNotNull() {
            addCriterion("PW_ADB_PA_LANG is not null");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangEqualTo(String value) {
            addCriterion("PW_ADB_PA_LANG =", value, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangNotEqualTo(String value) {
            addCriterion("PW_ADB_PA_LANG <>", value, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangGreaterThan(String value) {
            addCriterion("PW_ADB_PA_LANG >", value, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangGreaterThanOrEqualTo(String value) {
            addCriterion("PW_ADB_PA_LANG >=", value, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangLessThan(String value) {
            addCriterion("PW_ADB_PA_LANG <", value, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangLessThanOrEqualTo(String value) {
            addCriterion("PW_ADB_PA_LANG <=", value, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangLike(String value) {
            addCriterion("PW_ADB_PA_LANG like", value, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangNotLike(String value) {
            addCriterion("PW_ADB_PA_LANG not like", value, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangIn(List<String> values) {
            addCriterion("PW_ADB_PA_LANG in", values, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangNotIn(List<String> values) {
            addCriterion("PW_ADB_PA_LANG not in", values, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangBetween(String value1, String value2) {
            addCriterion("PW_ADB_PA_LANG between", value1, value2, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaLangNotBetween(String value1, String value2) {
            addCriterion("PW_ADB_PA_LANG not between", value1, value2, "pwAdbPaLang");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocIsNull() {
            addCriterion("PW_ADB_PA_ILOC is null");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocIsNotNull() {
            addCriterion("PW_ADB_PA_ILOC is not null");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocEqualTo(String value) {
            addCriterion("PW_ADB_PA_ILOC =", value, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocNotEqualTo(String value) {
            addCriterion("PW_ADB_PA_ILOC <>", value, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocGreaterThan(String value) {
            addCriterion("PW_ADB_PA_ILOC >", value, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocGreaterThanOrEqualTo(String value) {
            addCriterion("PW_ADB_PA_ILOC >=", value, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocLessThan(String value) {
            addCriterion("PW_ADB_PA_ILOC <", value, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocLessThanOrEqualTo(String value) {
            addCriterion("PW_ADB_PA_ILOC <=", value, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocLike(String value) {
            addCriterion("PW_ADB_PA_ILOC like", value, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocNotLike(String value) {
            addCriterion("PW_ADB_PA_ILOC not like", value, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocIn(List<String> values) {
            addCriterion("PW_ADB_PA_ILOC in", values, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocNotIn(List<String> values) {
            addCriterion("PW_ADB_PA_ILOC not in", values, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocBetween(String value1, String value2) {
            addCriterion("PW_ADB_PA_ILOC between", value1, value2, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwAdbPaIlocNotBetween(String value1, String value2) {
            addCriterion("PW_ADB_PA_ILOC not between", value1, value2, "pwAdbPaIloc");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionIsNull() {
            addCriterion("PW_MSG1_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionIsNotNull() {
            addCriterion("PW_MSG1_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionEqualTo(String value) {
            addCriterion("PW_MSG1_CONDITION =", value, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionNotEqualTo(String value) {
            addCriterion("PW_MSG1_CONDITION <>", value, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionGreaterThan(String value) {
            addCriterion("PW_MSG1_CONDITION >", value, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionGreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG1_CONDITION >=", value, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionLessThan(String value) {
            addCriterion("PW_MSG1_CONDITION <", value, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionLessThanOrEqualTo(String value) {
            addCriterion("PW_MSG1_CONDITION <=", value, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionLike(String value) {
            addCriterion("PW_MSG1_CONDITION like", value, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionNotLike(String value) {
            addCriterion("PW_MSG1_CONDITION not like", value, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionIn(List<String> values) {
            addCriterion("PW_MSG1_CONDITION in", values, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionNotIn(List<String> values) {
            addCriterion("PW_MSG1_CONDITION not in", values, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionBetween(String value1, String value2) {
            addCriterion("PW_MSG1_CONDITION between", value1, value2, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1ConditionNotBetween(String value1, String value2) {
            addCriterion("PW_MSG1_CONDITION not between", value1, value2, "pwMsg1Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01IsNull() {
            addCriterion("PW_MSG1_LINE_01 is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01IsNotNull() {
            addCriterion("PW_MSG1_LINE_01 is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01EqualTo(String value) {
            addCriterion("PW_MSG1_LINE_01 =", value, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01NotEqualTo(String value) {
            addCriterion("PW_MSG1_LINE_01 <>", value, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01GreaterThan(String value) {
            addCriterion("PW_MSG1_LINE_01 >", value, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01GreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG1_LINE_01 >=", value, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01LessThan(String value) {
            addCriterion("PW_MSG1_LINE_01 <", value, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01LessThanOrEqualTo(String value) {
            addCriterion("PW_MSG1_LINE_01 <=", value, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01Like(String value) {
            addCriterion("PW_MSG1_LINE_01 like", value, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01NotLike(String value) {
            addCriterion("PW_MSG1_LINE_01 not like", value, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01In(List<String> values) {
            addCriterion("PW_MSG1_LINE_01 in", values, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01NotIn(List<String> values) {
            addCriterion("PW_MSG1_LINE_01 not in", values, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01Between(String value1, String value2) {
            addCriterion("PW_MSG1_LINE_01 between", value1, value2, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line01NotBetween(String value1, String value2) {
            addCriterion("PW_MSG1_LINE_01 not between", value1, value2, "pwMsg1Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02IsNull() {
            addCriterion("PW_MSG1_LINE_02 is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02IsNotNull() {
            addCriterion("PW_MSG1_LINE_02 is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02EqualTo(String value) {
            addCriterion("PW_MSG1_LINE_02 =", value, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02NotEqualTo(String value) {
            addCriterion("PW_MSG1_LINE_02 <>", value, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02GreaterThan(String value) {
            addCriterion("PW_MSG1_LINE_02 >", value, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02GreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG1_LINE_02 >=", value, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02LessThan(String value) {
            addCriterion("PW_MSG1_LINE_02 <", value, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02LessThanOrEqualTo(String value) {
            addCriterion("PW_MSG1_LINE_02 <=", value, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02Like(String value) {
            addCriterion("PW_MSG1_LINE_02 like", value, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02NotLike(String value) {
            addCriterion("PW_MSG1_LINE_02 not like", value, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02In(List<String> values) {
            addCriterion("PW_MSG1_LINE_02 in", values, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02NotIn(List<String> values) {
            addCriterion("PW_MSG1_LINE_02 not in", values, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02Between(String value1, String value2) {
            addCriterion("PW_MSG1_LINE_02 between", value1, value2, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg1Line02NotBetween(String value1, String value2) {
            addCriterion("PW_MSG1_LINE_02 not between", value1, value2, "pwMsg1Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionIsNull() {
            addCriterion("PW_MSG2_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionIsNotNull() {
            addCriterion("PW_MSG2_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionEqualTo(String value) {
            addCriterion("PW_MSG2_CONDITION =", value, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionNotEqualTo(String value) {
            addCriterion("PW_MSG2_CONDITION <>", value, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionGreaterThan(String value) {
            addCriterion("PW_MSG2_CONDITION >", value, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionGreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG2_CONDITION >=", value, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionLessThan(String value) {
            addCriterion("PW_MSG2_CONDITION <", value, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionLessThanOrEqualTo(String value) {
            addCriterion("PW_MSG2_CONDITION <=", value, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionLike(String value) {
            addCriterion("PW_MSG2_CONDITION like", value, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionNotLike(String value) {
            addCriterion("PW_MSG2_CONDITION not like", value, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionIn(List<String> values) {
            addCriterion("PW_MSG2_CONDITION in", values, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionNotIn(List<String> values) {
            addCriterion("PW_MSG2_CONDITION not in", values, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionBetween(String value1, String value2) {
            addCriterion("PW_MSG2_CONDITION between", value1, value2, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2ConditionNotBetween(String value1, String value2) {
            addCriterion("PW_MSG2_CONDITION not between", value1, value2, "pwMsg2Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01IsNull() {
            addCriterion("PW_MSG2_LINE_01 is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01IsNotNull() {
            addCriterion("PW_MSG2_LINE_01 is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01EqualTo(String value) {
            addCriterion("PW_MSG2_LINE_01 =", value, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01NotEqualTo(String value) {
            addCriterion("PW_MSG2_LINE_01 <>", value, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01GreaterThan(String value) {
            addCriterion("PW_MSG2_LINE_01 >", value, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01GreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG2_LINE_01 >=", value, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01LessThan(String value) {
            addCriterion("PW_MSG2_LINE_01 <", value, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01LessThanOrEqualTo(String value) {
            addCriterion("PW_MSG2_LINE_01 <=", value, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01Like(String value) {
            addCriterion("PW_MSG2_LINE_01 like", value, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01NotLike(String value) {
            addCriterion("PW_MSG2_LINE_01 not like", value, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01In(List<String> values) {
            addCriterion("PW_MSG2_LINE_01 in", values, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01NotIn(List<String> values) {
            addCriterion("PW_MSG2_LINE_01 not in", values, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01Between(String value1, String value2) {
            addCriterion("PW_MSG2_LINE_01 between", value1, value2, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line01NotBetween(String value1, String value2) {
            addCriterion("PW_MSG2_LINE_01 not between", value1, value2, "pwMsg2Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02IsNull() {
            addCriterion("PW_MSG2_LINE_02 is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02IsNotNull() {
            addCriterion("PW_MSG2_LINE_02 is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02EqualTo(String value) {
            addCriterion("PW_MSG2_LINE_02 =", value, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02NotEqualTo(String value) {
            addCriterion("PW_MSG2_LINE_02 <>", value, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02GreaterThan(String value) {
            addCriterion("PW_MSG2_LINE_02 >", value, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02GreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG2_LINE_02 >=", value, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02LessThan(String value) {
            addCriterion("PW_MSG2_LINE_02 <", value, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02LessThanOrEqualTo(String value) {
            addCriterion("PW_MSG2_LINE_02 <=", value, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02Like(String value) {
            addCriterion("PW_MSG2_LINE_02 like", value, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02NotLike(String value) {
            addCriterion("PW_MSG2_LINE_02 not like", value, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02In(List<String> values) {
            addCriterion("PW_MSG2_LINE_02 in", values, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02NotIn(List<String> values) {
            addCriterion("PW_MSG2_LINE_02 not in", values, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02Between(String value1, String value2) {
            addCriterion("PW_MSG2_LINE_02 between", value1, value2, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line02NotBetween(String value1, String value2) {
            addCriterion("PW_MSG2_LINE_02 not between", value1, value2, "pwMsg2Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03IsNull() {
            addCriterion("PW_MSG2_LINE_03 is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03IsNotNull() {
            addCriterion("PW_MSG2_LINE_03 is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03EqualTo(String value) {
            addCriterion("PW_MSG2_LINE_03 =", value, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03NotEqualTo(String value) {
            addCriterion("PW_MSG2_LINE_03 <>", value, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03GreaterThan(String value) {
            addCriterion("PW_MSG2_LINE_03 >", value, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03GreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG2_LINE_03 >=", value, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03LessThan(String value) {
            addCriterion("PW_MSG2_LINE_03 <", value, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03LessThanOrEqualTo(String value) {
            addCriterion("PW_MSG2_LINE_03 <=", value, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03Like(String value) {
            addCriterion("PW_MSG2_LINE_03 like", value, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03NotLike(String value) {
            addCriterion("PW_MSG2_LINE_03 not like", value, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03In(List<String> values) {
            addCriterion("PW_MSG2_LINE_03 in", values, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03NotIn(List<String> values) {
            addCriterion("PW_MSG2_LINE_03 not in", values, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03Between(String value1, String value2) {
            addCriterion("PW_MSG2_LINE_03 between", value1, value2, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg2Line03NotBetween(String value1, String value2) {
            addCriterion("PW_MSG2_LINE_03 not between", value1, value2, "pwMsg2Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionIsNull() {
            addCriterion("PW_MSG3_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionIsNotNull() {
            addCriterion("PW_MSG3_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionEqualTo(String value) {
            addCriterion("PW_MSG3_CONDITION =", value, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionNotEqualTo(String value) {
            addCriterion("PW_MSG3_CONDITION <>", value, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionGreaterThan(String value) {
            addCriterion("PW_MSG3_CONDITION >", value, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionGreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG3_CONDITION >=", value, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionLessThan(String value) {
            addCriterion("PW_MSG3_CONDITION <", value, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionLessThanOrEqualTo(String value) {
            addCriterion("PW_MSG3_CONDITION <=", value, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionLike(String value) {
            addCriterion("PW_MSG3_CONDITION like", value, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionNotLike(String value) {
            addCriterion("PW_MSG3_CONDITION not like", value, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionIn(List<String> values) {
            addCriterion("PW_MSG3_CONDITION in", values, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionNotIn(List<String> values) {
            addCriterion("PW_MSG3_CONDITION not in", values, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionBetween(String value1, String value2) {
            addCriterion("PW_MSG3_CONDITION between", value1, value2, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3ConditionNotBetween(String value1, String value2) {
            addCriterion("PW_MSG3_CONDITION not between", value1, value2, "pwMsg3Condition");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01IsNull() {
            addCriterion("PW_MSG3_LINE_01 is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01IsNotNull() {
            addCriterion("PW_MSG3_LINE_01 is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01EqualTo(String value) {
            addCriterion("PW_MSG3_LINE_01 =", value, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01NotEqualTo(String value) {
            addCriterion("PW_MSG3_LINE_01 <>", value, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01GreaterThan(String value) {
            addCriterion("PW_MSG3_LINE_01 >", value, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01GreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG3_LINE_01 >=", value, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01LessThan(String value) {
            addCriterion("PW_MSG3_LINE_01 <", value, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01LessThanOrEqualTo(String value) {
            addCriterion("PW_MSG3_LINE_01 <=", value, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01Like(String value) {
            addCriterion("PW_MSG3_LINE_01 like", value, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01NotLike(String value) {
            addCriterion("PW_MSG3_LINE_01 not like", value, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01In(List<String> values) {
            addCriterion("PW_MSG3_LINE_01 in", values, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01NotIn(List<String> values) {
            addCriterion("PW_MSG3_LINE_01 not in", values, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01Between(String value1, String value2) {
            addCriterion("PW_MSG3_LINE_01 between", value1, value2, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line01NotBetween(String value1, String value2) {
            addCriterion("PW_MSG3_LINE_01 not between", value1, value2, "pwMsg3Line01");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02IsNull() {
            addCriterion("PW_MSG3_LINE_02 is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02IsNotNull() {
            addCriterion("PW_MSG3_LINE_02 is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02EqualTo(String value) {
            addCriterion("PW_MSG3_LINE_02 =", value, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02NotEqualTo(String value) {
            addCriterion("PW_MSG3_LINE_02 <>", value, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02GreaterThan(String value) {
            addCriterion("PW_MSG3_LINE_02 >", value, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02GreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG3_LINE_02 >=", value, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02LessThan(String value) {
            addCriterion("PW_MSG3_LINE_02 <", value, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02LessThanOrEqualTo(String value) {
            addCriterion("PW_MSG3_LINE_02 <=", value, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02Like(String value) {
            addCriterion("PW_MSG3_LINE_02 like", value, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02NotLike(String value) {
            addCriterion("PW_MSG3_LINE_02 not like", value, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02In(List<String> values) {
            addCriterion("PW_MSG3_LINE_02 in", values, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02NotIn(List<String> values) {
            addCriterion("PW_MSG3_LINE_02 not in", values, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02Between(String value1, String value2) {
            addCriterion("PW_MSG3_LINE_02 between", value1, value2, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line02NotBetween(String value1, String value2) {
            addCriterion("PW_MSG3_LINE_02 not between", value1, value2, "pwMsg3Line02");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03IsNull() {
            addCriterion("PW_MSG3_LINE_03 is null");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03IsNotNull() {
            addCriterion("PW_MSG3_LINE_03 is not null");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03EqualTo(String value) {
            addCriterion("PW_MSG3_LINE_03 =", value, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03NotEqualTo(String value) {
            addCriterion("PW_MSG3_LINE_03 <>", value, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03GreaterThan(String value) {
            addCriterion("PW_MSG3_LINE_03 >", value, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03GreaterThanOrEqualTo(String value) {
            addCriterion("PW_MSG3_LINE_03 >=", value, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03LessThan(String value) {
            addCriterion("PW_MSG3_LINE_03 <", value, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03LessThanOrEqualTo(String value) {
            addCriterion("PW_MSG3_LINE_03 <=", value, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03Like(String value) {
            addCriterion("PW_MSG3_LINE_03 like", value, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03NotLike(String value) {
            addCriterion("PW_MSG3_LINE_03 not like", value, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03In(List<String> values) {
            addCriterion("PW_MSG3_LINE_03 in", values, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03NotIn(List<String> values) {
            addCriterion("PW_MSG3_LINE_03 not in", values, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03Between(String value1, String value2) {
            addCriterion("PW_MSG3_LINE_03 between", value1, value2, "pwMsg3Line03");
            return (Criteria) this;
        }

        public Criteria andPwMsg3Line03NotBetween(String value1, String value2) {
            addCriterion("PW_MSG3_LINE_03 not between", value1, value2, "pwMsg3Line03");
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