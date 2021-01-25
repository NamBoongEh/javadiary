package jdbcTest;

import java.sql.*;

public class jdbcTest {

public static void main(String[] args) {

String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";

String DB_USER = "student"; // DB의 userid와 pwd를 알맞게 변경

String DB_PASSWORD = "1234";

Connection conn = null;

Statement stmt = null;

ResultSet rs = null;

String query = "SELECT sysdate FROM dual"; // 시스템의 날짜를 출력한다.

try {

// 드라이버를 로딩한다.

Class.forName("oracle.jdbc.driver.OracleDriver");

conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); // 데이터베이스의 연결을 설정한다.

stmt = conn.createStatement(); // Statement를 가져온다.

rs = stmt.executeQuery(query); // SQL문을 실행한다.

while (rs.next()) {

String curDate = rs.getString(1);

System.out.println(curDate);

}

} catch ( Exception e ) {

e.printStackTrace();

} finally {

try {

rs.close();

stmt.close();

conn.close();

} catch ( SQLException e ) {}

}

} // main()의 끝

} // 클래스의 끝
