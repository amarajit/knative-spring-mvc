package com.knative.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author rajkumarj
 *
 */
@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("bookStore")
	public String getHomePage(){
		return "BookStore";
	}
	
}
