package com.mum.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.domain.Post;
import com.mum.domain.Vacancy;
import com.mum.services.PostService;
import com.mum.services.VacancyService;

@Controller
@RequestMapping("/vacancy")
public class VacancyController {
	@Autowired
	VacancyService vacancyService;
	@Autowired
	PostService postService;
	
	@RequestMapping(value = "/addVacancy", method = RequestMethod.GET)
	public String applyLeave(@ModelAttribute("addVacancy") Vacancy vacancy,Model model) {
		model.addAttribute("posts", postService.getAll());
		
		return "vacancy";
	}
	@RequestMapping(value = "/addVacancy", method = RequestMethod.POST)
	public String saveLeave(@Valid@ModelAttribute("addVacancy") Vacancy vacancy,BindingResult result) {
		try{
			System.out.println("inside vacancy");
			Post post= new Post();
			Long postId=vacancy.getPost().getPostId();
			
			post=postService.getOneByPRimaryId(postId);
			vacancy.setPost(post);
			vacancyService.save(vacancy);
		}catch(Exception exception){
		System.out.println("user cannot be saved"+ exception);
		}
		
		return "redirect:vacancyList";
	}
	@RequestMapping(value = "/vacancyList", method = RequestMethod.GET)
	public String viewVacancyList(Model model) {
		
			model.addAttribute("vacancyList",vacancyService.getAll());
			
		
		
		return "vacancyList";
	}

}
