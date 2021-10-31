package lol.mvc.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lol.mvc.dto.MyfriendVO;
@Repository
public class MyfriendImple implements MyfriendInter{
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public List<Map<String, String>> myfriend(String myid) {
		List<Map<String, String>> list = ss.selectList("myfriend.list", myid);
		return list;
	}

	@Override
	public void friendrequest(MyfriendVO vo) {
		ss.insert("myfriend.friendrequest", vo);
	}

	@Override
	public void friendresponse(MyfriendVO vo) {
		ss.insert("myfriend.friendresponse", vo);
	}

	@Override
	public List<String> friendwait(String myid) {
		List<String> res = ss.selectList("myfriend.wait", myid);
		return res;
	}

	@Override
	public void requestfriend(MyfriendVO vo) {
		ss.update("myfriend.requestfriend", vo);
	}

	@Override
	public void responsefriend(MyfriendVO vo) {
		ss.update("myfriend.responsefriend", vo);
	}

	@Override
	public String friendCount(String myid) {
		return ss.selectOne("myfriend.respcnt", myid);
	}

	@Override
	public String selectfriend(MyfriendVO vo) {
		System.out.println(vo.getAddfriend());
		return ss.selectOne("myfriend.select", vo);
	}
	
	

}
