package model.gallery;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import dao.GalleryDao;
import model.Action;
import vo.MygalleryDTO;

public class MyGalleryNoticeModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<MygalleryDTO> list = GalleryDao.getDao().listNoticeGallery(3);
		int snum = list.size();
		request.setAttribute("list", list);
		request.setAttribute("snum", snum);
		return new ActionForward("gallery/gallerynotice.jsp", false);
	}
	
	
	
}
