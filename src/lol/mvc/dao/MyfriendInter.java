package lol.mvc.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import lol.mvc.dto.MyfriendVO;

public interface MyfriendInter {

	public List<Map<String, String>>myfriend(String myid);
	public void friendrequest(MyfriendVO vo);
	public void friendresponse(MyfriendVO vo);
	public List<String> friendwait(String myid);
	public void requestfriend(MyfriendVO vo);
	public void responsefriend(MyfriendVO vo);
}
