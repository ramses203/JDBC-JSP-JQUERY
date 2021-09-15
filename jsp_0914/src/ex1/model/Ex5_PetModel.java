package ex1.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Ex5_PetModel {
private static Ex5_PetModel model;
private Ex5_PetModel() {
	
}
public static synchronized Ex5_PetModel getModel() {
	if(model == null) {
		model = new Ex5_PetModel();
	}
	
	return model;
}
	public void insertPetFile(String name, String address, String[] pets) {
		String path = "D:\\kosmo91\\jsp\\workspace\\jsp_0914\\src\\ex1\\model\\pets.txt";
		PrintWriter out = null;
		try {
			// 자바 복습 : new PrintWriter(new FileWriter(path, appendMode),autoflush);
			// appendMode : 이어쓰기
			// autoflush : 버퍼에서 비워주기
			out = new PrintWriter(new FileWriter(path, true),true);
			//김길동: 가산 :dog/pig
			StringBuilder sb = new StringBuilder();
			sb.append(name).append(":").append(address).append(":");
			for(String e : pets) {
			sb.append(e).append("/");	
			}
			out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
	
	
	
		
		
	

// 상식선에서 파일을 읽어와서
// 테이블의 태그(X)
//1. 파일에서 읽어들이는 과정후 테스트
//2. ArrayList 에 잘담아서 반환
public ArrayList<String> listgetFile(){
	String path = "D:\\kosmo91\\jsp\\workspace\\jsp_0914\\src\\ex1\\model\\pets.txt";
	BufferedReader br = null;
	ArrayList<String> arlist = new ArrayList<String>();
	try {
		br = new BufferedReader(new FileReader(path));
		String res = null;
		while ((res = br.readLine()) != null) {
			System.out.println(res);
			arlist.add(res);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	return arlist;
}
//public static void main(String[] args) {
//	Ex5_PetModel.getModel().listgetFile();
//}
}
