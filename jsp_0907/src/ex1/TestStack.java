package ex1;

public class TestStack {

	public static void test() {
		int num = 10;
		test(num);
		System.out.println(num);
	}
	public static void test(int num) {
		num = num + 10;
		System.out.println(num);
	}
	public static void main(String[] args) {
		test();
	}
}

// stack의 구조는 LIFO (Last in First out)
// Queue의 구조는 FIFO (First in First out)