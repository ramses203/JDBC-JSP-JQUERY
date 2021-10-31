package lol.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lol.mvc.dto.MyUserVO;
import lol.mvc.dto.MyfriendVO;
@Repository
public class MyUserSearchImple implements MyUserSearchInter{
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public List<MyUserVO> myusersearch(MyfriendVO vo) {
		return ss.selectList("search.search", vo);
	}

}
