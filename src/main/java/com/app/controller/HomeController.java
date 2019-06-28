package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/all")
	public String showAll() {
		return "AllPage";
	}
	
	@RequestMapping("/admin")
	public String showAdmin() {
		return "AdminPage";
	}
	
	@RequestMapping("/emp")
	public String showEmp() {
		return "EmployeePage";
	}
	
	@RequestMapping("/common")
	public String showCommon() {
		return "CommonPage";
	}
	
	@RequestMapping("/denied")
	public String showDenied() {
		return "DeniedPage";
	}
}
