/**
 * 
 */
package com.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mum.domain.Leave;

/**
 * @author ashok
 *
 */
@Controller
public class LeaveController {
	public String applyLeave(@ModelAttribute("leave") Leave leave) {
		return "leaveForm";
	}

}
