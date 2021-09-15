package ex1;

import java.util.ArrayList;

public class Ex5ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> ar = new ArrayList<String>();
	String str1 ="sdsd:dsa:1/";
	String str2 ="dfs:fsfs:1/";
	String str3 ="das:dsa:1/2/";
	String str4 ="fd:fd:1/";
	
	ar.add(str1);
	ar.add(str2);
	ar.add(str3);
	System.out.println("-----------------");
	for(String e : ar) {
		System.out.println(e);
	}
}
}
