package lol.mvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lol.mvc.dao.MyPageInter;
import lol.mvc.dao.MyfriendInter;
import lol.mvc.dto.PageVO;
import lol.mvc.dto.PlayVO;

@Controller
public class MyPageController {
	@Autowired
	private MyPageInter myPageInter;

	@RequestMapping("/mypageform")
	public String mytotalchapplay(Model m,HttpSession session, String nowPage, String cntPerPage) {
		String myid = (String) session.getAttribute("sessionID");
		
		int spage=1;
		if(nowPage != null && !nowPage.equals("")) {
			spage = Integer.parseInt(nowPage);
		}
		if(cntPerPage == null) {
			cntPerPage ="10";
		}
		
		int total = myPageInter.getTotalCount(myid);
		PageVO vo = new PageVO(total, spage, Integer.parseInt(cntPerPage));
		vo.setMyid(myid);
		m.addAttribute("paging", vo);		
		if(myid == null) {
			return "main/login";
		}
		List<Map<String, String>> listChap = myPageInter.myChampList(myid);
		m.addAttribute("totalchap", listChap);

		List<Map<String, String>> listDate = myPageInter.myStatDateList(myid);
		m.addAttribute("totaldate", listDate);

		List<Map<String, String>> listStat = myPageInter.mydetailList(vo);
		m.addAttribute("recentstat", listStat);

		List<Map<String, String>> listtier = myPageInter.mytier(myid);
		m.addAttribute("tier", listtier);
		
		session.setAttribute("mytier", listtier.get(0).get("TIER"));
		return "main/mypageform";
	}

	@RequestMapping("/recommendform")
	public String recommandForm(){
		return "main/recommendform";
	}
}
