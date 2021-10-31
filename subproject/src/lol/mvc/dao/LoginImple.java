package lol.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lol.mvc.dto.MyUserVO;
@Repository
public class LoginImple implements LoginInter{
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public void addMyuser(MyUserVO vo) {
		ss.insert("login.add", vo);
	}

	@Override
	public int idChkMyuser(String id) {
		return ss.selectOne("login.idChk", id);
	}

	@Override
	public int loginCheckMyuser(MyUserVO vo) {
		return ss.selectOne("login.login", vo);
	}

	@Override
	public int phoneCheck(String phone) {
		return ss.selectOne("login.phoneChk", phone);
	}

	@Override
	public String findId(MyUserVO vo) {
		return ss.selectOne("login.findid", vo);
	}

	@Override
	public String findPwd(MyUserVO vo) {
		return ss.selectOne("login.findpwd", vo);
	}

	@Override
	public MyUserVO infoMyuser(String id) {
		return ss.selectOne("login.info", id);
		
	}

	@Override
	public void updateMyuser(MyUserVO vo) {
		ss.update("login.update", vo);
		
	}

}
