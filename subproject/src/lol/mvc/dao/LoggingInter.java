package lol.mvc.dao;

import java.util.List;

import lol.mvc.dto.MyLoginLoggerDTO;

public interface LoggingInter {
	public void addLoginLogging(MyLoginLoggerDTO vo);
	public List<MyLoginLoggerDTO> logging(String id);
	
}
