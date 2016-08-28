package com.mum.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Leave {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long leaveid;
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/YY")
	Date appliedDate;
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/YY")
	Date leaveFromDate;
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/YY")
	Date leaveToDate;
	@NotEmpty
	@Size(min=3, max = 500, message="description is short")
	String description;
	// replace by employye
	@OneToOne(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name ="approvedById")
	Employee approvedBy;

	public Employee getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(Employee approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Employee getApplicant() {
		return applicant;
	}

	public void setApplicant(Employee applicant) {
		this.applicant = applicant;
	}

	boolean isApproved;
	// employye
	Employee applicant;

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
