package kr.co.kosmo.mvc.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kosmo.mvc.dao.BoardDaoInter;
import kr.co.kosmo.mvc.dto.BoardDTO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardDaoInter boardDaoInter;
	
	
	@GetMapping("/mboardList")
	public String boardForm(Model m) {
		List<BoardDTO> list = boardDaoInter.boardlist();
		m.addAttribute("blist",list);
		return "board/boardForm";
	}
	
}
