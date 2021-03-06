package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.ConnUtil;
import dto.BoardDTO;

public class BoardDao {
	private static BoardDao dao;
	private BoardDao() {}
	public synchronized static BoardDao getDao() {
		if(dao == null) {
			dao = new BoardDao();
		}
		return dao;
	}
	public void insert(BoardDTO vo) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into board ");
		sql.append("values(board_seq.nextval, ?, ?, ?, ?, 0, sysdate)");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
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
	// 게시물 조회 
	public ArrayList<BoardDTO> list(){
		StringBuffer sql = new StringBuffer();
		sql.append("select no, title, writer, hit, regdate ");
		sql.append("from board order by 1 desc");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardDTO> boardList = new ArrayList<BoardDTO>();
		try{
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				BoardDTO vo = new BoardDTO();
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setHit(rs.getInt("hit"));
				vo.setRegdate(rs.getString("regdate"));
				boardList.add(vo);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {if (rs != null)rs.close();} catch (SQLException e) {}
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
		return boardList;
	}
	//조회수 증가 : update board set hit = hit + 1 where no=?
	// 위의 명령어를 보고 적당한 메서드를 정의 하세요.
	public void hit(int no){
		StringBuffer sql = new StringBuffer();
		sql.append("update board ");
		sql.append("set hit = hit + 1 ");
		sql.append("where no = ? ");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) { }
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
	}
	// 다음 쿼리가 수행 한  데이터를  DTO 담아서 반환하는  메서드를 만드세요 , 인자값은 PK
	// select no,title,writer, content, pwd, hit, regdate from board where no = ?
	public BoardDTO info(int no) {
		StringBuffer sql = new StringBuffer();
		sql.append("select no, title, writer, content, pwd, hit, regdate ");
		sql.append("from board ");
		sql.append("where no = ? ");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDTO vo = null;
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()){
				vo = new BoardDTO();
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
	// update board set title=? , writer=?, content=?, pwd=? where no=?
	// update : 메서드 이름 
	public void update(BoardDTO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("update board ");
		sql.append("set title=?, writer=?, content=?, pwd=? ");
		sql.append("where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getPwd());
			pstmt.setInt(5, vo.getNo());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
	}
	// delete from board where no = ?
	// 메서드 이름 :  delete 
	public void delete(int no) { 
		StringBuffer sql = new StringBuffer();
		sql.append("delete board ");
		sql.append("where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
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
}






