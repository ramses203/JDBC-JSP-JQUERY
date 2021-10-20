package kr.co.kosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.dto.Member2DTO;

@Repository
public class MemberDaoImple implements MemberDaoInter{

	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public void addMem(Member2DTO vo) {
		ss.insert("mem.add", vo);
	}

	@Override
	public int idChk(String id) {
		int cc = ss.selectOne("mem.idchk",id);
		
		return cc;
	}

	@Override
	public List<Member2DTO> memberList() {
		
		return ss.selectList("mem.list");
	}

	@Override
	public int loginCheck(Member2DTO vo) {
		return ss.selectOne("mem.lgcheck", vo);
		
	}
	

}
