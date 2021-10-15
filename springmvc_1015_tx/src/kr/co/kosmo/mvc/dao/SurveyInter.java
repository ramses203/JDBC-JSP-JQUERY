package kr.co.kosmo.mvc.dao;

import java.util.List;

import kr.co.kosmo.mvc.dto.SurveyContentVO;
import kr.co.kosmo.mvc.dto.SurveyVO;
import kr.co.kosmo.mvc.dto.UploadDemoVo;

public interface SurveyInter {
	public void addUp(SurveyVO vo);
	public void addSurveyContent(List<SurveyContentVO> vo);
	public List<SurveyVO> listSurvey();
	
	
}
