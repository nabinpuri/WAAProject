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
	// private User userId;// join column,, foreign key
	private Department departmentId;// foreign key
	private Post postId;// foreign key
	private Address addressId;// foreign
	private Phone phoneId;
	private Employee supervisedById;
	private Date DateOfBirth;
	private Date JoinedDate;
	private Date ContactDate;
	private boolean inActive;
	private Date createdDate;
	private Employee createdBy;// id from users
	private Date modifyDate;

	private Employee modifyBy;// user id from user table

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

	public Phone getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Phone phoneId) {
		this.phoneId = phoneId;
	}

	public Employee getSupervisedById() {
		return supervisedById;
	}

	public void setSupervisedById(Employee supervisedById) {
		this.supervisedById = supervisedById;
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

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Department getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Department departmentId) {
		this.departmentId = departmentId;
	}

	public Post getPostId() {
		return postId;
	}

	public void setPostId(Post postId) {
		this.postId = postId;
	}

	public Address getAddressId() {
		return addressId;
	}

	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}

	public Employee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}

	public Employee getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(Employee modifyBy) {
		this.modifyBy = modifyBy;
	}
}
