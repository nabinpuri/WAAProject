package HRMclasse;

import java.sql.Time;
import java.util.Date;

public class Attendance {
  long attendanceId;
  Date date;
  Time checkinTime;
  Time checkoutTime;
  //employee
  int employeeid;
  
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
