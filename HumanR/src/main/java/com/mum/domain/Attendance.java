package com.mum.domain;

import java.sql.Time;
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

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name= "attendance")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long attendanceId;
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/YY")
	Date date;
	@NotNull
	@DateTimeFormat(pattern = "hh:mm:ss")
	Time checkinTime;
	@NotNull
	@DateTimeFormat(pattern = "hh:mm:ss")
	Time checkoutTime;
	// employee
//	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "employeeId")
//	Employee employeeid;

//	public Employee getEmployeeid() {
//		return employeeid;
//	}
//
//	public void setEmployeeid(Employee employeeid) {
//		this.employeeid = employeeid;
//	}

	public long getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(long attendanceId) {
		this.attendanceId = attendanceId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getCheckinTime() {
		return checkinTime;
	}

	public void setCheckinTime(Time checkinTime) {
		this.checkinTime = checkinTime;
	}

	public Time getCheckoutTime() {
		return checkoutTime;
	}

	public void setCheckoutTime(Time checkoutTime) {
		this.checkoutTime = checkoutTime;
	}

}
