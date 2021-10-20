package kr.co.kosmo.mvc.dao;

import java.util.List;

import kr.co.kosmo.mvc.dto.MygalleryDTO;

public interface GalleryDaoInter {

	public void addGallery(MygalleryDTO vo);
	public List<MygalleryDTO> listGallery();
	public List<MygalleryDTO> listNoticeGallery(int rownum);
	public MygalleryDTO detailGallery(int num);
	
	
}
