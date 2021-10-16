package kr.co.kosmo.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.dto.SurveyContentVO;
import kr.co.kosmo.mvc.dto.SurveyVO;
@Repository
public class SurveyImple implements SurveyInter{
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public void addSurvey(SurveyVO vo) {
		ss.insert("survey.add", vo);
	}

	@Override
	public void addSurveyContent(List<SurveyContentVO> vo) {
		ss.insert("survey.addcontent", vo);
	}

	@Override
	public List<SurveyVO> listSurvey() {
		return ss.selectList("survey.list");
	}

	@Override
	public List<Map<String, String>> getDetil(int no) {
		List<Map<String, String>> listmap = ss.selectList("survey.detail",no);
		return listmap;
	}

}
