package ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.print.attribute.standard.Severity;

public class Ex2_ServerTest {

		private ArrayList<ServerClient> arlist;
		private ServerSocket ss;
		public Ex2_ServerTest() {
			try {
				ss = new ServerSocket(9999);
				System.out.println("ServerStart");
				arlist = new ArrayList<>();
				while(true) {
					Socket s = ss.accept();
					ServerClient c = new ServerClient(this, s);
					c.start();
					arlist.add(c);
					System.out.println("접속자 수 : "+arlist.size());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
		public void sendMessage(String message) {
			for(ServerClient n : arlist) {
				n.getOut().println(message);
			} 
		}
		public static void main(String[] args) {
			new Ex2_ServerTest();
		}
		
}
