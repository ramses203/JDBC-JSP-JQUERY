package model;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import dao.BoardDao;
import vo.BoardVO;

public class BoardFormModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String viewName = request.getParameter("viewName");
		String views = "";
		boolean methods = false;
		BoardDao dao = BoardDao.getDao();
		
		if(viewName.equals("write")) {
			views = "board/"+ viewName +".jsp"; 
			methods = false;
			
		}else if(viewName.equals("boardInsert")) {
			BoardVO vo = new BoardVO();
			vo.setTitle(request.getParameter("title"));
			vo.setWriter(request.getParameter("writer"));
			vo.setPwd(request.getParameter("pwd"));
			vo.setContent(request.getParameter("content"));
			dao.insert(vo);
			
			views = "main.kosmo?cmd=board&viewName=list";
			methods = true;
		}else if(viewName.equals("list")){
			ArrayList<BoardVO> blist = dao.list();
			request.setAttribute("blist", blist);
			
			views = "board/"+ viewName +".jsp"; 
			methods = false;
		}
		
		return new ActionForward(views, methods);
	}
	

}
