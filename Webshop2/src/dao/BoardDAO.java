package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class BoardDAO {
	
	public ArrayList<BoardObj> getList() throws NamingException, SQLException{
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM board";
			conn = ConnectionPool.get();
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			ArrayList<BoardObj> boards = new ArrayList<BoardObj>();
			
			while(rs.next()) {
				boards.add(new BoardObj(rs.getString("bid"),rs.getString("btitle"),rs.getString("bcontent"),
						rs.getString("bmember"), rs.getString("bdate")));
			} return boards;
			
		} finally {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
	}
	
	
	public int insert(String btitle, String bcontent, String bmember
			) throws NamingException, SQLException{
			
			Connection conn = null;
			PreparedStatement stmt = null;
			
			
			try {
				String sql = "INSERT INTO board (btitle, bcontent, bmember, bdate)"
						+" VALUES (?,?,?,?)";
				conn = ConnectionPool.get();
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, btitle);
				stmt.setString(2, bcontent);
				stmt.setString(3, bmember);
				stmt.setString(4, LocalDate.now().toString());
				int count = stmt.executeUpdate(); //return이 1이면 데이터 나온거 2이면 아무것도 안된거
				
				return (count == 1) ? 1 : 2;
				
			} finally {
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
			}
			
		}
	
	public BoardObj getDetail(String bid) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM board WHERE bid = ?";
			conn = ConnectionPool.get();
			stmt = conn.prepareStatement(sql);
				stmt.setString(1, bid);
			rs = stmt.executeQuery();
			
			rs.next();
			
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String filename = rs.getString(4);
			String date = rs.getString(5);
			
			BoardObj board = new BoardObj(id, title, content, filename, date);
			
			return board;
			
		} finally {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
			
		}
		
		
		
	}
}
