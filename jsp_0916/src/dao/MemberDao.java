package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conn.MyConn;
import vo.MemberDTO;

public class MemberDao {
	private static MemberDao dao;
	private MemberDao() {}
	
	public synchronized static MemberDao getDao() {
		if(dao == null) {
			dao = new MemberDao();
		}
		return dao;
	}
	
	public void inserDemo(MemberDTO vo) {
		StringBuilder sb = new StringBuilder();
		sb.append("insert into MEMBER ");
		sb.append("values(member_seq.nextval,?,?,?,?,sysdate,?)");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = MyConn.getConn();
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setInt(4, vo.getAge());
			pstmt.setString(5, vo.getTel());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {if (pstmt != null)pstmt.close();} catch (SQLException e) {}
			try {if (con != null)con.close();} catch (SQLException e) {}
		}
	}
	// 게시물 조회 
/*	public ArrayList<MemberDao> list(){
		StringBuffer sql = new StringBuffer();
		sql.append("select no, title, writer, hit, regdate ");
		sql.append("from board order by 1 desc");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberDTO> boardList = new ArrayList<MemberDTO>();
		try{
			con = MyConn.getConn();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				MemberDTO vo = new MemberDTO();
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
			con = MyConn.getConn();
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
	public MemberDTO info(int no) {
		StringBuffer sql = new StringBuffer();
		sql.append("select no, title, writer, content, pwd, hit, regdate ");
		sql.append("from board ");
		sql.append("where no = ? ");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDTO vo = null;
		try {
			con = MyConn.getConn();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()){
				vo = new MemberDTO();
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
	public void update(MemberDTO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("update board ");
		sql.append("set title=?, writer=?, content=?, pwd=? ");
		sql.append("where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = MyConn.getConn();
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
			con = MyConn.getConn();
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
	*/
}
