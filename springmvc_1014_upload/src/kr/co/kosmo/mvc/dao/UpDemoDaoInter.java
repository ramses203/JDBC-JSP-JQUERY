package kr.co.kosmo.mvc.dao;

import java.util.List;

import kr.co.kosmo.mvc.dto.UploadDemoVO;

public interface UpDemoDaoInter {
	
	public void addup(UploadDemoVO vo);
	public List<UploadDemoVO> getList();
	public UploadDemoVO getDetail(int no);
}
