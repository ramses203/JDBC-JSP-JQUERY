package mytest;

import java.util.Scanner;

public class Userjoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디");
		String id = sc.nextLine();
		System.out.println("이름");
		String name = sc.nextLine();
		System.out.println("점수");
		float score = Float.parseFloat(sc.nextLine());
		System.out.println("나이");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("동의여부: true/false");
		boolean agree = Boolean.parseBoolean(sc.nextLine());
		
		UseMember ref = new UseMember();
		System.out.println(ref.useMember());
		sc.close();
	}
	
}
