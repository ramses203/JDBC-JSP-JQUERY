package kr.co.kosmo.mvc.controller.member;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.dao.MemberDaoInter;
import kr.co.kosmo.mvc.dto.Member2DTO;

@Controller
public class MemberController {
		
		@Autowired
		private MemberDaoInter memberDaoInter;
	
		@RequestMapping("/index")
		public String home() {
			return "index";
		}
		
		@RequestMapping("/memberform")
		public String memForm() {
			return "member/memberForm";
		}
		
		@PostMapping("/memberIn")
			public String memberIn(Member2DTO vo){
			memberDaoInter.addMem(vo);
			return "redirect:/";
		}
		
		@RequestMapping("/idcheck")
		public String idCheck(Model m, String id) {
			System.out.println("idAjax:"+id);
			int cnt = memberDaoInter.idChk(id);
			m.addAttribute("res", cnt);
			return "member/memberIdChk";
		}
		
		@RequestMapping("/memberList")
		public String memberList(Model m) {
			List<Member2DTO> list = memberDaoInter.memberList();
			m.addAttribute("list",list);
			//m.addAttribute("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			return "member/memberList";
		}
		
		
		
	
}
