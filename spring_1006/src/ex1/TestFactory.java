package ex1;

public class TestFactory {

	public static void main(String[] args) {
		
		TodayBeforeAdvice ref = new TodayBeforeAdvice();
		ref.setMyPublic(new MyPublic());
		ref.beforeToday();
	}
}
