package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerClient extends Thread{

	private Ex2_ServerTest server;
	private Socket s;
	private PrintWriter out;
	private BufferedReader input;
	public ServerClient(Ex2_ServerTest server, Socket s) {
		this.server = server;
		this.s = s;
		
	}
	@Override
	public void run() {
		while(true) {
			try {
			input = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(),true);
			System.out.println("client run");	
			String msg = input.readLine(); //blocking
			} catch (IOException e) {
			e.printStackTrace();
			}
			
		}
		
	}
	public PrintWriter getOut() {
		return out;
	}
}
