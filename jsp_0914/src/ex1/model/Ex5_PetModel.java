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
			// �ڹ� ���� : new PrintWriter(new FileWriter(path, appendMode),autoflush);
			// appendMode : �̾��
			// autoflush : ���ۿ��� ����ֱ�
			out = new PrintWriter(new FileWriter(path, true),true);
			//��浿: ���� :dog/pig
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
	
	
	
		
		
	

// ��ļ����� ������ �о�ͼ�
// ���̺��� �±�(X)
//1. ���Ͽ��� �о���̴� ������ �׽�Ʈ
//2. ArrayList �� �ߴ�Ƽ� ��ȯ
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
