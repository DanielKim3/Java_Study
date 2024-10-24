package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nscott", "root", "mbc1234");
			
			String sql = new StringBuilder()
				.append("UPDATE employees SET ")				
				.append("pass=?, ")
				.append("name=? ")
				.append("WHERE id=?")
				.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, "3333");
			pstmt.setString(2, "우지지지");
			pstmt.setString(3, "우지니");
			
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수: " + rows);
			
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
