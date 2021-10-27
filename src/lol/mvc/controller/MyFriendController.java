package lol.mvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lol.mvc.dao.MyfriendInter;
import lol.mvc.dto.MyfriendVO;

@Controller
public class MyFriendController {
	@Autowired
	private MyfriendInter myfriendInter;

	@RequestMapping("/myfriendform")
	public String friendlist(HttpSession session, Model m) {
		String myid = (String) session.getAttribute("sessionID");
		List<Map<String, String>> list = myfriendInter.myfriend(myid);
		m.addAttribute("flist", list);
		return "main/myfriendform";
	}

	@RequestMapping("/friendreq")
	public String friendreq(MyfriendVO vo) {
		myfriendInter.friendrequest(vo);
		myfriendInter.friendresponse(vo);
		return "redirect:/friendres";
	}

	@RequestMapping("/aaaaaaaaaaaaaaaaa")
	public String friendwait(HttpSession session, Model m) {
		String myid = (String) session.getAttribute("sessionID");
		List<String> res = myfriendInter.friendwait(myid);
		String path = "/";
		for (String e : res) {
			if (e.equals("friendresponse")) {
				String nana = e;
				m.addAttribute("res", nana);
				path = "main/friend";
			} else {
			}
		}
		return path;
	}

	@RequestMapping("/reqfriend")
	public String reqfriend(MyfriendVO vo,String myid,String friendid) {
		vo.setMyid(myid);
		vo.setFriendid(friendid);
		myfriendInter.requestfriend(vo);
		myfriendInter.responsefriend(vo);
		return "redirect:/myfriendform";
	}
}
