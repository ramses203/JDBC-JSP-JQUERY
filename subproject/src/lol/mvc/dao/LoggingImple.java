package lol.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lol.mvc.dto.MyLoginLoggerDTO;

@Repository
public class LoggingImple implements LoggingInter{
	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public void addLoginLogging(MyLoginLoggerDTO vo) {
		ss.insert("log.logger_in", vo);
		
	}

	@Override
	public List<MyLoginLoggerDTO> logging(String id) {
		return ss.selectList("log.logging", id);
	}
	
	
}
