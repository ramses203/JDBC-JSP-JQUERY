package kr.co.kosmo.mvc.dao;

import java.util.List;
import java.util.Map;

import kr.co.kosmo.mvc.dto.UpdemoSubVo;
import kr.co.kosmo.mvc.dto.UploadDemoVo;

public interface UpDemoDaoInter {
	public void addUp(UploadDemoVo vo);
	public List<UploadDemoVo> getlist();
	public List<Map<String, String>> getDetail(int no);
	// 반드시 foreach의 collection="list"
	public void addSubUp(List<UpdemoSubVo> list);
}
