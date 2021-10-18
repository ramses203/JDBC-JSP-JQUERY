package kr.co.kosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	@RequestMapping("/")
	public String defaultUrl() {
		return "main/main";
	}
	
	@RequestMapping("/home")
	public String homeUrl() {
		return "main/main";
	}
}
