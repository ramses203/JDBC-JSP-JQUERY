//package study;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class JavaFileIODemo {
//
//	public static void main(String[] args) {
//		String filePath = "D:\\kosmo91\\jsp\\workspace\\jsp_0916\\WebContent\\WEB-INF\\message\\notice.txt";
//		
//		//바이트스트림 : 문자, 영상, 이미지 등
//		//문자 스트림 : 문자전용, 2byte
//		
////		BufferedReader rd = new BufferedReader(
////				new InputStreamReader(new FileInputStream(filePath)));
//		BufferedReader rd = new BufferedReader(new FileReader(filePath));
//		String res = null;
//		while ((res = rd.readLine()) != null) {
//			System.out.println(res);
//		}
//		System.out.println("----------------------------");
////		Scanner rd2 = new Scanner(new FileInputStream(filePath));
//		Scanner rd2 = new Scanner(new FileReader(filePath));
//		String res2 = null;
//		while(rd2.hasNext()){
//			res2 = rd2.nextLine();
//			System.out.println(res2);
//		}
//	}
//}
