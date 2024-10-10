package com.tech.prjm09.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController {

//	
//	@Autowired
//	private IDao iDao;
//	
	
	@RequestMapping("/")
	public String index(HttpServletRequest request,Model model) {
		System.out.println("index() ctr");

		return "index";
	}
	
}
