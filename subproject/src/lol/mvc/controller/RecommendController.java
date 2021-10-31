package lol.mvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.executor.ReuseExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lol.mvc.dao.RecommendInter;
import lol.mvc.dto.RecommendVO;

@Controller
public class RecommendController {

	@Autowired
	private RecommendInter recommendInter;

	/*
	 * @RequestMapping("/recommendform") public String recommendForm(HttpSession
	 * session){ return "main/recommendform"; }
	 */
	
	@RequestMapping("/recommend")
	public String myLine(HttpSession session, Model m) {

		String id = (String) session.getAttribute("sessionID");
		RecommendVO vo1 = recommendInter.myInfo(id);
		List<RecommendVO> list1 = null;
		List<RecommendVO> list2 = null;
		ArrayList<List<RecommendVO>> aryvo1 = new ArrayList<>();
		ArrayList<List<RecommendVO>> aryyo2 = new ArrayList<>();
		String[] line = { "T", "M", "B", "J", "S"};
		for(String e : line) {
			list2 = recommendInter.charRank(e);
			aryyo2.add(list2);
			if(vo1.getMyLine().equals(e)) {
				continue;
			}
			list1 = recommendInter.userLine(e);
			aryvo1.add(list1);
		}
		m.addAttribute("listary",aryvo1);
		m.addAttribute("listrank", aryyo2);
		return "main/recommend";

	}

}
