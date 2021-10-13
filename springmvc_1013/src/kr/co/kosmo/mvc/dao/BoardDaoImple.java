package kr.co.kosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.dto.BoardDTO;

@Repository
public class BoardDaoImple implements BoardDaoInter{
	
	@Autowired
	private SqlSessionTemplate ss;
	
	
	@Override
	public List<BoardDTO> boardlist() {
		List<BoardDTO> test = ss.selectList("bor.list");
		for(BoardDTO vo : test) {
			System.out.println(vo.getNo());
			System.out.println(vo.getTitle());
			System.out.println(vo.getWriter());
		}
		
		return test;
	}

}
