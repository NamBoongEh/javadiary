package jdbcTest;

import java.sql.*;

public class DAOTest2 {

	public static void main(String[] args) {
		User2 u = new User2("ff22f", "남궁성", "1234", "aaa@aaa.com");
		System.out.println(u);
		
		insertUser(u); // 객체 u에 저장된 값을 DB의 user_info테이블에 insesrt하는 메서드
	}
	
	static int insertUser(User2 u) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String url = "jdbc:student://localhost:1521/xe"; // 여기에 뭐가 들어가야할까?
			String id = "student";
			String pw = "1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("내가 연결을 했다니 정말 대단해!d^0^b");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			String sql = "insert into member1 values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.id);
			pstmt.setString(2, u.name);
			pstmt.setString(3, u.password);
			pstmt.setString(4, u.email);
			
			pstmt.executeUpdate();
			
			System.out.println("해냈따! 업로드 완료! \\^0^/");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("테이블에 입력 실패함...ㅠㅠ");
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
					pstmt.close();
				}
				catch(SQLException sqle) {
				}
			}
		}
		return 0;
		 
	}

} // end of class

class User2{
	String id;
	String name;
	String password;
	String email;
	
	public User2(String id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
}
