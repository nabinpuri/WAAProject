package com.mum.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mum.domain.Department;
import com.mum.domain.Employee;
import com.mum.domain.Post;
import com.mum.services.DepartmentService;
import com.mum.services.EmployeeService;
import com.mum.services.PostService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired 
	EmployeeService employeeService;
	@Autowired 
	PostService postService;
	@Autowired 
	DepartmentService departmentService;
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
		List<Post> posts=postService.getAll();
		List<Department> departments=departmentService.getAll();
		model.addAttribute("departments", departments);
		model.addAttribute("posts", posts);
		return "addNewEmployee";
	}
	
	@RequestMapping(value="/addewEmployee" ,method = RequestMethod.POST)
	public String saveNewEmployee(@Valid @ModelAttribute("newEmployee") Employee employee,BindingResult bindingResult,
			RedirectAttributes redirectAttribute,Model model) {
		System.out.println("inside employee controller save add new employee");
		if(bindingResult.hasErrors()){
			System.out.println("inside binding result");
			System.out.println("bindingResult.getErrorCount()="+bindingResult.getErrorCount());
			  List<FieldError> errors = bindingResult.getFieldErrors();
			    for (FieldError error : errors ) {
			        System.out.println (error.getObjectName() + " - " + error.getDefaultMessage());
			    }
			    System.out.println("inside binding result out");
			return "addNewEmployee";
		}
		employeeService.save(employee);
		System.out.println("employeeService.save(employee) out");
		return "redirect:/list";
	}
}