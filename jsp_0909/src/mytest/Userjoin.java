package mytest;

import java.util.Scanner;

public class Userjoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵�");
		String id = sc.nextLine();
		System.out.println("�̸�");
		String name = sc.nextLine();
		System.out.println("����");
		float score = Float.parseFloat(sc.nextLine());
		System.out.println("����");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("���ǿ���: true/false");
		boolean agree = Boolean.parseBoolean(sc.nextLine());
		
		UseMember ref = new UseMember();
		System.out.println(ref.useMember());
		sc.close();
	}
	
}
