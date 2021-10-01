package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.MyConn;
import vo.BoardVO;

public class BoardDao {

	private static BoardDao dao;
	private BoardDao() {}
	public synchronized static BoardDao getDao() {
		if(dao == null)
			dao = new BoardDao();
		return dao;
	}
	
	public void insert(BoardVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into board ");
		sql.append("values(board_seq.nextval, ?, ?, ?, ?, 0, sysdate)");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = MyConn.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getPwd());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
		
	}
	
	public ArrayList<BoardVO> list(){
		StringBuffer sql = new StringBuffer();
		sql.append("select no, title, writer, hit, regdate ");
		sql.append("from board order by 1 desc ");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardVO> boardList = new ArrayList<BoardVO>();
		
		try {
			con = MyConn.getDs();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setHit(rs.getInt("hit"));
				vo.setRegdate(rs.getString("regdate"));
			    boardList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {if (rs != null)rs.close();} catch (SQLException e) {}
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
		return boardList;
	}
	
	public void hti(int no) {
		StringBuffer sql = new StringBuffer();
		sql.append("update board ");
		sql.append("set hti = hit + 1 ");
		sql.append("where no = ? ");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = MyConn.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
	}
	
	public BoardVO info(int no){
		StringBuffer sql = new StringBuffer();
		sql.append("select no, title, writer, content, pwd, hit, regdate ");
		sql.append("from board ");
		sql.append("where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO vo = null;
		
		try {
			con = MyConn.getDs();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
				if(rs.next()) {
				vo = new BoardVO();
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setContent(rs.getString("content"));
				vo.setPwd(rs.getString("pwd"));
				vo.setHit(rs.getInt("hit"));
				vo.setRegdate(rs.getString("regdate"));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {if (rs != null)rs.close();} catch (SQLException e) {}
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
		return vo;
	}
	
	public void update(BoardVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("update board ");
		sql.append("set title=?, writer=?, content=?, pwd=? ");
		sql.append("where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = MyConn.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getPwd());
			pstmt.setInt(5, vo.getNo());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
		
	}
	
	public void delete(int no) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete board ");
		sql.append("where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = MyConn.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
		
	}
	
	public int pwdCnt (BoardVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("select count(*) cnt from ");
		sql.append(" board where pwd=? and no=? ");
		sql.append("where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = MyConn.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getPwd());
			pstmt.setInt(2, vo.getNo());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {if (rs != null)rs.close();} catch (SQLException e) {}
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
		return 0;
	}
	
	
}
