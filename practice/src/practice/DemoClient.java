package practice;

import java.net.Socket;

public class DemoClient {

	public static void main(String[] args) {
		
		Socket sk new Socket("127.0.0.1", 5050);
		System.out.println("서버와 접속이 되었습니다.");
		
		
	}
	
}
