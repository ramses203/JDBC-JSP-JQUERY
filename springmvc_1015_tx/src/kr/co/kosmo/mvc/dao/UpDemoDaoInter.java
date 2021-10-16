package kr.co.kosmo.mvc.dao;

import java.util.List;
import java.util.Map;

import kr.co.kosmo.mvc.dto.UpdemoSubVO;
import kr.co.kosmo.mvc.dto.UploadDemoVo;

public interface UpDemoDaoInter {

	public void addUp(UploadDemoVo vo);
	public List<UploadDemoVo> getlist();
	public List<Map<String, String>> getDetil(int no);
	public void addSubUp(List<UpdemoSubVO> list);// 반드시 foreach의 collection="list"
}
