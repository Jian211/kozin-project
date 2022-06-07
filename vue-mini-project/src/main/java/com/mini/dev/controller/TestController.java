package com.mini.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//	@GetMapping("/")
//	public String test() {
//		System.out.println(" 메인 컨트롤러 테스트");
//		return "helloWorld";
//	}


	@GetMapping("/detail")
	public String detail() {
		System.out.println("detail 컨트롤러 테스트");
		return " detail입니다.";
	}
	
}
