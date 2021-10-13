package kr.co.kosmo.mvc.dao;

import java.util.List;

import kr.co.kosmo.mvc.dto.BoardDTO;
import kr.co.kosmo.mvc.dto.Member2DTO;

public interface MemberDaoInter {
	public void addMem(Member2DTO vo);
	public int idChk(String id);
	public List<Member2DTO> memberList();
	public int loginCheck(Member2DTO vo);
	
}
