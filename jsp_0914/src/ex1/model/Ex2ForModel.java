package ex1.model;
// �̱��� ����****: �����ϳ��� ��ü�� �����ؼ� �����ϵ��� �����ϴ� ����
public class Ex2ForModel {
	// ������ safe �� �� ����
	private static Ex2ForModel model;
	private Ex2ForModel() {}
	// Thread ����ȭ
	public synchronized static Ex2ForModel getInstance() {
		if(model == null) {
			model = new Ex2ForModel();
		}
		return model;
	}
	// ����Ͻ� ���� - �޼��� ����
	/*
	 *���ڰ� : s, n
	 *���� : s������ n���� �ݺ��ϸ鼭 sum���� ���Ѵ�.
	 *��ȯ�� : sum => int
	 * 
	 */
	public int forSum(int sv, int nv) {
		int sum = 0;
		// 1 ~ n ������ ���� �����ּ���.
		for(int i=sv; i<=nv; i++){
			sum = sum +i;
			System.out.println("A:"+i);
		}
		return sum;
		
		
	}
}
