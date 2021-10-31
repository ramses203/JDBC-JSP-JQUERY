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
	public String myfriendForm(HttpSession session, Model m) {
		String myid = (String) session.getAttribute("sessionID");
		List<Map<String, String>> list = myfriendInter.myfriend(myid);
		m.addAttribute("flist", list);
		return "main/myfriendform";
	}

	@RequestMapping("/friendreq")
	public String friendreq(HttpSession session,MyfriendVO vo,String id) {
		String myid = (String) session.getAttribute("sessionID");
		vo.setMyid(myid);
		vo.setFriendid(id);
		myfriendInter.friendrequest(vo);
		myfriendInter.friendresponse(vo);
		return "redirect:/multisearchform";
	}
	
	@RequestMapping("/friendrequser")
	public String friendrequser(HttpSession session,MyfriendVO vo,String id) {
		String myid = (String) session.getAttribute("sessionID");
		vo.setMyid(myid);
		vo.setFriendid(id);
		myfriendInter.friendrequest(vo);
		myfriendInter.friendresponse(vo);
		String addfriend = myfriendInter.selectfriend(vo);
		return "redirect:/userdetailform?id="+id+"&addfriend="+addfriend;
	}

	@RequestMapping("/reqfriend")
	public String reqfriend(MyfriendVO vo,String friendid,HttpSession session) {
		String myid = (String) session.getAttribute("sessionID");
		vo.setMyid(myid);
		vo.setFriendid(friendid);
		myfriendInter.requestfriend(vo);
		myfriendInter.responsefriend(vo);
		return "redirect:/myfriendform";
	}
	@RequestMapping("/reqfrienduser")
	public String reqfrienduser(MyfriendVO vo,String friendid,HttpSession session) {
		String myid = (String) session.getAttribute("sessionID");
		vo.setMyid(myid);
		vo.setFriendid(friendid);
		myfriendInter.requestfriend(vo);
		myfriendInter.responsefriend(vo);
		String addfriend = myfriendInter.selectfriend(vo);
		return "redirect:/userdetailform?id="+friendid+"&addfriend="+addfriend;
	}
	@RequestMapping("/recommenduserdetail")
	   public String userdetailform(HttpSession session,MyfriendVO vo,String friendid) {
	      String myid = (String)  session.getAttribute("sessionID");
	      vo.setMyid(myid);
	      vo.setFriendid(friendid);
	      String addfriend = myfriendInter.selectfriend(vo);
	      return "redirect:/userdetailform?id="+friendid+"&addfriend="+addfriend;
	   }
}
