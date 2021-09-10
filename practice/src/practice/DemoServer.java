package practice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer {

	public static void main(String[] args) throws IOException {
		
		int port = 5050;
		
		//서버 소켓을 생성

		ServerSocket ssk = new ServerSocket(port);
		
		System.out.println("접속 대기중");
		
		while(true) {
			Socket sock = ssk.accept();
			System.out.println("사용자 접속 했습니다.");
			System.out.println("Client ip : " + sock.getInetAddress());
		}
		
	}
	
}
