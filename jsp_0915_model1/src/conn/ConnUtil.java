
package conn;
//1. JNDI - name���� ����� jdbc/myoraã�´�.
//2. DataSource ��ȯ �޾Ƽ� 
//3. Connection Pool���� Connection �� ��ȯ���ִ� �޼��带 ���� 

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnUtil {

	private static DataSource ds;
	
	static {
		try {
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myora");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	// JDBC �۾��� ConnUtil.getConnection()�� ȣ���ؼ� ConnectionPool�κ���
	// Connection�� �����ͼ� ����� �� �ִ�.
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
}
