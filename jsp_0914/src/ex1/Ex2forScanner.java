package ex1;

import java.util.Scanner;

import ex1.model.Ex2ForModel;

public class Ex2forScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ��=>");
		int sv = Integer.parseInt(sc.nextLine());
		
		System.out.println("�ι�° ��=>");
		int nv = Integer.parseInt(sc.nextLine());
		
		int sum = Ex2ForModel.getInstance().forSum(sv, nv);
		
	System.out.println("1 ���� n������ ����"+sum+"�Դϴ�.");
	}
	
}
