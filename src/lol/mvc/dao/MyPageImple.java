package lol.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lol.mvc.dto.PageVO;
import lol.mvc.dto.PlayVO;

@Repository
public class MyPageImple implements MyPageInter{
	
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public List<Map<String, String>> myChampList(String myid) {
		List<Map<String, String>> list = ss.selectList("mypage.champlist", myid);
		return list;
	}

	@Override
	public List<Map<String, String>> mydetailList(PageVO pagevo) {
		List<Map<String, String>> list = ss.selectList("mypage.detaillist", pagevo);
		return list;
	}



	@Override
	public List<Map<String, String>> mytier(String myid) {
		List<Map<String, String>> list = ss.selectList("mypage.mytier", myid);
		return list;
	}

	@Override
	public List<Map<String, String>> myStatDateList(String myid) {
		List<Map<String, String>> list = ss.selectList("mypage.datelist", myid);
		return list;
	}
	
	//∆‰¿Ã¬°
	@Override
	public int getTotalCount(String myid) {
		return ss.selectOne("mypage.totalCnt", myid);
	}

}
