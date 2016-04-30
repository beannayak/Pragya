package com.workout.webservices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class RootController {
	
	@RequestMapping("/")
	public String rootController(){
		return "index";
	}
	
}
