package lol.mvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lol.mvc.dao.MyPageInter;

@Controller
public class UserDetailController {
	@Autowired
	private MyPageInter myPageInter;
	
	@RequestMapping("/userdetailform")
	public String friendlist(Model m, String id, String addfriend) {
		String myid = id;
		List<Map<String, String>> listChap = myPageInter.myChampList(myid);
		m.addAttribute("totalchap", listChap);

		List<Map<String, String>> listDate = myPageInter.myStatDateList(myid);
		m.addAttribute("totaldate", listDate);

		List<Map<String, String>> listtier = myPageInter.mytier(myid);
		m.addAttribute("tier", listtier);
		
		m.addAttribute("id", myid);
		m.addAttribute("addfriend",addfriend);
		
		return "main/userdetailform";
	}
}
