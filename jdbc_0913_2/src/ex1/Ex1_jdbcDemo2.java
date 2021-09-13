package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex1_jdbcDemo2 {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	// 자주 중복적으로 사용되는 동작을 메서드로 분리함!
	public static Connection getMyConn() throws SQLException{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kosmo91";
		String password = "kosmo9191";
		return DriverManager.getConnection(url, user, password);
	}
	
	//String id, String pwd, String name, int age
		public void inserDemo(String id, String pwd, String name, int age) {
			//? 1부터 시작되어서 바인딩 된다.
			StringBuilder sb = new StringBuilder();
			sb.append("insert into member values(");
			sb.append("member_seq.nextVal,?,?,?,?,sysdate)");
			System.out.println(sb);
			//step1. Connection
			Connection con = null;
			PreparedStatement psmt = null;
			
			
			try {
				con = getConnection();
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
		
		private static void addUi(Scanner sc, Ex1_jdbcDemo2 ref) {
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
		
		private void printList() {
			Connection con = null;
			PreparedStatement psmt = null;
			// select 쿼리의 수행결과의 집합과 결과 집학에서 데이터를 
			// 추출할수있는 메소드를 가지고 있는 객체 (커서를 반환받는 객체)
			ResultSet rs = null;
			StringBuilder sb = new StringBuilder();
			sb.append("select num,id,name,age,to_char(mdate,'yyyy-mm-dd') mdate");
			sb.append("from member order by 1 desc");
			con = getMyConn(url, user, password)
		}
		
		public static void main(String[] args) {
			//UIClass 만들기
			Scanner sc = new Scanner(System.in);
			Ex1_jdbcDemo2 ref = new Ex1_jdbcDemo2();
			ext: while(true) {
				System.out.println("Menu1:입력, Menu2:출력, Menu3:종료 =>");
				String menu = sc.nextLine();
				switch (menu) {
				case "1":
					System.out.println("입력 모드");
					addUi(sc, ref);
					break;
				case "2":
					System.out.println("출력 모드");
					ref.printList();
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
