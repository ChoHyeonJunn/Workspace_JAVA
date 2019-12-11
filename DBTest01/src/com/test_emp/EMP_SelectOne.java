package com.test_emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EMP_SelectOne {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. Driver ����
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. ���� ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Query �غ�
		Scanner sc = new Scanner(System.in);
		System.out.println("DEPTNO �Է� (10/20/30/40) : ");
		int deptno = sc.nextInt();
		
		Statement stmt = con.createStatement();
		String sql = " SELECT DEPTNO, DNAME, LOC" 
					+ " FROM DEPT " 
					+ " WHERE DEPTNO = " + deptno;

		// 4. ���� �� ����
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}

		// 5. DB ����
		rs.close();
		stmt.close();
		con.close();

		sc.close();
	}
}
