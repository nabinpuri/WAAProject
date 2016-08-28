/**
 * 
 */
package com.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.domain.Leave;

/**
 * @author ashok
 *
 */
@Controller
public class LeaveController {
	@RequestMapping(value = "/applyLeave", method = RequestMethod.GET)
	public String applyLeave(@ModelAttribute("leave") Leave leave) {
		return "leaveForm";
	}

}
