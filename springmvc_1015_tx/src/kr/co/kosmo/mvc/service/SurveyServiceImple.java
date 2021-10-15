package kr.co.kosmo.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.kosmo.mvc.dao.SurveyInter;
import kr.co.kosmo.mvc.dto.SurveyContentVO;
import kr.co.kosmo.mvc.dto.SurveyVO;

@Service
@Transactional
public class SurveyServiceImple implements SurveyServiceInter{
	@Autowired
	private SurveyInter surveyInter;

	@Override
	public void addSurveyAll(SurveyVO svo, List<SurveyContentVO> scvo) {
		surveyInter.addUp(svo);
		surveyInter.addSurveyContent(scvo);
	}

	

	
	
	
}
