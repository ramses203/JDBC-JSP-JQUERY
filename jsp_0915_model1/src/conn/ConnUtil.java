
package conn;
//1. JNDI - name으로 명시한 jdbc/myora찾는다.
//2. DataSource 반환 받아서 
//3. Connection Pool에서 Connection 을 반환해주는 메서드를 정의 

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
	// JDBC 작업시 ConnUtil.getConnection()를 호출해서 ConnectionPool로부터
	// Connection을 가져와서 사용할 수 있다.
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
}
