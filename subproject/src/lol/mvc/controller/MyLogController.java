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

import lol.mvc.dao.LoggingInter;
import lol.mvc.dao.LoginInter;
import lol.mvc.dao.MyPageInter;
import lol.mvc.dto.MyLoginLoggerDTO;

@Controller
public class MyLogController {

	@Autowired
	private LoggingInter loggingInter;
	
	@RequestMapping("loggingform")
	public String loggingForm(HttpSession session, Model m) {
		
		List<MyLoginLoggerDTO> volist =loggingInter.logging((String)session.getAttribute("sessionID"));
		m.addAttribute("volist", volist);
		return "main/loggingform";
	}
}

