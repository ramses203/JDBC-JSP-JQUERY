package kr.co.kosmo.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.dao.SurveyInter;
import kr.co.kosmo.mvc.dto.SurveyContentVO;
import kr.co.kosmo.mvc.dto.SurveyVO;
import kr.co.kosmo.mvc.service.SurveyServiceInter;

@Controller
public class SurveyController {
	@Autowired
	private SurveyInter surveyInter;
	private SurveyServiceInter surveyServiceInter;
	
	@GetMapping("/survey")
	public String surveyForm() {
		return "survey/surveyForm";
	}
	
	@PostMapping("/surveyInsert")
	public ModelAndView surveyadd(SurveyVO vo, HttpServletRequest request) {
		String[] surveytitle = request.getParameterValues("surveytitle");
		List<SurveyContentVO> list = new ArrayList<SurveyContentVO>();
		char stype = 'A';
		for(String e : surveytitle) {
			SurveyContentVO sv = new SurveyContentVO();
			sv.setSurveytitle(e);
			sv.setSurveycnt(0);
			sv.setSubtype(String.valueOf(stype));
			sv.setSubcode(vo.getNum());
			list.add(sv);
			stype++;
		}
		vo.setScvolist(list);
		ModelAndView mav= new ModelAndView("redirect:surveylist");
		mav.addObject("vo", vo);
		surveyServiceInter.addSurveyAll(vo, list);
		
		return mav;
	} 
	
	@RequestMapping("/surveylist")
	public String surveyList(Model m) {
		List<SurveyVO> list = surveyInter.listSurvey();
		m.addAttribute("list", list);
		return "survey/surveylist";
	}
	
}
