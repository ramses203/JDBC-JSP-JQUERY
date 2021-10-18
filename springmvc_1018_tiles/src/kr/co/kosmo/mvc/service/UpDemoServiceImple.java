package kr.co.kosmo.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.kosmo.mvc.dao.UpDemoDaoInter;
import kr.co.kosmo.mvc.dto.UpdemoSubVo;
import kr.co.kosmo.mvc.dto.UploadDemoVo;

@Service
//@Transactional
public class UpDemoServiceImple implements UpDemoServiceInter{
	@Autowired
	private UpDemoDaoInter upDemoDaoInter;

	@Override
	public void addUpdemo(UploadDemoVo vo, List<UpdemoSubVo> scvo) {
		upDemoDaoInter.addUp(vo);
		upDemoDaoInter.addSubUp(scvo);
	}
	
	
}
