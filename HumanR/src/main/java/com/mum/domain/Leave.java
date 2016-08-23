package com.mum.domain;

import java.util.Date;

public class Leave {
  long leaveid;
  Date appliedDate;
  Date leaveFromDate;
  Date leaveToDate;
  String description;
  //replace by employye 
  int approvedBy;
  boolean isApproved;
  //employye
  int applicant;
  
public long getLeaveid() {
	return leaveid;
}
public void setLeaveid(long leaveid) {
	this.leaveid = leaveid;
}
public Date getAppliedDate() {
	return appliedDate;
}
public void setAppliedDate(Date appliedDate) {
	this.appliedDate = appliedDate;
}
public Date getLeaveFromDate() {
	return leaveFromDate;
}
public void setLeaveFromDate(Date leaveFromDate) {
	this.leaveFromDate = leaveFromDate;
}
public Date getLeaveToDate() {
	return leaveToDate;
}
public void setLeaveToDate(Date leaveToDate) {
	this.leaveToDate = leaveToDate;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public boolean isApproved() {
	return isApproved;
}
public void setApproved(boolean isApproved) {
	this.isApproved = isApproved;
}
}
