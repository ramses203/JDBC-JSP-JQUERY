package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex1_jdbcDemo2 {

	public Ex1_jdbcDemo2() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void inserDemo(int temp1, int temp2, int temp3, int temp4, int temp5, int temp6) {
		StringBuilder sb = new StringBuilder();
		sb.append("insert into temp values(");
		sb.append("temp_seq.nextVal,?,?,?,?,?,?)");
		System.out.println(sb);
		// step1. Connection
		Connection con = null;
		PreparedStatement psmt = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kosmo91_2";
		String password = "kosmo9191";
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection!" + con);
			// step2. Query 전송
			psmt = con.prepareStatement(sb.toString());
			// step3. Query binding 및 실행
			psmt.setInt(1, temp1);
			psmt.setInt(2, temp2);
			psmt.setInt(3, temp3);
			psmt.setInt(4, temp4);
			psmt.setInt(5, temp5);
			psmt.setInt(6, temp6);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void addUi(Scanner sc, Ex1_jdbcDemo2 ref) {

		System.out.println("temp1 =>");
		int temp1 = Integer.parseInt(sc.nextLine());
		System.out.println("temp2 =>");
		int temp2 = Integer.parseInt(sc.nextLine());
		System.out.println("temp3 =>");
		int temp3 = Integer.parseInt(sc.nextLine());
		System.out.println("temp4 =>");
		int temp4 = Integer.parseInt(sc.nextLine());
		System.out.println("temp5 =>");
		int temp5 = Integer.parseInt(sc.nextLine());
		System.out.println("temp6 =>");
		int temp6 = Integer.parseInt(sc.nextLine());
		ref.inserDemo(temp1, temp2, temp3, temp4, temp5, temp6);
		System.out.println("입력완료!");

	}

	public static void main(String[] args) {
		// UIClass 만들기
		Scanner sc = new Scanner(System.in);
		Ex1_jdbcDemo2 ref = new Ex1_jdbcDemo2();
		ext: while (true) {
			System.out.println("Menu1:입력, Menu2:출력, Menu3:종료 =>");
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
				System.out.println("종료 모드");
				break ext;

			default:
				break;
			}
		}

	}
}
