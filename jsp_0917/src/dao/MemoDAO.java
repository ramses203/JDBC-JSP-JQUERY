package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import conn.Myconn;
import dto.MemoDTO;

// �̱��� ���� : �ϳ��� �� ���� ���� ��ü�� �����ؼ� �Ʋ�����
public class MemoDAO {
private static MemoDAO dao;
private MemoDAO() {}
// ����ȭ�� ���� ������ �����尡 ���� getDAO��� �޼��带 ȣ���� �Ϸ�ɶ�����
// �ٸ� �����尡 �������� ���ϵ��� lockpool ���� ��ȣ�� �޴´�. 
public synchronized static MemoDAO getDao() {
	if(dao == null) {
		dao = new MemoDAO();
	}
	return dao;
}

// �Է��۾� insert

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

//����۾��غ���
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
// num���� ���ڷ� �޾Ƽ� �ϳ��� �����͸� ��ȯ�ϴ� �޼��带 �����ϼ���
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
