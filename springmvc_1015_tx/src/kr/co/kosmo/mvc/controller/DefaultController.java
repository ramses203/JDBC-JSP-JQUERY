package kr.co.kosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	
	@RequestMapping("/")
	public String defaultUrl() {
		return "index";
	}
	
	@RequestMapping("/index")
	public String indextUrl() {
		return "index";
	}
	
}
