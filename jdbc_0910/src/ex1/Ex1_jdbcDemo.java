package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex1_jdbcDemo {

	public Ex1_jdbcDemo() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void inserDemo(String id, String pwd, String name, int age) {
		StringBuilder sb = new StringBuilder();
		sb.append("insert into member values(");
		sb.append("member_seq.nextVal,?,?,?,?,sysdate)");
		System.out.println(sb);
		//step1. Connection
		Connection con = null;
		PreparedStatement psmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kosmo91";
		String password = "kosmo9191";
		try {
			con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection!"+con);
			// step2. Query 전송
			psmt = con.prepareStatement(sb.toString());
			// step3. Query binding 및 실행
			psmt.setString(1, id);
			psmt.setString(2, pwd);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null) psmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void addUi(Scanner sc, Ex1_jdbcDemo ref) {
		System.out.println("id =>");
		String id = sc.nextLine();
		System.out.println("pwd =>");
		String pwd = sc.nextLine();
		System.out.println("name =>");
		String name = sc.nextLine();
		System.out.println("age =>");
		int age = Integer.parseInt(sc.nextLine());
		ref.inserDemo(id, pwd, name, age);
		System.out.println("입력완료!");
	
	}
	
	public static void main(String[] args) {
		//UIClass 만들기
		Scanner sc = new Scanner(System.in);
		Ex1_jdbcDemo ref = new Ex1_jdbcDemo();
		ext: while(true) {
			System.out.println("Menu1:입력, Menu2:출력, Munu3:종료 =>");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.println("입력 모드");
				addUi(sc, ref);
				break;
			case "2":
				System.out.println("출력 모드");
				break;
			case "3":
				System.out.println("종료");
				break ext;

			default:
				break;
			}
		}
		
		
		
	}
}
