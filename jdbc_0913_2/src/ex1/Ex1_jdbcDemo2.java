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
	// ���� �ߺ������� ���Ǵ� ������ �޼���� �и���!
	public static Connection getMyConn() throws SQLException{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kosmo91";
		String password = "kosmo9191";
		return DriverManager.getConnection(url, user, password);
	}
	
	//String id, String pwd, String name, int age
		public void inserDemo(String id, String pwd, String name, int age) {
			//? 1���� ���۵Ǿ ���ε� �ȴ�.
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
				// step2. Query ����
				psmt = con.prepareStatement(sb.toString());
				// step3. Query binding �� ����
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
			System.out.println("�Է¿Ϸ�!");
		
		}
		
		private void printList() {
			Connection con = null;
			PreparedStatement psmt = null;
			// select ������ �������� ���հ� ��� ���п��� �����͸� 
			// �����Ҽ��ִ� �޼ҵ带 ������ �ִ� ��ü (Ŀ���� ��ȯ�޴� ��ü)
			ResultSet rs = null;
			StringBuilder sb = new StringBuilder();
			sb.append("select num,id,name,age,to_char(mdate,'yyyy-mm-dd') mdate");
			sb.append("from member order by 1 desc");
			con = getMyConn(url, user, password)
		}
		
		public static void main(String[] args) {
			//UIClass �����
			Scanner sc = new Scanner(System.in);
			Ex1_jdbcDemo2 ref = new Ex1_jdbcDemo2();
			ext: while(true) {
				System.out.println("Menu1:�Է�, Menu2:���, Menu3:���� =>");
				String menu = sc.nextLine();
				switch (menu) {
				case "1":
					System.out.println("�Է� ���");
					addUi(sc, ref);
					break;
				case "2":
					System.out.println("��� ���");
					ref.printList();
					break;
				case "3":
					System.out.println("���� ���");
					break ext;

				default:
					break;
				}
			}
			
			
			
		}
	}
