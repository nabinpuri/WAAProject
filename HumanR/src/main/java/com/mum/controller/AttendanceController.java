/**
 * 
 */
package com.mum.controller;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mum.domain.Attendance;
import com.mum.services.AttendenceService;

/**
 * @author ashok
 *
 */
@Controller
public class AttendanceController {
	@Autowired
	AttendenceService attendenceService;
	
	Attendance attendance = new Attendance();

	@RequestMapping(value = "/attendance", method = RequestMethod.GET)
	public String getAttendance(@ModelAttribute("attendance") AttendanceController attendance) {
		return "attendance";
	}

	@RequestMapping(value = "/attendance", method = RequestMethod.POST)
	public String saveHoliday(@Valid @ModelAttribute("attendance") AttendanceController attendance,
			BindingResult result, RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return "attendance";
		}
		return "attendance";
	}

	@RequestMapping(value = "/checkin", method = RequestMethod.GET)
	public @ResponseBody AttendanceController saveAttendance(@RequestParam("id") Long employeeId) {
		System.out.println("this is controller" + employeeId);
		// Attendance attendance =
		// attendenceService.getOneByPRimaryId(employeeId);
		Date date = new Date();
		attendance.setCheckinTime(new Timestamp(date.getTime()));
		attendance.setDate(date);
//		User user = 
//		attendance.setUserId(employeeId);

		attendenceService.save(attendance);
		return null;
	}
}
