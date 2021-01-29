package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOTest5 {

	public static void main(String[] args) {
		// 객체 u에 저장된 user_id와 동일한 행의 정보를 delete하는 메서드

		deleteUser("ff22f");
		
	}
	static int deleteUser(String userId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "student";
			String pw = "1234";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			
			System.out.println("연결 성공!");
			
			String sql = "delete from USER_INFO where USER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			System.out.println("삭제 성공!");
			
			int result = pstmt.executeUpdate();
			return result;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패ㅠㅠ");
		}
		finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				}
				catch(SQLException sqle) {
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				}
				catch(SQLException sqle) {
				}
			}
		}
		return 0;
	}
}