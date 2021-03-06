package kr.co.kosmo.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.vo.MemberVO;

@Repository
public class MemberDaoImple implements MemberInter{
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public void addMem(MemberVO vo) {
		ss.insert("mem.add", vo);
	}

}
