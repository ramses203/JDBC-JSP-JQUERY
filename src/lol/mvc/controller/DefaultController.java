package lol.mvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lol.mvc.dao.LoginInter;
import lol.mvc.dao.MyPageInter;

@Controller
public class DefaultController {
	@GetMapping("/")
	public String defaulturl() {
		return "landing";
	}
	@RequestMapping("landing")
	public String defaulturlmain() {
		return "landing";
	}
	@RequestMapping("index")
	public String defaultIndex() {
		return "landing";
	}
}

