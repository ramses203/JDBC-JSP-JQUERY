package kr.co.kosmo.mvc.service;

import java.util.List;

import kr.co.kosmo.mvc.dto.UpdemoSubVo;
import kr.co.kosmo.mvc.dto.UploadDemoVo;


public interface UpDemoServiceInter {
	public void addUpdemo(UploadDemoVo vo, List<UpdemoSubVo> suvo);
}
