package exam;

import java.util.Scanner;

public class MemberModel {

	public String people(String name, String gender, int age) {
		StringBuilder sb = new StringBuilder();
		if (!check_age(age)) {
			sb.append("미성년자 입니다.");
			return sb.toString();
		} else {
			String gen_res = "";
			if(gender == "M") {
				gen_res = "남자";
			} else {
				gen_res = "여자";
			}
			/*
			 * 이름: name
			 * 성별: gender
			 */

			sb.append("이름 : ").append(name).append("  ");
			sb.append("성별: ").append(gen_res);

			return sb.toString();

		}
	}
// 나이 제한 (19세 미만이면 미성년자입니다. 출력/ 19세 이상이름, 성별출력)
	public boolean check_age(int age) {
		if(age > 19) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("성별: ");
		String gender = sc.nextLine();
		System.out.print("나이: ");

		int age = Integer.parseInt(sc.nextLine());
		MemberModel ref = new MemberModel();
		String str = ref.people(name, gender, age);
		System.out.println(str);
	}

}