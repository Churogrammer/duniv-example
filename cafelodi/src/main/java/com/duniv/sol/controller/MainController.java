package com.duniv.sol.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duniv.sol.service.Main.MainService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {

	private final MainService mainService;
	
	@RequestMapping("/index")
	public String getIntroduction(Model model) {
		model.addAttribute("result", new String("다슬"));
		mainService.methodName();
		//testService.testPrint();
		//ListTools.isEmpty("");
		return "index";
	}
}
