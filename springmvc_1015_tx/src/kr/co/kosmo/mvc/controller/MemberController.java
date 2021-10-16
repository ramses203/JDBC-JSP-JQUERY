package kr.co.kosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

	private memberDao
	
	
	@GetMapping("/memberform")
	public String memberForm() {
		return "member/memberForm";
	}
	
	@PostMapping("/memberIn")
	public String  memberadd() {
		
		
	}
	
}
