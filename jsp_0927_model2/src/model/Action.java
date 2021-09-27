package model;
import java.io.IOException;

// model을 만들기 위해서 interface를 먼저 만들어야한다. 
// 인터페이스 구성은 상수, 추상메서드가 기본이다. default, static 추가한다. 
// 인터페이스는 다중상속이 가능하고 다중구현이 가능하다. 
// interface에서는 final과 abstract를 안붙여도 된다. 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;

public interface Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
	
}
