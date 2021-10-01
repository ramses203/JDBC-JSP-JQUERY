package model.gallery;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import controller.ActionForward;
import dao.GalleryDao;
import model.Action2;
import vo.MygalleryDTO;

public class MyGalleryInsertModel implements Action2{

	@Override
	public ActionForward execute(MultipartRequest request, HttpServletResponse response) throws IOException {
		
		String fileName = "";
		Enumeration<String> names = request.getFileNames();
		if(names.hasMoreElements()) {
			String name = names.nextElement();
			System.out.println("name:"+name);
			fileName = request.getFilesystemName(name);
		}
			System.out.println("subject:"+request.getParameter("subject"));
			// 모든 파라미터를 받아서 VO에 저장하세요
			MygalleryDTO vo = new MygalleryDTO();
			vo.setSubject(request.getParameter("subject"));
			vo.setWid(request.getParameter("wid"));
			vo.setCont(request.getParameter("cont"));
			vo.setImgn(fileName);
			vo.setReip(request.getParameter("reip"));
			GalleryDao.getDao().addGallery(vo);
		
			System.out.println("fileName:"+fileName);
		
		return new ActionForward("main.kosmo?cmd=gallery&viewName=galleryList", true);
	}

		
}
