package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyPublic {
	public String todayMethod() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		return f.format(new Date());
	}
}
/*
 *  TodayBeforeAdvice���� MyPublic�� DI�� �޾Ƽ� Advice���� ������ ��Ų��.
 *  
 *  ex2.DaoImple �� ���ǵ� ��� �޼��忡 �����۾����� ������ɷ����� ����ǵ��� �����Ͻÿ�.
 */
 