package com.test_jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTEST_Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. 드라이버 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");

		
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		Connection con = DriverManager.getConnection(url, user, password);

		
		// 3. 쿼리 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력 : ");
		int no = sc.nextInt();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("별명 입력 : ");
		String nickname = sc.next();

		Statement stmt = con.createStatement();
		String sql = " INSERT INTO JDBCTEST "
				+ " VALUES(" + no + ",'" + name + "','" + nickname + "') ";
		
		
		// 4. 실행 및 리턴
		
		int res = stmt.executeUpdate(sql);
		if(res > 0)
			System.out.println("insert 성공!!");
		else
			System.out.println("insert 실패!!");
		
		
		// 5. db 종료
		stmt.close();
		con.close();
		sc.close();
	}
}
