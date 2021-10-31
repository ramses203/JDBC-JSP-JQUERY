package lol.mvc.dao;

import java.util.List;
import java.util.Map;

import lol.mvc.dto.PlayVO;
import lol.mvc.dto.RecommendVO;

public interface RecommendInter {
	public RecommendVO myInfo(String id);
	public List<RecommendVO> userLine(String e); //session ID
	public List<RecommendVO> charRank(String uline);
}
