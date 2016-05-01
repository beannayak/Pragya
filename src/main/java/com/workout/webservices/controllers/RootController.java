package com.workout.webservices.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.workout.webservices.domain.ReportForm;
import com.workout.webservices.domain.ReportFormTO;
import com.workout.webservices.services.AddReportFormService;

@RequestMapping("/")
@Controller
public class RootController {
	
	@Autowired
	private AddReportFormService addReportFormService;
	
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
	public String reportControllerPost(@ModelAttribute @Valid ReportFormTO reportFormTO, BindingResult result){
		if (result.hasErrors()) {
			return "report";
		}
		
		addReportFormService.addReportForm(reportFormTO);
		
		return "redirect:/report";
	}
}
