package lol.mvc.dao;

import lol.mvc.dto.MyUserVO;

public interface LoginInter {

	public void addMyuser(MyUserVO vo);
	public int idChkMyuser(String id);
	public int loginCheckMyuser(MyUserVO vo);
	public int phoneCheck(String phone);
	public String findId(MyUserVO vo);
	public String findPwd(MyUserVO vo);
}
