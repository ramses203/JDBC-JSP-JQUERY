package kr.co.kosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	
	
	@GetMapping("/loginForm")
	public String loginFrom() {
		return "login/loginForm";
	}
	
}
