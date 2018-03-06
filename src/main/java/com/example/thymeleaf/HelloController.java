package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}//Close hello method.

}//Close HelloController class.
