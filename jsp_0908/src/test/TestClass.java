package test;

import java.lang.reflect.Array;

public class TestClass {
	int x;
	int y;
	Array arr;
	
//test1: 반환값이 있는 메서드 만들기
	//예: test() 호출하면 특정 값을 반환하면 됨
	
int test1() {
		return 1;
	}

//test2: 인자가 하나 이상이면서 반환값이 있는 메서드 만들기
	//예: test(10, "hello")

 int test2(int x, int y) {
		this.x = x;
		this.y = y;
		return x+y;
	}

//test3: 인자의 값이 모두 문자열인 값일 때 그 값을 출력하는 메서드 만들기-메서드 하나로 해결 (void)
	//예: testcall("하나", "둘");
	// testcall("하나", "둘", "셋");
	// testcall("셋");
	// testcall("하나", "둘", "셋", "하하");

public void test3() {
	String[] arr = new String[] {"하나", "둘", "셋", "넷"};
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
}	

public static void main(String[] args) {
	System.out.println("----1번문제-----");
	TestClass t = new TestClass();
	System.out.println(t.test1());
	System.out.println("----2번문제-----");
	System.out.println(t.test2(1, 3));
	System.out.println("----3번문제-----");
	t.test3();
}
	

}

