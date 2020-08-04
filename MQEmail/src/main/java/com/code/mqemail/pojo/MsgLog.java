package com.code.mqemail.pojo;


public class MsgLog {

  private String msgId;
  private String msg;
  private String exchange;
  private String routingKey;
  private long status;
  private long tryCount;
  private java.sql.Timestamp nextTryTime;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }


  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }


  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  public String getRoutingKey() {
    return routingKey;
  }

  public void setRoutingKey(String routingKey) {
    this.routingKey = routingKey;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getTryCount() {
    return tryCount;
  }

  public void setTryCount(long tryCount) {
    this.tryCount = tryCount;
  }


  public java.sql.Timestamp getNextTryTime() {
    return nextTryTime;
  }

  public void setNextTryTime(java.sql.Timestamp nextTryTime) {
    this.nextTryTime = nextTryTime;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
