package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient extends Thread{
	
	private Socket socket;
	private PrintWriter printWriter;
	private BufferedReader bufferedReader;
	private Scanner scanner;
	
	
	public ChatClient() {
		try {
			socket = new Socket("localhost",9999);
			scanner = new Scanner(System.in);
			System.out.println("서버 접속 완료 !");
			bufferedReader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			printWriter = new PrintWriter(socket.getOutputStream(),true);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				String msg = bufferedReader.readLine();
				System.out.println("==>" + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ChatClient cc = new ChatClient();
		cc.start();
		while(true) {
			System.out.println("입력 : ");
			String msg = cc.scanner.nextLine();
			cc.printWriter.println(msg);
		}
		
		
	}

}













