package lol.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lol.mvc.dto.RecommendVO;

@Repository
public class RecommendImple implements RecommendInter {

	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public RecommendVO myInfo(String myId) {
		return ss.selectOne("rec.myinfo", myId);
	}

	@Override
	public List<RecommendVO> userLine(String userLine) {
		List<RecommendVO> userInfo = ss.selectList("rec.userinfo", userLine);
		return userInfo;
	}

	@Override
	public List<RecommendVO> charRank(String uline) {
		List<RecommendVO> charRank = ss.selectList("rec.charrank",uline);
		return charRank;
		 
	}
	
	


}
