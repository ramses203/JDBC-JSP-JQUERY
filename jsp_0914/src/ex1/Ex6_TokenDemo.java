package ex1;

import java.util.StringTokenizer;

public class Ex6_TokenDemo {
public static void main(String[] args) {
	String str1 = "������::null:dog/cat/";
	String[] res = str1.split(":");
	for(String e: res) {
		System.out.println(e);
	}
	System.out.println("----------------------");
	StringTokenizer stz = new StringTokenizer(str1,":");
	while (stz.hasMoreElements()) {
		System.out.println(stz.nextToken());
	}
}// Split�� StringTokenizer�� ���̴� �ǹ��ϴ� ������ ����ϳľ��ϳİ� �����̴�. 
}
