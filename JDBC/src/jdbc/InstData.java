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
			// JDBC Driver ���
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// ����
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nscott", "root", "mbc1234");
			
			// �Ű�����ȭ�� SQL�� �ۼ�
			String sql = "INSERT INTO employees (id, pass, name)" + "VALUES(?,?,?)";
			
			// PreparedStatement ��� �� �� ����
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "woojin");
			pstmt.setString(2, "1111");
			pstmt.setString(3, "����");
			pstmt.setString(1, "������");
			pstmt.setString(2, "3333");
			pstmt.setString(3, "ŷ����");
			
			// SQL�� ����
			int reCnt = pstmt.executeUpdate();
			System.out.println("ó����� Ƚ�� = " + reCnt);
			
			// PreparedStatement �ݱ�
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// ���� ����
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
