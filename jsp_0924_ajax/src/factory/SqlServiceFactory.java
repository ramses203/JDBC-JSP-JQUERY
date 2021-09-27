package factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlServiceFactory {
	private static SqlSessionFactory factory;
	static {
		//MyBatis �ٽɼ������Ͽ���
		// MYBATIS���ٰ�ü�� ������ SqlSessionFactory�� �����Ѵ�.
		try (Reader reader = Resources.getResourceAsReader("config/config.xml");){
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
