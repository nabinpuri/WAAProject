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
//	@Autowired
//	LeaveService leaveService;

	@RequestMapping(value = "/leave", method = RequestMethod.GET)
	public String applyLeave(@ModelAttribute("leave") Leave leave) {
		return "leaveForm";
	}

	@RequestMapping(value = "/leave", method = RequestMethod.POST)
	public String saveLeave(@ModelAttribute("leave") Leave leave) {
//		leaveService.save(leave);
//		return "redirect:/leaveForm";
		return "asd";
	}

}
