package factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlServiceFactory {
	
	private static SqlSessionFactory factory; 	// �տ��ִ� ��ü�� �����ϰ� �������ִ� ��ü�� ���鶧�� factory��� �ܾ ����. (Object Factory�� ������ ����Ѵ�.)
	static {
																// ibatis�� Resources�� ����ϰ�  ���ڿ��� �̷緯�� config.xml�� �о���̱� ���ؼ� getResourceAsReader()�޼��带 ����.
																//���ۼ��ϸ� ���� ó���϶�� �����µ� Ŭ���ؼ� ����ó���ϸ� �ȴ�. ��ȯ���� reader�̱� ������ Reader�� ������ ��Ƽ�  ����Ѵ�.(reader���� ���������̶� ������ 2����Ʈ�� �����´�.)
																//�ٵ� �̰� �׳� ���� �Ǹ� finally�� �ۼ�������ϱ� ������ try���� �Ұ�ȣ�� ��� �ű�ȿ��ٰ� �ۼ����ش� �׷� finally �ۼ� �����൵ �ȴ�.
		try (Reader reader = Resources.getResourceAsReader("config/config.xml");) {
			factory = new SqlSessionFactoryBuilder().build(reader);//MyBatis ���ٰ�ü�� ������ SqlSessionFactory�� �����Ѵ�.
		} catch (IOException e) {								
			e.printStackTrace();
		}   
	}															
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
