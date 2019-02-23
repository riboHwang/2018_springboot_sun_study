package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.testDTO;

@Controller
public class HelloController {
	@RequestMapping("/test1")
	public String test1(Model model) {
		testDTO dto = new testDTO();
		dto.setNickname("ribo");
		dto.setHobby("soccer");
		model.addAttribute("myData", dto);
		return "test";
	}
	
	@RequestMapping("/test2")
	public String test2(Model model) {
		testDTO dto = new testDTO();
		dto.setNickname("ribo");
		dto.setHobby("soccer");
		model.addAttribute("myData", dto);
		return "test2";
	}
}