package model;
import java.io.IOException;

// model을 만들기 위해서 interface를 먼저 만들어야한다. 
// 인터페이스 구성은 상수, 추상메서드가 기본이다. default, static 추가한다. 
// 인터페이스는 다중상속이 가능하고 다중구현이 가능하다. 
// interface에서는 final과 abstract를 안붙여도 된다. 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
// 인터페이스의 구성은 상수, 추상메서드, default, static으로 구성되어있다. 
// 인터페이스는 다중상속, 다중구현이 가능하다. 
public interface Action {
		//  Interface에서 model의 결과를 ActionForward의 반환형으로 ControllerServlet에게 전달해준다.그렇기 때문에 반환형은 ActionForward로 작성을 해준다. 
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
	
}
