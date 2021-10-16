package kr.co.kosmo.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.dto.UpdemoSubVO;
import kr.co.kosmo.mvc.dto.UploadDemoVo;

@Repository
public class UpDemoDaoImple implements UpDemoDaoInter {
	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public void addUp(UploadDemoVo vo) {
		ss.insert("upload.add", vo);
	}

	@Override
	public List<UploadDemoVo> getlist() {
		return ss.selectList("upload.list");
	}

	@Override
	public List<Map<String, String>> getDetil(int no) {
		List<Map<String, String>> listmap = ss.selectList("upload.detail",no);
		System.out.println(listmap);
		return listmap;
	}

	@Override
	public void addSubUp(List<UpdemoSubVO> list) {
		
		ss.insert("upload.subAdd", list);
	}

}
