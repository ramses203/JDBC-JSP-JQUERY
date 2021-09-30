package dao;

import org.apache.ibatis.session.SqlSession;

import conn.SqlServiceFactory;
import vo.Member2DTO;

public class LoginDao {

	private static LoginDao dao;
	private LoginDao() {
	}
	public synchronized static LoginDao getDao() {
		if(dao == null) {
		dao = new LoginDao();
		}
		return dao;
	}
	
	public int loginCheck(Member2DTO vo) {
		SqlSession ss = SqlServiceFactory.getFactory().openSession();
		int res = ss.selectOne("login.lgcheck", vo);
		ss.close();
		return res;
	}
	
}
