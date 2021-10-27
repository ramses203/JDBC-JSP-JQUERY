package lol.mvc.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lol.mvc.dao.LoginInter;
import lol.mvc.dto.MyUserVO;

@Controller
public class MyLoginController {
	@Autowired
	private LoginInter loginInter;
	
	//로그인 로직
	@GetMapping("/login")
	public String myloginform(HttpSession session) {
		String myid = (String)session.getAttribute("sessionID");
		if (myid !=null) {
			return "redirect:/mypageform";
		}else {
			return "main/loginform";
		}
	}
	@RequestMapping("/loginProcess")
	public String myloginIn(HttpSession session, MyUserVO vo) {
		int res = loginInter.loginCheckMyuser(vo);
		if(res > 0) {
			session.setAttribute("sessionID", vo.getId());
			return "redirect:/mypageform";
		}else {
			return "redirect:/login";
		}
		
	}
	@GetMapping("/logoutProcess")
	public String mylogout(HttpSession session) {
		if(session != null) {
			session.removeAttribute("sessionID");
			session.removeAttribute("TIER");
		}
		return "redirect:/";
	}
	
	//회원가입 로직
	@GetMapping("/useraddform")
	public String userForm() {
		return "main/useraddform"; 
	}
	@PostMapping("/useradd")
	public String userAddForm(MyUserVO vo) {
		loginInter.addMyuser(vo);
		return "redirect:/login";
	}
	@RequestMapping("/idcheck")
	public String idCheck(Model m,String id) {
		int res = loginInter.idChkMyuser(id);
		m.addAttribute("res", res);
		return "findprocess";
	}
	@RequestMapping("/phonecheck")
	public String phoneChk(Model m,String phone) {
		int res = loginInter.phoneCheck(phone);
		m.addAttribute("res", res);
		return "findprocess";
	}
	
	//아이디 찾기 로직
	@RequestMapping("/findidform")
	public String findIdForm(){
		return "main/findidform";
	}
	@RequestMapping("/findidprocess")
	public String findIdProcess(Model m, MyUserVO vo) {
		String res = loginInter.findId(vo);
		m.addAttribute("res", res);
		return "findprocess";
	}
	
	
	//비밀번호 찾기 로직
	@RequestMapping("/findpwform")
	public String findPwForm(){
		return "main/findpwform";
	}
	@RequestMapping("/findpwdprocess")
	public String findPwd(Model m, MyUserVO vo) {
		String res = loginInter.findPwd(vo);
		m.addAttribute("res", res);
		return "findprocess";
	}
}
