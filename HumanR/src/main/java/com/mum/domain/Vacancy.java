package com.mum.domain;

import java.util.Date;

/**
 * 
 * @author NiDiNA
 *
 */

public class Vacancy {
	private long id;
	private Post post;
	private int numberOfEmployee;
	private String requirement;
	private Boolean isApproved;
	// private Employee approvedBy;
	private int numberOfFilledNumber;
	private Date createdDate;
	private User createdBy;
	private Date modifiedDate;
	private User modifiedBy;

	// generate getters and getters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public Boolean getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}

	public int getNumberOfFilledNumber() {
		return numberOfFilledNumber;
	}

	public void setNumberOfFilledNumber(int numberOfFilledNumber) {
		this.numberOfFilledNumber = numberOfFilledNumber;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public User getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
