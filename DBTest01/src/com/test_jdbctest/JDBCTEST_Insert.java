package com.test_jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTEST_Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. ����̹� ����
		Class.forName("oracle.jdbc.driver.OracleDriver");

		
		// 2. ���� ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		Connection con = DriverManager.getConnection(url, user, password);

		
		// 3. ���� �غ�
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ �Է� : ");
		int no = sc.nextInt();
		System.out.println("�̸� �Է� : ");
		String name = sc.next();
		System.out.println("���� �Է� : ");
		String nickname = sc.next();

		Statement stmt = con.createStatement();
		String sql = " INSERT INTO JDBCTEST "
				+ " VALUES(" + no + ",'" + name + "','" + nickname + "') ";
		
		
		// 4. ���� �� ����
		
		int res = stmt.executeUpdate(sql);
		if(res > 0)
			System.out.println("insert ����!!");
		else
			System.out.println("insert ����!!");
		
		
		// 5. db ����
		stmt.close();
		con.close();
		sc.close();
	}
}
