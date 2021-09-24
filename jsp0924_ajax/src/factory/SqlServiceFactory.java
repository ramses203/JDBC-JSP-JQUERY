package factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlServiceFactory {
	private static SqlSessionFactory factory;
	static {
		//MyBatis 핵심성정파일에서
		// MYBATIS접근객체를 제공할 SqlSessionFactory를 생성한다.
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
