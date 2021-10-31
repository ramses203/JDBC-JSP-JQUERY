package lol.mvc.dao;

import java.util.List;

import lol.mvc.dto.GameVO;
import lol.mvc.dto.PlayVO;

public interface AdminInter {
	public int lastroomno();
	public void insertGame(GameVO vo);
	public void insertPlay(PlayVO vo);
	public void updateScore(PlayVO vo);
	public void updateTier(PlayVO vo);
	public void updateZero();
	public List<String> userList();
	public List<String> itemList();
	public List<String> skillList();
	public List<String> champList();
}
