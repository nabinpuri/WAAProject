package com.mum.domain;
import java.util.Date;

public class Holidays {
	long holidayId;
	Date holidayDate;
	String reason;
	public long getHolidayId() {
		return holidayId;
	}
	public void setHolidayId(long holidayId) {
		this.holidayId = holidayId;
	}
	public Date getHolidayDate() {
		return holidayDate;
	}
	public void setHolidayDate(Date holidayDate) {
		this.holidayDate = holidayDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
