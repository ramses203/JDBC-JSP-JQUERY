package model;
import java.io.IOException;

// model�� ����� ���ؼ� interface�� ���� �������Ѵ�. 
// �������̽� ������ ���, �߻�޼��尡 �⺻�̴�. default, static �߰��Ѵ�. 
// �������̽��� ���߻���� �����ϰ� ���߱����� �����ϴ�. 
// interface������ final�� abstract�� �Ⱥٿ��� �ȴ�. 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
// �������̽��� ������ ���, �߻�޼���, default, static���� �����Ǿ��ִ�. 
// �������̽��� ���߻��, ���߱����� �����ϴ�. 
public interface Action {
		//  Interface���� model�� ����� ActionForward�� ��ȯ������ ControllerServlet���� �������ش�.�׷��� ������ ��ȯ���� ActionForward�� �ۼ��� ���ش�. 
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
	
}
