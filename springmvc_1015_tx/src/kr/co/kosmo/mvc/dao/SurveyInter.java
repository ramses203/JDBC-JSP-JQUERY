package kr.co.kosmo.mvc.dao;

import java.util.List;
import java.util.Map;

import kr.co.kosmo.mvc.dto.SurveyContentVO;
import kr.co.kosmo.mvc.dto.SurveyVO;

public interface SurveyInter {

	public void addSurvey(SurveyVO vo);
	public void addSurveyContent(List<SurveyContentVO> scvo);
	public List<SurveyVO> listSurvey();
	public List<Map<String, String>> getDetil(int no);
}
