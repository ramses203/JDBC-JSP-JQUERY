package ex2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyLogin {

	public void inputpwd() {
		
		System.out.println("�н����带 �Է����ּ��� ����");
		Scanner sc = new Scanner(System.in);
		String pwd = null;
		int i = 1;
		for (; i <=3; i++) {
			pwd = sc.nextLine();
			if (pwd.equals("11")) {
				System.out.println("�����մϴ� ������");
				System.out.println("*************");
				break;
			} else {
				System.out.println(i + "�� �õ��Ͽ����ϴ�.");
			}
		}
		if (i >= 4) {
			System.out.println("3�� Ʋ���� ���ȷα׿� ����Ǿ �������� ���� �˴ϴ�.");
			System.exit(0);
		}
		sc.close();
	}
	

	
}
