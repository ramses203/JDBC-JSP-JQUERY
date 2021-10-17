package kr.co.kosmo.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.kosmo.mvc.dao.MemberInter;
import kr.co.kosmo.mvc.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	public MemberInter memberInter;
	
	@GetMapping("/")
	public String memIndex() {
		return "index";
	}
	
	@GetMapping("/memberform")
	public String memberAdd() {
		return "member/memberForm";
	}
	
	@PostMapping("/memberIn")
	public String memberInsert(MemberVO vo) {
		System.out.println(vo.getId());
		memberInter.addMem(vo);
		return "redirect:/";
	}
}
