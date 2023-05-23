package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public @ResponseBody String test()
	{
		return "hello";
		
	}
	

	@GetMapping("/testing")
	public @ResponseBody String testing()
	{
		
		
		
		return "hellosdnshg";
		
	}

}
