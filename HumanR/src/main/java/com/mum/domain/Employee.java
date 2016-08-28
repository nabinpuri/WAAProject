/**
 * 
 */
package com.mum.domain;

import java.util.Date;

/**
 * @author ashok
 *
 */
public class Employee {
	private long employeeId;
	private String firstName;
	private String lastName;
	private long SSN;
	private long userId;// join column,, foreign key
	private long departmentId;// foreign key
	private long postId;// foreign key
	private long addressId;//foreign
	private long phoneId;
	private long supervisedByI;
	private Date DateOfBirth;
	private Date JoinedDate;
	private Date ContactDate;
	private boolean inActive;
	private Date createdDate;
	private long createdBy;//id from users
	private Date modifyDate;
	private long modifyBy;// user id from user table
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getSSN() {
		return SSN;
	}
	public void setSSN(long sSN) {
		SSN = sSN;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		this.postId = postId;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}
	public long getSupervisedByI() {
		return supervisedByI;
	}
	public void setSupervisedByI(long supervisedByI) {
		this.supervisedByI = supervisedByI;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Date getJoinedDate() {
		return JoinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		JoinedDate = joinedDate;
	}
	public Date getContactDate() {
		return ContactDate;
	}
	public void setContactDate(Date contactDate) {
		ContactDate = contactDate;
	}
	public boolean isInActive() {
		return inActive;
	}
	public void setInActive(boolean inActive) {
		this.inActive = inActive;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public long getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Long modifyBy) {
		this.modifyBy = modifyBy;
	}
	
}
