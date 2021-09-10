package mytest;

import java.util.ArrayList;
import java.util.Map;

public class TestArgs {

	public String test1(String[] str) {
		StringBuilder sb = new StringBuilder();
		for(String t : str) {
			sb.append(t);
		}
		return sb.toString();
	}
	
	
	public void test2(Map<String,String> map) {
		
	}
	
	
	public void test3(ArrayList<String> ar) {
		
		System.out.println(ar.get(0));
		int age = Integer.parseInt(ar.get(1));
		if(age<19) {
			System.out.println("미성년");
		}else {
			System.out.println(age);
		}
	}
	public static void main(String[] args) {
		TestArgs ref = new TestArgs();
		
		// 인자타입이 String 배열로 생성해서 넘겨
		System.out.println("---test1---");
		String[] st = new String[] {"안","녕","하","세","요"};
		System.out.println(ref.test1(st));
		
		
		
		
		
		// 인자타입이 ArrayList
		System.out.println("---test3---");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("xman");
		ar.add("10");
		ref.test3(ar);
		
		
		
		
		
		
	}
	
}
