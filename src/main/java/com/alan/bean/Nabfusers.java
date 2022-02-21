package com.alan.bean;


public class Nabfusers {

  private long id;
  private String userId;
  private String password;
  private java.sql.Timestamp initDate;
  private String email;
  private long status;
  private String salt;
  private String mobile;
  private String lastLoginIp;
  private java.sql.Timestamp lastLoginTime;
  private long loginCount;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp lastUpdPwdTime;
  private java.sql.Timestamp lastUpdPwdTime2;
  private String userName;
  private String dept;
  private String department;
  private long deptId;
  private String userType;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public java.sql.Timestamp getInitDate() {
    return initDate;
  }

  public void setInitDate(java.sql.Timestamp initDate) {
    this.initDate = initDate;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getLastLoginIp() {
    return lastLoginIp;
  }

  public void setLastLoginIp(String lastLoginIp) {
    this.lastLoginIp = lastLoginIp;
  }


  public java.sql.Timestamp getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(java.sql.Timestamp lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }


  public long getLoginCount() {
    return loginCount;
  }

  public void setLoginCount(long loginCount) {
    this.loginCount = loginCount;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getLastUpdPwdTime() {
    return lastUpdPwdTime;
  }

  public void setLastUpdPwdTime(java.sql.Timestamp lastUpdPwdTime) {
    this.lastUpdPwdTime = lastUpdPwdTime;
  }


  public java.sql.Timestamp getLastUpdPwdTime2() {
    return lastUpdPwdTime2;
  }

  public void setLastUpdPwdTime2(java.sql.Timestamp lastUpdPwdTime2) {
    this.lastUpdPwdTime2 = lastUpdPwdTime2;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }


  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public long getDeptId() {
    return deptId;
  }

  public void setDeptId(long deptId) {
    this.deptId = deptId;
  }


  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  @Override
  public String toString() {
    return "Nabfusers{" +
            "id=" + id +
            ", userId='" + userId + '\'' +
            ", password='" + password + '\'' +
            ", initDate=" + initDate +
            ", email='" + email + '\'' +
            ", status=" + status +
            ", salt='" + salt + '\'' +
            ", mobile='" + mobile + '\'' +
            ", lastLoginIp='" + lastLoginIp + '\'' +
            ", lastLoginTime=" + lastLoginTime +
            ", loginCount=" + loginCount +
            ", createTime=" + createTime +
            ", lastUpdPwdTime=" + lastUpdPwdTime +
            ", lastUpdPwdTime2=" + lastUpdPwdTime2 +
            ", userName='" + userName + '\'' +
            ", dept='" + dept + '\'' +
            ", department='" + department + '\'' +
            ", deptId=" + deptId +
            ", userType='" + userType + '\'' +
            '}';
  }
}
