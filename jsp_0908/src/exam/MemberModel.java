package exam;

import java.util.Scanner;

public class MemberModel {

	public String people(String name, String gender, int age) {
		StringBuilder sb = new StringBuilder();
		if (!check_age(age)) {
			sb.append("�̼����� �Դϴ�.");
			return sb.toString();
		} else {
			String gen_res = "";
			if(gender == "M") {
				gen_res = "����";
			} else {
				gen_res = "����";
			}
			/*
			 * �̸�: name
			 * ����: gender
			 */

			sb.append("�̸� : ").append(name).append("  ");
			sb.append("����: ").append(gen_res);

			return sb.toString();

		}
	}
// ���� ���� (19�� �̸��̸� �̼������Դϴ�. ���/ 19�� �̻��̸�, �������)
	public boolean check_age(int age) {
		if(age > 19) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("����: ");
		String gender = sc.nextLine();
		System.out.print("����: ");

		int age = Integer.parseInt(sc.nextLine());
		MemberModel ref = new MemberModel();
		String str = ref.people(name, gender, age);
		System.out.println(str);
	}

}