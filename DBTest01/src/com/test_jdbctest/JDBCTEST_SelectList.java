package com.test_jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTEST_SelectList {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Driver 연결
		// ojdbc6.jar 라이브러리 추가 - oracle.jdbc.driver 패키지 - OracleDriver 클래스
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		//Data Source Explorer - Database Connections - My Oracle - properties - Driver Properties - Connection URL
		Connection con = DriverManager.getConnection(url, user, password);

		
		// 3. Query 준비
		Statement stmt = con.createStatement();
		String sql = " SELECT * FROM JDBCTEST ";	//복잡한 쿼리를 위해 앞 뒤를 띄어주자~!
		
		
		// 4. 실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
							+ rs.getString(3));
		}
		
		// 5. DB 종료
		rs.close();
		stmt.close();
		con.close();
	}
}
