package ex2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyLogin {

	public void inputpwd() {
		
		System.out.println("패스워드를 입력해주세요 제발");
		Scanner sc = new Scanner(System.in);
		String pwd = null;
		int i = 1;
		for (; i <=3; i++) {
			pwd = sc.nextLine();
			if (pwd.equals("11")) {
				System.out.println("축하합니다 돈들어가요");
				System.out.println("*************");
				break;
			} else {
				System.out.println(i + "번 시도하였습니다.");
			}
		}
		if (i >= 4) {
			System.out.println("3번 틀리면 보안로그에 저장되어서 업무과에 보고가 됩니다.");
			System.exit(0);
		}
		sc.close();
	}
	

	
}
