package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


import conn.SqlServiceFactory;
import vo.MygalleryDTO;

public class GalleryDao {
	private static GalleryDao dao;
	private  GalleryDao() {
	}
	public synchronized static GalleryDao getDao() {
		if(dao == null) {
		dao = new GalleryDao();	
	}
		return dao;
	}
	
	public void addGallery(MygalleryDTO vo) {
		SqlSession ss = SqlServiceFactory.getFactory().openSession(true);
		ss.insert("gallery.add", vo);
		ss.close();
	}
	
	public List<MygalleryDTO> listGallery(MygalleryDTO dto){
		SqlSession ss = SqlServiceFactory.getFactory().openSession();
		List<MygalleryDTO> list = ss.selectList("gallery.list",dto);
		ss.close();
		return list;
	}
	
	public List<MygalleryDTO> listNoticeGallery(int rownum){
		SqlSession ss = SqlServiceFactory.getFactory().openSession();
		List<MygalleryDTO> list = ss.selectList("gallery.nlist",rownum);
		ss.close();
		return list;
	}
	
	public MygalleryDTO detailGallery(int num) {
		SqlSession ss = SqlServiceFactory.getFactory().openSession();
		MygalleryDTO vo = ss.selectOne("gallery.detail",num);
		ss.close();
		return vo;
	}
	
	
	
}
