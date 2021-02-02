package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DAOTest8 {

	public static void main(String[] args) {
		UserDao udao = new UserDao();
//		List<User8> list = udao.selectAllUsers();
//		System.out.println(list);
	} //main()의 끝
} // 클래스의 끝

class Dao{
	Connection conn;
	String tableName = "";
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	Dao(){
		this(null, "");
	}
	
	Dao(String tableName){
		this(null, tableName);
	}
	
	Dao(Connection conn, String tableName){
		this.tableName = tableName;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "student";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection(url, id, pw);
			System.out.println("연결 성공!^-^b");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패ㅠㅠ");
		}
	}
	
	void rollback() {
		if(conn!=null) {
			try {
				conn.rollback();
			}
			catch(SQLException e) {
				e.printStackTrace();
				System.out.println("롤백 실패ㅠㅠ");
			}
		}
	}
	
	void close(AutoCloseable acs) {
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
	
	class UserDao extends Dao{
		
	}
}

class User8{
}