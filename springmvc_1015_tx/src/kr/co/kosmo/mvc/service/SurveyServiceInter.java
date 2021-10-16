package kr.co.kosmo.mvc.service;

import java.util.List;

import kr.co.kosmo.mvc.dto.SurveyContentVO;
import kr.co.kosmo.mvc.dto.SurveyVO;

public interface SurveyServiceInter {

	public void addSurveyAll(SurveyVO vo,List<SurveyContentVO> scvo);
}
