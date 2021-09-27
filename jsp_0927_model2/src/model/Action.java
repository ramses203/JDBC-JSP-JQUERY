package model;
import java.io.IOException;

// model�� ����� ���ؼ� interface�� ���� �������Ѵ�. 
// �������̽� ������ ���, �߻�޼��尡 �⺻�̴�. default, static �߰��Ѵ�. 
// �������̽��� ���߻���� �����ϰ� ���߱����� �����ϴ�. 
// interface������ final�� abstract�� �Ⱥٿ��� �ȴ�. 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;

public interface Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException;
	
}
