package lol.mvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lol.mvc.dao.MyfriendInter;

@Controller
public class MultiSearchController {

	@RequestMapping("/multisearchform")
	public String multisearchForm(HttpSession session) {
	
		return "main/multisearchform";
	}
	
}
