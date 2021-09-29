package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Member2DTO;
import conn.SqlServiceFactory;

public class Member2Dao {
// 싱글톤 작업
	private static Member2Dao dao;
	
	private Member2Dao() {}
	public synchronized static Member2Dao getDao() {
		if(dao == null) 
		dao = new Member2Dao();	
		return dao;
	}
	
	public int memberId(String id) {
		SqlSession ss =SqlServiceFactory.getFactory().openSession();
		int cc = ss.selectOne("mem.idchk",id);//오토박싱과 언박싱개념 파악하기
		ss.close();
		return cc;
	}
	
	
	public void insertMember(Member2DTO vo) {
		SqlSession ss = SqlServiceFactory.getFactory().openSession(true);
		// insert(arg0, arg1)
		// arg0 : mapper.xml 안에 있는 해당작업의 id
//		// arg1 : 넘길 값
		ss.insert("mem.add", vo);
		//ss.commit();
		ss.close();
	}
	
	// <select id="list" resultType="dto.Member2DTO">
	// select num,id,name,mdate from member2 order by 1 desc
	// </select>
	// connection사라지고
	// while 문도 사라지고
	// resultest도 사라지고

	public List<Member2DTO> listMember() {
		SqlSession ss = SqlServiceFactory.getFactory().openSession(true);
		List<Member2DTO> list = ss.selectList("mem.list");
		ss.close();
		return list;
	}
	
	  public void delMember(int num) {
	      SqlSession ss = SqlServiceFactory.getFactory().openSession(true);
	      ss.delete("mem.del",num);
	      ss.close();
	   }
	  
	  public Member2DTO detail(int num) {
		  SqlSession ss = SqlServiceFactory.getFactory().openSession(true);//커넥션역할
		  Member2DTO vo = ss.selectOne("mem.sel", num); // SQL구문 실행 (psmt)+ 결과값 가져오기(resultset) + 저장(vo.set)
		  ss.close();
		  
		  return vo;
	  }
	  
	}
	

