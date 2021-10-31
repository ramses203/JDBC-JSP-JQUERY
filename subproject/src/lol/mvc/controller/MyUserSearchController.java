package lol.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lol.mvc.dao.MyUserSearchInter;
import lol.mvc.dto.MyUserVO;
import lol.mvc.dto.MyfriendVO;

@Controller
public class MyUserSearchController {
	
	@Autowired
	private MyUserSearchInter myUserSearchInter;
	
	@RequestMapping("/friendsearch")
	public String myusersearch(Model m,MyfriendVO vo,HttpSession session,String friendid) {
		String myid = (String) session.getAttribute("sessionID");
		vo.setMyid(myid); 
		vo.setFriendid(friendid);
		List<MyUserVO> mvo = myUserSearchInter.myusersearch(vo);
		/*
		  for(int i=0; i<mvo.size();i++) { System.out.println(mvo.get(i).getId());
		  System.out.println(mvo.get(i).getUname());
		  System.out.println(mvo.get(i).getScore());
		  System.out.println(mvo.get(i).getTier());
		  System.out.println(mvo.get(i).getAddfriend());
		  System.out.println(mvo.getClass().getName());}
		 */
		m.addAttribute("mvo", mvo);
		return "main/multisearchform";
	}
}
