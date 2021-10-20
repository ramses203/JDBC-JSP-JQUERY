package kr.co.kosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.dto.MygalleryDTO;

@Repository
public class GalleryDao implements GalleryDaoInter {

    @Autowired
    private SqlSessionTemplate ss;

    @Override
    public void addGallery(MygalleryDTO vo) {
        ss.insert("gellery.add", vo);
    }

    @Override
    public List<MygalleryDTO> listGallery() {
        return ss.selectList("gallery.list");
    }

    @Override
    public List<MygalleryDTO> listNoticeGallery(int rownum) {
        return ss.selectList("gallery.nlist", rownum);
    }

    @Override
    public MygalleryDTO detailGallery(int num) {
        return ss.selectOne("gellery.detail", num);
    }

}
