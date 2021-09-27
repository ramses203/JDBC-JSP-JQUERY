package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;

public class HelloModel implements Action{	//인터페이스 Action을 model에서 구현할것이다.

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
			String msg = "안녕하세요 나의 첫 모델 2입니다."; // 모델에서 값을 보낼때 redirect로 보내면 안되고 forward방식으로 보내야 한다. 그래야 값이 뭉게지지 않기 때문에
												  //이 model의 결과값은 controllerServlet을 통해서 view로 보낸다.
			request.setAttribute("msg", msg);	  // 모델에서 request.setAttribute로 값을 심어줬기 때문에 view에서 request.getAttribute로 결과값을 뽑아줘야한다. 
			
		
		return new ActionForward("hello.jsp", false);//true면 redirect false면 forward방식으로 값을 보내게 된다. 
	}

}
