/**
 * 
 */
package com.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ashok
 *
 */
@Controller
public class Attendance {
	@RequestMapping(value = "/attendance", method = RequestMethod.GET)
	public String getAttendance(@ModelAttribute("attendance") Attendance attendance) {
		return "attendance";
	}

	@RequestMapping(value = "/attendance", method = RequestMethod.POST)
	public String saveHoliday(@ModelAttribute("attendance") Attendance attendance) {
		return "attendance";
	}
}
