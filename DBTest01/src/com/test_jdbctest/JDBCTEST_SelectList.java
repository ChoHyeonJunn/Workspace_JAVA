package com.test_jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTEST_SelectList {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Driver ����
		// ojdbc6.jar ���̺귯�� �߰� - oracle.jdbc.driver ��Ű�� - OracleDriver Ŭ����
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		// 2. ���� ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		//Data Source Explorer - Database Connections - My Oracle - properties - Driver Properties - Connection URL
		Connection con = DriverManager.getConnection(url, user, password);

		
		// 3. Query �غ�
		Statement stmt = con.createStatement();
		String sql = " SELECT * FROM JDBCTEST ";	//������ ������ ���� �� �ڸ� �������~!
		
		
		// 4. ���� �� ����
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
							+ rs.getString(3));
		}
		
		// 5. DB ����
		rs.close();
		stmt.close();
		con.close();
	}
}
