package com.mum.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.mum.domain.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping({"/", "/List"})
	public String showemployeeList(Model model) {
		return "employeeList";
	}
	
	@RequestMapping(value="/addewEmployee" ,method = RequestMethod.GET)
	public String addNewEmployee( @ModelAttribute("newEmployee") Employee employee, Model model) {
		return "newEmployeeForm";
	}
	
	@RequestMapping(value="/addewEmployee" ,method = RequestMethod.POST)
	public String saveNewEmployee(@Valid @ModelAttribute("newEmployee") Employee employee,BindingResult bindingResult,
			RedirectAttributes redirectAttribute,Model model) {
		if(bindingResult.hasErrors()){
			return "newEmployeeForm";
		}
		
		return "redirect:/list";
	}
}
