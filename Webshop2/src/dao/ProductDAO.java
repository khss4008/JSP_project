package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class ProductDAO {
	
	public ArrayList<ProductObj> getList() throws NamingException, SQLException{
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT pid, pname, pdescription, pprice, pfilename "
					+ "FROM product";
			conn = ConnectionPool.get();
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			ArrayList<ProductObj> products = new ArrayList<ProductObj>();
			
			while(rs.next()) {
				products.add(new ProductObj(rs.getString("pid"),rs.getString("pname"),rs.getString("pdescription")
						,rs.getString("pprice"),rs.getString("pfilename")));
			} return products;
		} finally {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
	}
	
	
	public int insert(String pid, String pname, String pdescription, String pprice, String pfname
			) throws NamingException, SQLException{
			
			Connection conn = null;
			PreparedStatement stmt = null;
			
			
			try {
				String sql = "INSERT INTO product (pid, pname, pdescription, pprice, pfilename)"
						+" VALUES (?,?,?,?,?)";
				conn = ConnectionPool.get();
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, pid);
				stmt.setString(2, pname);
				stmt.setString(3, pdescription);
				stmt.setString(4, pprice);
				stmt.setString(5, pfname);
				int count = stmt.executeUpdate(); //return이 1이면 데이터 나온거 2이면 아무것도 안된거
				
				return (count == 1) ? 1 : 2;
				
			} finally {
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
			}
			
		}
	
	
	public ProductObj getDetail(String sid) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM product WHERE pid = ?";
			conn = ConnectionPool.get();
			stmt = conn.prepareStatement(sql);
				stmt.setString(1, sid);
			rs = stmt.executeQuery();
			
			rs.next();
			
			String pid = rs.getString(1);
			String pname = rs.getString(2);
			String pdescription = rs.getString(3);
			String pprice = rs.getString(4);
			String pfilename = rs.getString(5);
			
			ProductObj product = new ProductObj(pid, pname, pdescription, pprice, pfilename);
			
			return product;
			
		} finally {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
			
		}
		
		
		
	}
	
	public int delete(String id) throws NamingException, SQLException{
			
			Connection conn = null;
			PreparedStatement stmt = null;
			
			
			try {
				String sql = "DELETE FROM product WHERE pid = ?";

				conn = ConnectionPool.get();
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, id);
				
				int count = stmt.executeUpdate(); //return이 1이면 데이터 나온거 2이면 아무것도 안된거
				return (count == 1) ? 1 : 2;
				
			} finally {
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
			}
			
		}
	
	
	
	
}
