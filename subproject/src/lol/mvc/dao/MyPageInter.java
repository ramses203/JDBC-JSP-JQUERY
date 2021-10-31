package lol.mvc.dao;

import java.util.List;
import java.util.Map;

import lol.mvc.dto.PageVO;
import lol.mvc.dto.PlayVO;

public interface MyPageInter {

	public List<Map<String,String>> myChampList(String id);
	public List<Map<String,String>> myStatDateList(String myid);
	public List<Map<String, String>> mydetailList(PageVO pagevo);
	public List<Map<String, String>> mytier(String myid);
	
	//∆‰¿Ã¬°
	public int getTotalCount(String myid);
}
