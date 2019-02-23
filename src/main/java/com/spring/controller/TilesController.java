package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
	
	@RequestMapping("/body1")
	public String body1(){
		
		return "body1";
	}
	
	@RequestMapping("/body2")
	public String body2(){
		
		return "body2";
	}
}
