package lol.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lol.mvc.dto.GameVO;
import lol.mvc.dto.PlayVO;

@Repository
public class AdminImple implements AdminInter{

	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public int lastroomno() {
		return ss.selectOne("admin.lastroom");
	}

	@Override
	public void insertGame(GameVO vo) {
		ss.insert("admin.insertgame", vo);
		
	}

	@Override
	public void insertPlay(PlayVO vo) {
		ss.insert("admin.insertplay", vo);
		
	}

	@Override
	public void updateScore(PlayVO vo) {
		ss.update("admin.updatescore", vo);
		
	}

	@Override
	public void updateTier(PlayVO vo) {
		ss.update("admin.updatetier", vo);
	}

	@Override
	public void updateZero() {
		ss.update("admin.updatezero");
	}

	@Override
	public List<String> userList() {
		return ss.selectList("admin.userlist");
	}

	@Override
	public List<String> itemList() {
		return ss.selectList("admin.itemlist");
	}

	@Override
	public List<String> skillList() {
		return ss.selectList("admin.skilllist");
	}

	@Override
	public List<String> champList() {
		return ss.selectList("admin.champlist");
	}
}
