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
public class Holidays {
	@RequestMapping(value = "/holidays", method = RequestMethod.GET)
	public String addHoliday(@ModelAttribute("holidays") Holidays holidays) {
		return "holidays";
	}

	@RequestMapping(value = "/holidays", method = RequestMethod.POST)
	public String saveHoliday(@ModelAttribute("holidays") Holidays holidays) {
		return "holidays";
	}
}
