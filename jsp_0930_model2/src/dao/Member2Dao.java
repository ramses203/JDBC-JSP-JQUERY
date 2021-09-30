package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Member2DTO;
import conn.SqlServiceFactory;

public class Member2Dao {
// �̱��� �۾�
	private static Member2Dao dao;
	
	private Member2Dao() {}
	public synchronized static Member2Dao getDao() {
		if(dao == null) 
		dao = new Member2Dao();	
		return dao;
	}
	
	public int memberId(String id) {
		SqlSession ss =SqlServiceFactory.getFactory().openSession();
		int cc = ss.selectOne("mem.idchk",id);//����ڽ̰� ��ڽ̰��� �ľ��ϱ�
		ss.close();
		return cc;
	}
	
	
	public void insertMember(Member2DTO vo) {
		SqlSession ss = SqlServiceFactory.getFactory().openSession(true);
		// insert(arg0, arg1)
		// arg0 : mapper.xml �ȿ� �ִ� �ش��۾��� id
//		// arg1 : �ѱ� ��
		ss.insert("mem.add", vo);
		//ss.commit();
		ss.close();
	}
	
	// <select id="list" resultType="dto.Member2DTO">
	// select num,id,name,mdate from member2 order by 1 desc
	// </select>
	// connection�������
	// while ���� �������
	// resultest�� �������

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
		  SqlSession ss = SqlServiceFactory.getFactory().openSession(true);//Ŀ�ؼǿ���
		  Member2DTO vo = ss.selectOne("mem.sel", num); // SQL���� ���� (psmt)+ ����� ��������(resultset) + ����(vo.set)
		  ss.close();
		  
		  return vo;
	  }
	  
	}
	

