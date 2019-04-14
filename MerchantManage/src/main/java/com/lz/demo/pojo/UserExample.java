package com.lz.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("USERPWD is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("USERPWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("USERPWD =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("USERPWD <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("USERPWD >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("USERPWD >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("USERPWD <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("USERPWD <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("USERPWD like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("USERPWD not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("USERPWD in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("USERPWD not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("USERPWD between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("USERPWD not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("USERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("USERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("USERTYPE =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("USERTYPE <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("USERTYPE >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("USERTYPE >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("USERTYPE <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("USERTYPE <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("USERTYPE like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("USERTYPE not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<String> values) {
            addCriterion("USERTYPE in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<String> values) {
            addCriterion("USERTYPE not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("USERTYPE between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("USERTYPE not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andIsrealnameIsNull() {
            addCriterion("ISREALNAME is null");
            return (Criteria) this;
        }

        public Criteria andIsrealnameIsNotNull() {
            addCriterion("ISREALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andIsrealnameEqualTo(String value) {
            addCriterion("ISREALNAME =", value, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameNotEqualTo(String value) {
            addCriterion("ISREALNAME <>", value, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameGreaterThan(String value) {
            addCriterion("ISREALNAME >", value, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("ISREALNAME >=", value, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameLessThan(String value) {
            addCriterion("ISREALNAME <", value, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameLessThanOrEqualTo(String value) {
            addCriterion("ISREALNAME <=", value, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameLike(String value) {
            addCriterion("ISREALNAME like", value, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameNotLike(String value) {
            addCriterion("ISREALNAME not like", value, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameIn(List<String> values) {
            addCriterion("ISREALNAME in", values, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameNotIn(List<String> values) {
            addCriterion("ISREALNAME not in", values, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameBetween(String value1, String value2) {
            addCriterion("ISREALNAME between", value1, value2, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIsrealnameNotBetween(String value1, String value2) {
            addCriterion("ISREALNAME not between", value1, value2, "isrealname");
            return (Criteria) this;
        }

        public Criteria andIssignIsNull() {
            addCriterion("ISSIGN is null");
            return (Criteria) this;
        }

        public Criteria andIssignIsNotNull() {
            addCriterion("ISSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andIssignEqualTo(String value) {
            addCriterion("ISSIGN =", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotEqualTo(String value) {
            addCriterion("ISSIGN <>", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignGreaterThan(String value) {
            addCriterion("ISSIGN >", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignGreaterThanOrEqualTo(String value) {
            addCriterion("ISSIGN >=", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLessThan(String value) {
            addCriterion("ISSIGN <", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLessThanOrEqualTo(String value) {
            addCriterion("ISSIGN <=", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLike(String value) {
            addCriterion("ISSIGN like", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotLike(String value) {
            addCriterion("ISSIGN not like", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignIn(List<String> values) {
            addCriterion("ISSIGN in", values, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotIn(List<String> values) {
            addCriterion("ISSIGN not in", values, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignBetween(String value1, String value2) {
            addCriterion("ISSIGN between", value1, value2, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotBetween(String value1, String value2) {
            addCriterion("ISSIGN not between", value1, value2, "issign");
            return (Criteria) this;
        }

        public Criteria andHeadpicidIsNull() {
            addCriterion("HEADPICID is null");
            return (Criteria) this;
        }

        public Criteria andHeadpicidIsNotNull() {
            addCriterion("HEADPICID is not null");
            return (Criteria) this;
        }

        public Criteria andHeadpicidEqualTo(String value) {
            addCriterion("HEADPICID =", value, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidNotEqualTo(String value) {
            addCriterion("HEADPICID <>", value, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidGreaterThan(String value) {
            addCriterion("HEADPICID >", value, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidGreaterThanOrEqualTo(String value) {
            addCriterion("HEADPICID >=", value, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidLessThan(String value) {
            addCriterion("HEADPICID <", value, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidLessThanOrEqualTo(String value) {
            addCriterion("HEADPICID <=", value, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidLike(String value) {
            addCriterion("HEADPICID like", value, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidNotLike(String value) {
            addCriterion("HEADPICID not like", value, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidIn(List<String> values) {
            addCriterion("HEADPICID in", values, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidNotIn(List<String> values) {
            addCriterion("HEADPICID not in", values, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidBetween(String value1, String value2) {
            addCriterion("HEADPICID between", value1, value2, "headpicid");
            return (Criteria) this;
        }

        public Criteria andHeadpicidNotBetween(String value1, String value2) {
            addCriterion("HEADPICID not between", value1, value2, "headpicid");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("INTRODUCTION =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("INTRODUCTION <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("INTRODUCTION >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("INTRODUCTION <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("INTRODUCTION like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("INTRODUCTION not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("INTRODUCTION in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("INTRODUCTION not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("INTRODUCTION between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("INTRODUCTION not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andAccesstokenIsNull() {
            addCriterion("ACCESSTOKEN is null");
            return (Criteria) this;
        }

        public Criteria andAccesstokenIsNotNull() {
            addCriterion("ACCESSTOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andAccesstokenEqualTo(String value) {
            addCriterion("ACCESSTOKEN =", value, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenNotEqualTo(String value) {
            addCriterion("ACCESSTOKEN <>", value, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenGreaterThan(String value) {
            addCriterion("ACCESSTOKEN >", value, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESSTOKEN >=", value, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenLessThan(String value) {
            addCriterion("ACCESSTOKEN <", value, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenLessThanOrEqualTo(String value) {
            addCriterion("ACCESSTOKEN <=", value, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenLike(String value) {
            addCriterion("ACCESSTOKEN like", value, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenNotLike(String value) {
            addCriterion("ACCESSTOKEN not like", value, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenIn(List<String> values) {
            addCriterion("ACCESSTOKEN in", values, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenNotIn(List<String> values) {
            addCriterion("ACCESSTOKEN not in", values, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenBetween(String value1, String value2) {
            addCriterion("ACCESSTOKEN between", value1, value2, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andAccesstokenNotBetween(String value1, String value2) {
            addCriterion("ACCESSTOKEN not between", value1, value2, "accesstoken");
            return (Criteria) this;
        }

        public Criteria andSecritkeyIsNull() {
            addCriterion("SECRITKEY is null");
            return (Criteria) this;
        }

        public Criteria andSecritkeyIsNotNull() {
            addCriterion("SECRITKEY is not null");
            return (Criteria) this;
        }

        public Criteria andSecritkeyEqualTo(String value) {
            addCriterion("SECRITKEY =", value, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyNotEqualTo(String value) {
            addCriterion("SECRITKEY <>", value, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyGreaterThan(String value) {
            addCriterion("SECRITKEY >", value, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyGreaterThanOrEqualTo(String value) {
            addCriterion("SECRITKEY >=", value, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyLessThan(String value) {
            addCriterion("SECRITKEY <", value, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyLessThanOrEqualTo(String value) {
            addCriterion("SECRITKEY <=", value, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyLike(String value) {
            addCriterion("SECRITKEY like", value, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyNotLike(String value) {
            addCriterion("SECRITKEY not like", value, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyIn(List<String> values) {
            addCriterion("SECRITKEY in", values, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyNotIn(List<String> values) {
            addCriterion("SECRITKEY not in", values, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyBetween(String value1, String value2) {
            addCriterion("SECRITKEY between", value1, value2, "secritkey");
            return (Criteria) this;
        }

        public Criteria andSecritkeyNotBetween(String value1, String value2) {
            addCriterion("SECRITKEY not between", value1, value2, "secritkey");
            return (Criteria) this;
        }

        public Criteria andGiturlIsNull() {
            addCriterion("GITURL is null");
            return (Criteria) this;
        }

        public Criteria andGiturlIsNotNull() {
            addCriterion("GITURL is not null");
            return (Criteria) this;
        }

        public Criteria andGiturlEqualTo(String value) {
            addCriterion("GITURL =", value, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlNotEqualTo(String value) {
            addCriterion("GITURL <>", value, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlGreaterThan(String value) {
            addCriterion("GITURL >", value, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlGreaterThanOrEqualTo(String value) {
            addCriterion("GITURL >=", value, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlLessThan(String value) {
            addCriterion("GITURL <", value, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlLessThanOrEqualTo(String value) {
            addCriterion("GITURL <=", value, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlLike(String value) {
            addCriterion("GITURL like", value, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlNotLike(String value) {
            addCriterion("GITURL not like", value, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlIn(List<String> values) {
            addCriterion("GITURL in", values, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlNotIn(List<String> values) {
            addCriterion("GITURL not in", values, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlBetween(String value1, String value2) {
            addCriterion("GITURL between", value1, value2, "giturl");
            return (Criteria) this;
        }

        public Criteria andGiturlNotBetween(String value1, String value2) {
            addCriterion("GITURL not between", value1, value2, "giturl");
            return (Criteria) this;
        }

        public Criteria andGitusernamIsNull() {
            addCriterion("GITUSERNAM is null");
            return (Criteria) this;
        }

        public Criteria andGitusernamIsNotNull() {
            addCriterion("GITUSERNAM is not null");
            return (Criteria) this;
        }

        public Criteria andGitusernamEqualTo(String value) {
            addCriterion("GITUSERNAM =", value, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamNotEqualTo(String value) {
            addCriterion("GITUSERNAM <>", value, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamGreaterThan(String value) {
            addCriterion("GITUSERNAM >", value, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamGreaterThanOrEqualTo(String value) {
            addCriterion("GITUSERNAM >=", value, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamLessThan(String value) {
            addCriterion("GITUSERNAM <", value, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamLessThanOrEqualTo(String value) {
            addCriterion("GITUSERNAM <=", value, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamLike(String value) {
            addCriterion("GITUSERNAM like", value, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamNotLike(String value) {
            addCriterion("GITUSERNAM not like", value, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamIn(List<String> values) {
            addCriterion("GITUSERNAM in", values, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamNotIn(List<String> values) {
            addCriterion("GITUSERNAM not in", values, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamBetween(String value1, String value2) {
            addCriterion("GITUSERNAM between", value1, value2, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitusernamNotBetween(String value1, String value2) {
            addCriterion("GITUSERNAM not between", value1, value2, "gitusernam");
            return (Criteria) this;
        }

        public Criteria andGitpwdIsNull() {
            addCriterion("GITPWD is null");
            return (Criteria) this;
        }

        public Criteria andGitpwdIsNotNull() {
            addCriterion("GITPWD is not null");
            return (Criteria) this;
        }

        public Criteria andGitpwdEqualTo(String value) {
            addCriterion("GITPWD =", value, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdNotEqualTo(String value) {
            addCriterion("GITPWD <>", value, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdGreaterThan(String value) {
            addCriterion("GITPWD >", value, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdGreaterThanOrEqualTo(String value) {
            addCriterion("GITPWD >=", value, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdLessThan(String value) {
            addCriterion("GITPWD <", value, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdLessThanOrEqualTo(String value) {
            addCriterion("GITPWD <=", value, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdLike(String value) {
            addCriterion("GITPWD like", value, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdNotLike(String value) {
            addCriterion("GITPWD not like", value, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdIn(List<String> values) {
            addCriterion("GITPWD in", values, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdNotIn(List<String> values) {
            addCriterion("GITPWD not in", values, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdBetween(String value1, String value2) {
            addCriterion("GITPWD between", value1, value2, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andGitpwdNotBetween(String value1, String value2) {
            addCriterion("GITPWD not between", value1, value2, "gitpwd");
            return (Criteria) this;
        }

        public Criteria andCaseurlIsNull() {
            addCriterion("CASEURL is null");
            return (Criteria) this;
        }

        public Criteria andCaseurlIsNotNull() {
            addCriterion("CASEURL is not null");
            return (Criteria) this;
        }

        public Criteria andCaseurlEqualTo(String value) {
            addCriterion("CASEURL =", value, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlNotEqualTo(String value) {
            addCriterion("CASEURL <>", value, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlGreaterThan(String value) {
            addCriterion("CASEURL >", value, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlGreaterThanOrEqualTo(String value) {
            addCriterion("CASEURL >=", value, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlLessThan(String value) {
            addCriterion("CASEURL <", value, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlLessThanOrEqualTo(String value) {
            addCriterion("CASEURL <=", value, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlLike(String value) {
            addCriterion("CASEURL like", value, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlNotLike(String value) {
            addCriterion("CASEURL not like", value, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlIn(List<String> values) {
            addCriterion("CASEURL in", values, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlNotIn(List<String> values) {
            addCriterion("CASEURL not in", values, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlBetween(String value1, String value2) {
            addCriterion("CASEURL between", value1, value2, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseurlNotBetween(String value1, String value2) {
            addCriterion("CASEURL not between", value1, value2, "caseurl");
            return (Criteria) this;
        }

        public Criteria andCaseusernameIsNull() {
            addCriterion("CASEUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCaseusernameIsNotNull() {
            addCriterion("CASEUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCaseusernameEqualTo(String value) {
            addCriterion("CASEUSERNAME =", value, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameNotEqualTo(String value) {
            addCriterion("CASEUSERNAME <>", value, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameGreaterThan(String value) {
            addCriterion("CASEUSERNAME >", value, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameGreaterThanOrEqualTo(String value) {
            addCriterion("CASEUSERNAME >=", value, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameLessThan(String value) {
            addCriterion("CASEUSERNAME <", value, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameLessThanOrEqualTo(String value) {
            addCriterion("CASEUSERNAME <=", value, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameLike(String value) {
            addCriterion("CASEUSERNAME like", value, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameNotLike(String value) {
            addCriterion("CASEUSERNAME not like", value, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameIn(List<String> values) {
            addCriterion("CASEUSERNAME in", values, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameNotIn(List<String> values) {
            addCriterion("CASEUSERNAME not in", values, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameBetween(String value1, String value2) {
            addCriterion("CASEUSERNAME between", value1, value2, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCaseusernameNotBetween(String value1, String value2) {
            addCriterion("CASEUSERNAME not between", value1, value2, "caseusername");
            return (Criteria) this;
        }

        public Criteria andCasepwdIsNull() {
            addCriterion("CASEPWD is null");
            return (Criteria) this;
        }

        public Criteria andCasepwdIsNotNull() {
            addCriterion("CASEPWD is not null");
            return (Criteria) this;
        }

        public Criteria andCasepwdEqualTo(String value) {
            addCriterion("CASEPWD =", value, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdNotEqualTo(String value) {
            addCriterion("CASEPWD <>", value, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdGreaterThan(String value) {
            addCriterion("CASEPWD >", value, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdGreaterThanOrEqualTo(String value) {
            addCriterion("CASEPWD >=", value, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdLessThan(String value) {
            addCriterion("CASEPWD <", value, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdLessThanOrEqualTo(String value) {
            addCriterion("CASEPWD <=", value, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdLike(String value) {
            addCriterion("CASEPWD like", value, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdNotLike(String value) {
            addCriterion("CASEPWD not like", value, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdIn(List<String> values) {
            addCriterion("CASEPWD in", values, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdNotIn(List<String> values) {
            addCriterion("CASEPWD not in", values, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdBetween(String value1, String value2) {
            addCriterion("CASEPWD between", value1, value2, "casepwd");
            return (Criteria) this;
        }

        public Criteria andCasepwdNotBetween(String value1, String value2) {
            addCriterion("CASEPWD not between", value1, value2, "casepwd");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNull() {
            addCriterion("FREEZE is null");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNotNull() {
            addCriterion("FREEZE is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeEqualTo(String value) {
            addCriterion("FREEZE =", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotEqualTo(String value) {
            addCriterion("FREEZE <>", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThan(String value) {
            addCriterion("FREEZE >", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThanOrEqualTo(String value) {
            addCriterion("FREEZE >=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThan(String value) {
            addCriterion("FREEZE <", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThanOrEqualTo(String value) {
            addCriterion("FREEZE <=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLike(String value) {
            addCriterion("FREEZE like", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotLike(String value) {
            addCriterion("FREEZE not like", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeIn(List<String> values) {
            addCriterion("FREEZE in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotIn(List<String> values) {
            addCriterion("FREEZE not in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeBetween(String value1, String value2) {
            addCriterion("FREEZE between", value1, value2, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotBetween(String value1, String value2) {
            addCriterion("FREEZE not between", value1, value2, "freeze");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailstateIsNull() {
            addCriterion("EMAILSTATE is null");
            return (Criteria) this;
        }

        public Criteria andEmailstateIsNotNull() {
            addCriterion("EMAILSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmailstateEqualTo(String value) {
            addCriterion("EMAILSTATE =", value, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateNotEqualTo(String value) {
            addCriterion("EMAILSTATE <>", value, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateGreaterThan(String value) {
            addCriterion("EMAILSTATE >", value, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateGreaterThanOrEqualTo(String value) {
            addCriterion("EMAILSTATE >=", value, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateLessThan(String value) {
            addCriterion("EMAILSTATE <", value, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateLessThanOrEqualTo(String value) {
            addCriterion("EMAILSTATE <=", value, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateLike(String value) {
            addCriterion("EMAILSTATE like", value, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateNotLike(String value) {
            addCriterion("EMAILSTATE not like", value, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateIn(List<String> values) {
            addCriterion("EMAILSTATE in", values, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateNotIn(List<String> values) {
            addCriterion("EMAILSTATE not in", values, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateBetween(String value1, String value2) {
            addCriterion("EMAILSTATE between", value1, value2, "emailstate");
            return (Criteria) this;
        }

        public Criteria andEmailstateNotBetween(String value1, String value2) {
            addCriterion("EMAILSTATE not between", value1, value2, "emailstate");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("REGISTERTIME is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("REGISTERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(String value) {
            addCriterion("REGISTERTIME =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(String value) {
            addCriterion("REGISTERTIME <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(String value) {
            addCriterion("REGISTERTIME >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERTIME >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(String value) {
            addCriterion("REGISTERTIME <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(String value) {
            addCriterion("REGISTERTIME <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLike(String value) {
            addCriterion("REGISTERTIME like", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotLike(String value) {
            addCriterion("REGISTERTIME not like", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<String> values) {
            addCriterion("REGISTERTIME in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<String> values) {
            addCriterion("REGISTERTIME not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(String value1, String value2) {
            addCriterion("REGISTERTIME between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(String value1, String value2) {
            addCriterion("REGISTERTIME not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackIsNull() {
            addCriterion("OWNER_PHOTO_BACK is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackIsNotNull() {
            addCriterion("OWNER_PHOTO_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackEqualTo(String value) {
            addCriterion("OWNER_PHOTO_BACK =", value, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackNotEqualTo(String value) {
            addCriterion("OWNER_PHOTO_BACK <>", value, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackGreaterThan(String value) {
            addCriterion("OWNER_PHOTO_BACK >", value, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_PHOTO_BACK >=", value, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackLessThan(String value) {
            addCriterion("OWNER_PHOTO_BACK <", value, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackLessThanOrEqualTo(String value) {
            addCriterion("OWNER_PHOTO_BACK <=", value, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackLike(String value) {
            addCriterion("OWNER_PHOTO_BACK like", value, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackNotLike(String value) {
            addCriterion("OWNER_PHOTO_BACK not like", value, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackIn(List<String> values) {
            addCriterion("OWNER_PHOTO_BACK in", values, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackNotIn(List<String> values) {
            addCriterion("OWNER_PHOTO_BACK not in", values, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackBetween(String value1, String value2) {
            addCriterion("OWNER_PHOTO_BACK between", value1, value2, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoBackNotBetween(String value1, String value2) {
            addCriterion("OWNER_PHOTO_BACK not between", value1, value2, "ownerPhotoBack");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontIsNull() {
            addCriterion("OWNER_PHOTO_FRONT is null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontIsNotNull() {
            addCriterion("OWNER_PHOTO_FRONT is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontEqualTo(String value) {
            addCriterion("OWNER_PHOTO_FRONT =", value, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontNotEqualTo(String value) {
            addCriterion("OWNER_PHOTO_FRONT <>", value, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontGreaterThan(String value) {
            addCriterion("OWNER_PHOTO_FRONT >", value, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_PHOTO_FRONT >=", value, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontLessThan(String value) {
            addCriterion("OWNER_PHOTO_FRONT <", value, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontLessThanOrEqualTo(String value) {
            addCriterion("OWNER_PHOTO_FRONT <=", value, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontLike(String value) {
            addCriterion("OWNER_PHOTO_FRONT like", value, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontNotLike(String value) {
            addCriterion("OWNER_PHOTO_FRONT not like", value, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontIn(List<String> values) {
            addCriterion("OWNER_PHOTO_FRONT in", values, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontNotIn(List<String> values) {
            addCriterion("OWNER_PHOTO_FRONT not in", values, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontBetween(String value1, String value2) {
            addCriterion("OWNER_PHOTO_FRONT between", value1, value2, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andOwnerPhotoFrontNotBetween(String value1, String value2) {
            addCriterion("OWNER_PHOTO_FRONT not between", value1, value2, "ownerPhotoFront");
            return (Criteria) this;
        }

        public Criteria andEntrustBookIsNull() {
            addCriterion("ENTRUST_BOOK is null");
            return (Criteria) this;
        }

        public Criteria andEntrustBookIsNotNull() {
            addCriterion("ENTRUST_BOOK is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustBookEqualTo(String value) {
            addCriterion("ENTRUST_BOOK =", value, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookNotEqualTo(String value) {
            addCriterion("ENTRUST_BOOK <>", value, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookGreaterThan(String value) {
            addCriterion("ENTRUST_BOOK >", value, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRUST_BOOK >=", value, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookLessThan(String value) {
            addCriterion("ENTRUST_BOOK <", value, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookLessThanOrEqualTo(String value) {
            addCriterion("ENTRUST_BOOK <=", value, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookLike(String value) {
            addCriterion("ENTRUST_BOOK like", value, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookNotLike(String value) {
            addCriterion("ENTRUST_BOOK not like", value, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookIn(List<String> values) {
            addCriterion("ENTRUST_BOOK in", values, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookNotIn(List<String> values) {
            addCriterion("ENTRUST_BOOK not in", values, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookBetween(String value1, String value2) {
            addCriterion("ENTRUST_BOOK between", value1, value2, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andEntrustBookNotBetween(String value1, String value2) {
            addCriterion("ENTRUST_BOOK not between", value1, value2, "entrustBook");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontIsNull() {
            addCriterion("AGENT_PHOTO_FRONT is null");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontIsNotNull() {
            addCriterion("AGENT_PHOTO_FRONT is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontEqualTo(String value) {
            addCriterion("AGENT_PHOTO_FRONT =", value, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontNotEqualTo(String value) {
            addCriterion("AGENT_PHOTO_FRONT <>", value, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontGreaterThan(String value) {
            addCriterion("AGENT_PHOTO_FRONT >", value, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_PHOTO_FRONT >=", value, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontLessThan(String value) {
            addCriterion("AGENT_PHOTO_FRONT <", value, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontLessThanOrEqualTo(String value) {
            addCriterion("AGENT_PHOTO_FRONT <=", value, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontLike(String value) {
            addCriterion("AGENT_PHOTO_FRONT like", value, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontNotLike(String value) {
            addCriterion("AGENT_PHOTO_FRONT not like", value, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontIn(List<String> values) {
            addCriterion("AGENT_PHOTO_FRONT in", values, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontNotIn(List<String> values) {
            addCriterion("AGENT_PHOTO_FRONT not in", values, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontBetween(String value1, String value2) {
            addCriterion("AGENT_PHOTO_FRONT between", value1, value2, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoFrontNotBetween(String value1, String value2) {
            addCriterion("AGENT_PHOTO_FRONT not between", value1, value2, "agentPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackIsNull() {
            addCriterion("AGENT_PHOTO_BACK is null");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackIsNotNull() {
            addCriterion("AGENT_PHOTO_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackEqualTo(String value) {
            addCriterion("AGENT_PHOTO_BACK =", value, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackNotEqualTo(String value) {
            addCriterion("AGENT_PHOTO_BACK <>", value, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackGreaterThan(String value) {
            addCriterion("AGENT_PHOTO_BACK >", value, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_PHOTO_BACK >=", value, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackLessThan(String value) {
            addCriterion("AGENT_PHOTO_BACK <", value, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackLessThanOrEqualTo(String value) {
            addCriterion("AGENT_PHOTO_BACK <=", value, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackLike(String value) {
            addCriterion("AGENT_PHOTO_BACK like", value, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackNotLike(String value) {
            addCriterion("AGENT_PHOTO_BACK not like", value, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackIn(List<String> values) {
            addCriterion("AGENT_PHOTO_BACK in", values, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackNotIn(List<String> values) {
            addCriterion("AGENT_PHOTO_BACK not in", values, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackBetween(String value1, String value2) {
            addCriterion("AGENT_PHOTO_BACK between", value1, value2, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentPhotoBackNotBetween(String value1, String value2) {
            addCriterion("AGENT_PHOTO_BACK not between", value1, value2, "agentPhotoBack");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoIsNull() {
            addCriterion("BUSINESS_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoIsNotNull() {
            addCriterion("BUSINESS_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoEqualTo(String value) {
            addCriterion("BUSINESS_PHOTO =", value, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoNotEqualTo(String value) {
            addCriterion("BUSINESS_PHOTO <>", value, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoGreaterThan(String value) {
            addCriterion("BUSINESS_PHOTO >", value, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PHOTO >=", value, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoLessThan(String value) {
            addCriterion("BUSINESS_PHOTO <", value, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PHOTO <=", value, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoLike(String value) {
            addCriterion("BUSINESS_PHOTO like", value, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoNotLike(String value) {
            addCriterion("BUSINESS_PHOTO not like", value, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoIn(List<String> values) {
            addCriterion("BUSINESS_PHOTO in", values, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoNotIn(List<String> values) {
            addCriterion("BUSINESS_PHOTO not in", values, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoBetween(String value1, String value2) {
            addCriterion("BUSINESS_PHOTO between", value1, value2, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andBusinessPhotoNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_PHOTO not between", value1, value2, "businessPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoIsNull() {
            addCriterion("ORG_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoIsNotNull() {
            addCriterion("ORG_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoEqualTo(String value) {
            addCriterion("ORG_PHOTO =", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoNotEqualTo(String value) {
            addCriterion("ORG_PHOTO <>", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoGreaterThan(String value) {
            addCriterion("ORG_PHOTO >", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_PHOTO >=", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoLessThan(String value) {
            addCriterion("ORG_PHOTO <", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoLessThanOrEqualTo(String value) {
            addCriterion("ORG_PHOTO <=", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoLike(String value) {
            addCriterion("ORG_PHOTO like", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoNotLike(String value) {
            addCriterion("ORG_PHOTO not like", value, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoIn(List<String> values) {
            addCriterion("ORG_PHOTO in", values, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoNotIn(List<String> values) {
            addCriterion("ORG_PHOTO not in", values, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoBetween(String value1, String value2) {
            addCriterion("ORG_PHOTO between", value1, value2, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andOrgPhotoNotBetween(String value1, String value2) {
            addCriterion("ORG_PHOTO not between", value1, value2, "orgPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoIsNull() {
            addCriterion("TAX_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoIsNotNull() {
            addCriterion("TAX_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoEqualTo(String value) {
            addCriterion("TAX_PHOTO =", value, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoNotEqualTo(String value) {
            addCriterion("TAX_PHOTO <>", value, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoGreaterThan(String value) {
            addCriterion("TAX_PHOTO >", value, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_PHOTO >=", value, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoLessThan(String value) {
            addCriterion("TAX_PHOTO <", value, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoLessThanOrEqualTo(String value) {
            addCriterion("TAX_PHOTO <=", value, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoLike(String value) {
            addCriterion("TAX_PHOTO like", value, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoNotLike(String value) {
            addCriterion("TAX_PHOTO not like", value, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoIn(List<String> values) {
            addCriterion("TAX_PHOTO in", values, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoNotIn(List<String> values) {
            addCriterion("TAX_PHOTO not in", values, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoBetween(String value1, String value2) {
            addCriterion("TAX_PHOTO between", value1, value2, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andTaxPhotoNotBetween(String value1, String value2) {
            addCriterion("TAX_PHOTO not between", value1, value2, "taxPhoto");
            return (Criteria) this;
        }

        public Criteria andValidatecodeIsNull() {
            addCriterion("VALIDATECODE is null");
            return (Criteria) this;
        }

        public Criteria andValidatecodeIsNotNull() {
            addCriterion("VALIDATECODE is not null");
            return (Criteria) this;
        }

        public Criteria andValidatecodeEqualTo(String value) {
            addCriterion("VALIDATECODE =", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeNotEqualTo(String value) {
            addCriterion("VALIDATECODE <>", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeGreaterThan(String value) {
            addCriterion("VALIDATECODE >", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDATECODE >=", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeLessThan(String value) {
            addCriterion("VALIDATECODE <", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeLessThanOrEqualTo(String value) {
            addCriterion("VALIDATECODE <=", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeLike(String value) {
            addCriterion("VALIDATECODE like", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeNotLike(String value) {
            addCriterion("VALIDATECODE not like", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeIn(List<String> values) {
            addCriterion("VALIDATECODE in", values, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeNotIn(List<String> values) {
            addCriterion("VALIDATECODE not in", values, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeBetween(String value1, String value2) {
            addCriterion("VALIDATECODE between", value1, value2, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeNotBetween(String value1, String value2) {
            addCriterion("VALIDATECODE not between", value1, value2, "validatecode");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNull() {
            addCriterion("REQUESTID is null");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNotNull() {
            addCriterion("REQUESTID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestidEqualTo(String value) {
            addCriterion("REQUESTID =", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotEqualTo(String value) {
            addCriterion("REQUESTID <>", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThan(String value) {
            addCriterion("REQUESTID >", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThanOrEqualTo(String value) {
            addCriterion("REQUESTID >=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThan(String value) {
            addCriterion("REQUESTID <", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThanOrEqualTo(String value) {
            addCriterion("REQUESTID <=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLike(String value) {
            addCriterion("REQUESTID like", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotLike(String value) {
            addCriterion("REQUESTID not like", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidIn(List<String> values) {
            addCriterion("REQUESTID in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotIn(List<String> values) {
            addCriterion("REQUESTID not in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidBetween(String value1, String value2) {
            addCriterion("REQUESTID between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotBetween(String value1, String value2) {
            addCriterion("REQUESTID not between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andImgstateIsNull() {
            addCriterion("IMGSTATE is null");
            return (Criteria) this;
        }

        public Criteria andImgstateIsNotNull() {
            addCriterion("IMGSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andImgstateEqualTo(String value) {
            addCriterion("IMGSTATE =", value, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateNotEqualTo(String value) {
            addCriterion("IMGSTATE <>", value, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateGreaterThan(String value) {
            addCriterion("IMGSTATE >", value, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateGreaterThanOrEqualTo(String value) {
            addCriterion("IMGSTATE >=", value, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateLessThan(String value) {
            addCriterion("IMGSTATE <", value, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateLessThanOrEqualTo(String value) {
            addCriterion("IMGSTATE <=", value, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateLike(String value) {
            addCriterion("IMGSTATE like", value, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateNotLike(String value) {
            addCriterion("IMGSTATE not like", value, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateIn(List<String> values) {
            addCriterion("IMGSTATE in", values, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateNotIn(List<String> values) {
            addCriterion("IMGSTATE not in", values, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateBetween(String value1, String value2) {
            addCriterion("IMGSTATE between", value1, value2, "imgstate");
            return (Criteria) this;
        }

        public Criteria andImgstateNotBetween(String value1, String value2) {
            addCriterion("IMGSTATE not between", value1, value2, "imgstate");
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