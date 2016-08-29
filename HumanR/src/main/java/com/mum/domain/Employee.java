/**
 * 
 */
package com.mum.domain;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.Valid;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Nabin
 *
 */
@Entity(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long employeeId;
	@NotEmpty (message="cannot be empty")
	private String firstName;
	@NotEmpty (message="cannot be empty")
	private String lastName;
	@NotEmpty (message="cannot be empty")
	private long SSN;
	
	@NotNull(message="cannot be null")
	@Valid
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="departmentId")
	private Department department;// foreign key
	
	@NotNull(message="cannot be null")
	@Valid
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="postId")
	private Post post;// foreign key
	
	@NotNull(message="cannot be null")
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;// foreign
	
	@Valid
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="phoneId")
	private Phone phone;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="supervisedbyID")
	private Employee supervisedBy;
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="createdBy")
	private User createdBy;// id from users
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="modifyby")
	private User modifyBy;// user id from user table
	
	@Past
	@NotNull
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date DateOfBirth;
	@NotNull
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date JoinedDate;
	
	
	@NotNull
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date ContractDate;
	
	private boolean inActive;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date createdDate;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date modifyDate;

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public User getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(User modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Employee getSupervisedBy() {
		return supervisedBy;
	}

	public void setSupervisedBy(Employee supervisedBy) {
		this.supervisedBy = supervisedBy;
	}
	
	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
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
		return ContractDate;
	}

	public void setContactDate(Date contactDate) {
		ContractDate = contactDate;
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

	public Date getContractDate() {
		return ContractDate;
	}

	public void setContractDate(Date contractDate) {
		ContractDate = contractDate;
	}
}
