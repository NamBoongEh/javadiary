package jdbcTest;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAOTest4 {

	public static void main(String[] args) {
		// 객체 u에 저장된 user_id와 동일한 행의 정보를 update하는 메서드
		User4 u = selectUser("ff22f");
		System.out.println(u);
	}
	static User4 selectUser(String userId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String url = "";
			String id = "student";
			String pw = "1234";
			
			
			
		}
		
		return null;
	}
	class User4{
		String id;
		String name;
		String password;
		String email;
		
		public User4(String id, String name, String password, String email) {
			this.id = id;
			this.name = name;
			this.password = password;
			this.email = email;
		}
	}

}
