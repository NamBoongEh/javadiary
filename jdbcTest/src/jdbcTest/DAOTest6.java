package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DAOTest6 {

	public static void main(String[] args) {

		List<User> list = selectAllUsers();
		System.out.println(list);
		
	}
	
	static List<User> selectAllUsers(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "student";
			String pw = "1234";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			
			System.out.println("연결 성공!^-^b");
			
			String sql = "select * from user_info";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("user_id") + "\t");
				System.out.print(rs.getString("password") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.println(rs.getString("email"));
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패ㅠㅠ");
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				}
				catch(SQLException sqle) {
				}
			}
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
		
		
		return null;
	}

}