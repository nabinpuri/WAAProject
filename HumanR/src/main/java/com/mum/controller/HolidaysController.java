/**
 * 
 */
package com.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.domain.Holidays;
import com.mum.services.HolidaysService;

/**
 * @author ashok
 *
 */
@Controller
public class HolidaysController {
	@Autowired
	HolidaysService holidaysService;

	@RequestMapping(value = "/holidays", method = RequestMethod.GET)
	public String addHoliday(@ModelAttribute("holidays") Holidays holidays) {
		return "holidays";
	}

	@RequestMapping(value = "/holidays", method = RequestMethod.POST)
	public String saveHoliday(@ModelAttribute("holidays") Holidays holidays) {
		holidaysService.save(holidays);
		return "holidays";
	}
}
