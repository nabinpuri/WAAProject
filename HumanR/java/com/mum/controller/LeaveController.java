/**
 * 
 */
package com.mum.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mum.domain.Leave;
import com.mum.services.HolidaysService;
import com.mum.services.LeaveService;

/**
 * @author ashok
 *
 */
@Controller
public class LeaveController {
	@Autowired
	LeaveService leaveService;
	@Autowired
	HolidaysService holidaysService;

	@RequestMapping(value = "/leave", method = RequestMethod.GET)
	public String applyLeave(@ModelAttribute("leave") Leave leave, Model model) {
		model.addAttribute("holidaysList", holidaysService.getAll());
		return "leaveForm";
	}

	@RequestMapping(value = "/leave", method = RequestMethod.POST)
	public String saveLeave(@Valid @ModelAttribute("leave") Leave leave, BindingResult result,
			RedirectAttributes redirectAtribute) {
		if (result.hasErrors()) {
			System.out.println("this is error");
			return "leaveForm";
		}
		leaveService.save(leave);
		return "redirect:leaveList";
	}

	@RequestMapping(value = "/leaveList", method = RequestMethod.GET)
	public String leaveList(@ModelAttribute("leave") Leave leave, Model model) {
		model.addAttribute("leaveList", leaveService.getAll());
		return "leaveList";
	}

}
