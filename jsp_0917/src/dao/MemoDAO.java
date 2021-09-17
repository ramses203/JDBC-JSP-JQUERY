package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import conn.Myconn;
import dto.MemoDTO;

// 싱글톤 개념 : 하나만 잘 만들어서 여러 객체가 공유해서 아껴쓰자
public class MemoDAO {
private static MemoDAO dao;
private MemoDAO() {}
// 동기화란 먼저 접근한 쓰레드가 현재 getDAO라는 메서드를 호출이 완료될때까지
// 다른 쓰레드가 접근하지 못하도록 lockpool 에서 보호를 받는다. 
public synchronized static MemoDAO getDao() {
	if(dao == null) {
		dao = new MemoDAO();
	}
	return dao;
}

// 입력작업 insert

public void addMemo(MemoDTO vo) {
	Connection con = null;
	PreparedStatement pstmt = null;
	StringBuilder sb = new StringBuilder();
	sb.append("insert into memo ");
	sb.append("values(memo_seq.nextVal, ?, ?, ?, sysdate)");
	try {
		con = Myconn.getConn();
		pstmt = con.prepareStatement(sb.toString());
		pstmt.setString(1, vo.getMcount());
		pstmt.setString(2, vo.getMwrite());
		pstmt.setString(3, vo.getMip());
		pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
		try {if (con != null)con.close();} catch (SQLException e) {}
	}
	
}

//출력작업해보기
// select * from memo where no = ?
public ArrayList<MemoDTO> arrDTO(){
	ArrayList<MemoDTO> arr = new ArrayList<MemoDTO>();
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuilder sb = new StringBuilder();
	sb.append("select num, mcount, mwrite, mip, ");
	sb.append("to_char(mdate, 'yyyy-mm-dd') mdate from MEMO order by 1 desc");
	try {
		con = Myconn.getConn();
		pstmt = con.prepareStatement(sb.toString());
		rs = pstmt.executeQuery();
		while(rs.next()) {
			MemoDTO vo = new MemoDTO();
			vo.setNum(rs.getInt("num"));
			vo.setMcount(rs.getString("mcount"));
			vo.setMwrite(rs.getString("mwrite"));
			vo.setMip(rs.getString("mip"));
			vo.setMdate(rs.getString("mdate"));
			arr.add(vo);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {if (rs != null)rs.close();} catch (SQLException e) {}
		try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
		try {if (con != null)con.close();} catch (SQLException e) {}
	
	
}
	return arr;
}
// num값을 인자로 받아서 하나의 데이터를 반환하는 메서드를 정의하세요
public MemoDTO detail(int num) {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	MemoDTO vo = null;
	StringBuilder sb = new StringBuilder();
	sb.append("select num, mcount, mwrite, mip, to_char(mdate, 'yyyy-mm-dd') mdate ");
	sb.append("from memo where num=?");
	
	try {
		con = Myconn.getConn();
		pstmt = con.prepareStatement(sb.toString());
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			vo = new MemoDTO();
			vo.setNum(rs.getInt("num"));
			vo.setMcount(rs.getString("mcount"));
			vo.setMwrite(rs.getString("mwrite"));
			vo.setMip(rs.getString("mip"));
			vo.setMdate(rs.getString("mdate"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {if (rs != null)rs.close();} catch (SQLException e) {}
		try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
		try {if (con != null)con.close();} catch (SQLException e) {}
	return vo;
}
}
}
