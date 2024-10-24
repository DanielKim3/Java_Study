package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InstData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			// JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nscott", "root", "mbc1234");
			
			// 매개변수화된 SQL문 작성
			String sql = "INSERT INTO employees (id, pass, name)" + "VALUES(?,?,?)";
			
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "woojin");
			pstmt.setString(2, "1111");
			pstmt.setString(3, "우진");
			pstmt.setString(1, "우지니");
			pstmt.setString(2, "3333");
			pstmt.setString(3, "킹우진");
			
			// SQL문 실행
			int reCnt = pstmt.executeUpdate();
			System.out.println("처리결과 횟수 = " + reCnt);
			
			// PreparedStatement 닫기
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 연결 끊기
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
