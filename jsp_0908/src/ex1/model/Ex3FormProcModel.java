package ex1.model;

public class Ex3FormProcModel {
	
	//�� : ������ 2���� �޾Ƽ� ���ϴ� ��ɸ��� �����ϴ� �޼���
	public int[] addProc(int num1, int num2) {
		// Math.random()*���� + 1
		int point = (int) (Math.random()*10+1);
//		int res = num1 + num2 + point;
		int[] aryres = new int[2];
		aryres[0]= point; 
		aryres[1]= num1 + num2 + point;
		return aryres;
	}
}
