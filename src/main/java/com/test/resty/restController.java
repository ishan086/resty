package com.test.resty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
	@GetMapping("/rest")
		public String testresty ()
		{
		return "hellow world";
		}
	
		
	

}
