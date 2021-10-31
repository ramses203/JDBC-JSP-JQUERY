package lol.mvc.dao;

import java.util.List;
import java.util.Map;

import lol.mvc.dto.MyUserVO;
import lol.mvc.dto.MyfriendVO;

public interface MyUserSearchInter {

	public List<MyUserVO> myusersearch(MyfriendVO vo);
}
