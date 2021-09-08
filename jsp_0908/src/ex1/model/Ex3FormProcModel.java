package ex1.model;

public class Ex3FormProcModel {
	
	//모델 : 정수값 2개를 받아서 더하는 기능만을 제공하는 메서드
	public int[] addProc(int num1, int num2) {
		// Math.random()*범위 + 1
		int point = (int) (Math.random()*10+1);
//		int res = num1 + num2 + point;
		int[] aryres = new int[2];
		aryres[0]= point; 
		aryres[1]= num1 + num2 + point;
		return aryres;
	}
}
