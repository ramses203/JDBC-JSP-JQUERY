package factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlServiceFactory {
	
	private static SqlSessionFactory factory; 	// 앞에있는 객체를 생성하고 관리해주는 객체를 만들때는 factory라는 단어를 쓴다. (Object Factory의 패턴을 사용한다.)
	static {
																// ibatis의 Resources를 사용하고  문자열로 이루러진 config.xml을 읽어들이기 위해서 getResourceAsReader()메서드를 쓴다.
																//다작성하면 예외 처리하라고 나오는데 클릭해서 예외처리하면 된다. 반환형이 reader이기 때문에 Reader형 변수에 담아서  사용한다.(reader형은 문자전용이라서 빠르게 2바이트씩 가져온다.)
																//근데 이걸 그냥 쓰게 되면 finally를 작성해줘야하기 때문에 try옆에 소괄호를 열어서 거기안에다가 작성해준다 그럼 finally 작성 안해줘도 된다.
		try (Reader reader = Resources.getResourceAsReader("config/config.xml");) {
			factory = new SqlSessionFactoryBuilder().build(reader);//MyBatis 접근객체를 제공할 SqlSessionFactory를 생성한다.
		} catch (IOException e) {								
			e.printStackTrace();
		}   
	}															
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
