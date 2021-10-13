package kr.co.kosmo.mvc.controller.member;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.dao.MemberDaoInter;
import kr.co.kosmo.mvc.dto.Member2DTO;

@Controller
public class LoginCheckController {
	
	@Autowired
	private MemberDaoInter memberDaoInter;
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "login/loginForm";
	}
	
	@PostMapping("/loginProcess")
	public String loginProcess(HttpSession session, Member2DTO vo) {
		int res = memberDaoInter.loginCheck(vo);
		if(res > 0) {
			System.out.println("로그인 인증");
			session.setAttribute("sessionID", vo.getId());
		}else {
			System.out.println("로그인 실패");
		}
		return "redirect:/";
	}
	
	@GetMapping("/logoutProcess")
	public String logoutProcess(HttpSession session) {
		if(session != null) {
		session.removeAttribute("sessionID");
		}
		return "redirect:/";
	}
}
