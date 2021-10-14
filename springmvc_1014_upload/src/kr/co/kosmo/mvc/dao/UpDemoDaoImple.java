package kr.co.kosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.dto.UploadDemoVO;

@Repository
public class UpDemoDaoImple implements UpDemoDaoInter{
	
	@Autowired
	private SqlSessionTemplate ss;
	
	
	@Override
	public void addup(UploadDemoVO vo) {
		ss.insert("upload.add", vo);
	}

	@Override
	public List<UploadDemoVO> getList() {
		return ss.selectList("upload.list");
	}

	@Override
	public UploadDemoVO getDetail(int no) {
		return ss.selectOne("upload.detail", no);
	}

}
