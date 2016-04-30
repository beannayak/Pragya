package com.workout.webservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.workout.webservices.domain.ReportForm;

@RequestMapping("/")
@Controller
public class RootController {
	
	@RequestMapping("/")
	public String rootController(){
		return "index";
	}
	
	@RequestMapping(value="/report", method=RequestMethod.GET)
	public String reportController(Model model){
		model.addAttribute("reportModel", new ReportForm());
		
		return "report";
	}
	
	@RequestMapping(value="/report", method=RequestMethod.POST)
	public String reportControllerPost(@ModelAttribute ReportForm reportForm){
		System.out.println("reportform: " + reportForm.getPicture().getName());
		
		return "redirect:/report";
	}
}
