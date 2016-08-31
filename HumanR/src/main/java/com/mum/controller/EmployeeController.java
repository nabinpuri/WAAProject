package com.mum.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mum.domain.Employee;
import com.mum.services.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired 
	EmployeeService employeeService;
	@RequestMapping({"", "/list"})
	public String showemployeeList(Model model) {
		System.out.println("inside employee controllers");
		List<Employee> employeeList=employeeService.getAll();
		System.out.println("joined date gates="+employeeList.get(0).getJoinedDate());
		model.addAttribute("employeeList",employeeList);
		return "employeeList";
	}
	
	@RequestMapping(value="/addNewEmployee" ,method = RequestMethod.GET)
	public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee,Model model) {
		System.out.println("inside employee controllerchange add new employee");
		return "addNewEmployee";
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
