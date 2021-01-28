package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOTest3 {

	public static void main(String[] args) {
		User3 u = new User3("ff22f", "홍길동", "4444", "aaa@aaa.com");
		System.out.println(u);
		
		//객체 u에 저장된 user_id와 동일한 행의 정보를 update하는 메서드
		updateUser(u);
	}
	
	static int updateUser(User3 u) {
		// conn pstmt 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// sql의 url, id, pwd 입력
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "student";
			String pwd = "1234";
			
			// sql쓰면 무조건 써야하는 데이터베이스 연동
			// 선생님이 참고하라고 주신 블로그의 
			// com.mysql.jdbc.Driver는 jdbc.driver.OracleDrvier보다 최신버전이다!
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공! ^-^b");	

			pstmt = conn.prepareStatement("update USER_INFO set PASSWORD=?, NAME=?, EMAIL=? where USER_ID=?");
			
			// 쿼리의 ? 순서대로 1번 2번 3번 4번이 된다. 즉, 위의 커리에서 PASSWORD는 1번이 되고, USER_ID는 4번이 된다.
			pstmt.setString(4, u.id);
			pstmt.setString(1, u.password);
			pstmt.setString(2, u.name);
			pstmt.setString(3, u.email);
			
			return pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패ㅠㅠ");
			return 0;

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
	}
}


// !!!! 늘 같은 이름의 class가 있지않은지 확인하기!
class User3{
	String id;
	String name;
	String password;
	String email;
	
	public User3(String id, String name, String password, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
}
