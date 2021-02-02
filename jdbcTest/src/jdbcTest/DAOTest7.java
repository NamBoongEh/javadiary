package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOTest7 {

	public static void main(String[] args) {
		UserDao udao = UserDao.getInstance();
		List<User7> list = udao.selectAllUsers();
		System.out.println(list);
	}
}

class UserDao{
	private static UserDao instance;
	
	// UserDao 생성자
	private UserDao() {
	}
	
	// getInstance() 메서드 정의
	public static UserDao getInstance() {
		if(instance==null) {
			instance = new UserDao();
		}
		return instance;
	}
	
	List<User7> selectAllUsers(){
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	User7 u = null;
	ArrayList<User7> list = new ArrayList<User7>();

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
				String user_id = rs.getString("user_id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String email = rs.getString("email");
				
				u = new User7(user_id, password, name, email);
				list.add(u);
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
		
		
		return list;
	}
}

class User7{
	String id;
	String name;
	String password;
	String email;

	public User7(String id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}