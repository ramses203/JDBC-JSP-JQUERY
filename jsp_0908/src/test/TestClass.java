package test;

import java.lang.reflect.Array;

public class TestClass {
	int x;
	int y;
	Array arr;
	
//test1: ��ȯ���� �ִ� �޼��� �����
	//��: test() ȣ���ϸ� Ư�� ���� ��ȯ�ϸ� ��
	
int test1() {
		return 1;
	}

//test2: ���ڰ� �ϳ� �̻��̸鼭 ��ȯ���� �ִ� �޼��� �����
	//��: test(10, "hello")

 int test2(int x, int y) {
		this.x = x;
		this.y = y;
		return x+y;
	}

//test3: ������ ���� ��� ���ڿ��� ���� �� �� ���� ����ϴ� �޼��� �����-�޼��� �ϳ��� �ذ� (void)
	//��: testcall("�ϳ�", "��");
	// testcall("�ϳ�", "��", "��");
	// testcall("��");
	// testcall("�ϳ�", "��", "��", "����");

public void test3() {
	String[] arr = new String[] {"�ϳ�", "��", "��", "��"};
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
}	

public static void main(String[] args) {
	System.out.println("----1������-----");
	TestClass t = new TestClass();
	System.out.println(t.test1());
	System.out.println("----2������-----");
	System.out.println(t.test2(1, 3));
	System.out.println("----3������-----");
	t.test3();
}
	

}

