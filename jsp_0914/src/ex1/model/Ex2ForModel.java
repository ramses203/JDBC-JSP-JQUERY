package ex1.model;
// 싱글통 패턴****: 오직하나의 객체만 생성해서 공유하도록 설계하는 패턴
public class Ex2ForModel {
	// 쓰레드 safe 한 모델 생성
	private static Ex2ForModel model;
	private Ex2ForModel() {}
	// Thread 동기화
	public synchronized static Ex2ForModel getInstance() {
		if(model == null) {
			model = new Ex2ForModel();
		}
		return model;
	}
	// 비즈니스 로직 - 메서드 정의
	/*
	 *인자값 : s, n
	 *실행 : s값부터 n까지 반복하면서 sum합을 구한다.
	 *반환값 : sum => int
	 * 
	 */
	public int forSum(int sv, int nv) {
		int sum = 0;
		// 1 ~ n 까지의 합을 구해주세요.
		for(int i=sv; i<=nv; i++){
			sum = sum +i;
			System.out.println("A:"+i);
		}
		return sum;
		
		
	}
}
