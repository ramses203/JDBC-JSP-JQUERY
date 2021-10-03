package model.gallery;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import dao.GalleryDao;
import model.Action;
import vo.MygalleryDTO;

public class MyGalleryModel implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String viewName = request.getParameter("viewName");
		String views = "";
		boolean methods = false;
		if (viewName.equals("galleryForm")) {
			views = "gallery/" + viewName + ".jsp";
			methods = false;
		} else if(viewName.equals("galleryList")) {
			String searchType = request.getParameter("searchType");
			String searchValue = request.getParameter("searchValue");
			//System.out.println("searchType:"+searchType);
			//System.out.println("searchValue:"+searchValue);
			MygalleryDTO vo = new MygalleryDTO();
			vo.setSearchType(searchType);
			vo.setSearchValue(searchValue);
			List<MygalleryDTO> list = GalleryDao.getDao().listGallery(vo);
			request.setAttribute("glist", list);
			views = "gallery/" + viewName + ".jsp";
			methods = false;
		}else if(viewName.equals("galleryDetail")) {
			int num = Integer.parseInt(request.getParameter("num"));
			MygalleryDTO vo = GalleryDao.getDao().detailGallery(num);
			request.setAttribute("vo", vo);
			views = "gallery/" + viewName + ".jsp";
			methods = false;
		}else {
			views = "main,kosmo?cmd=index";
			methods = true;
		}
		return new ActionForward(views, methods);

	}
}
