package ex1;

import java.util.Scanner;

import ex1.model.Ex2ForModel;

public class Ex2forScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수=>");
		int sv = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 수=>");
		int nv = Integer.parseInt(sc.nextLine());
		
		int sum = Ex2ForModel.getInstance().forSum(sv, nv);
		
	System.out.println("1 부터 n까지의 합은"+sum+"입니다.");
	}
	
}
