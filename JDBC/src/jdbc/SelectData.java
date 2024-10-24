package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nscott", "root", "mbc1234");
			
			String sql = " " + "SELECT id, pass, name " + "FROM employees " + "WHERE id=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "우지니");
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getString("id"));
				emp.setPass(rs.getString("pass"));
				emp.setName(rs.getString("name"));
				System.out.println(emp);				
			} else {
				System.out.println("사용자 아이디 존재하지 않음");
			}
			rs.close();
			
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
