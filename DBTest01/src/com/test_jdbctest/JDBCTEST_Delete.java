package com.test_jdbctest;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import common.JDBCTemplate;

public class JDBCTEST_Delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호 : ");
		int no = sc.nextInt();

		// 1
		// 2
		Connection con = getConnection();
		Statement stmt = null;
		int res = 0;
		String sql = " DELETE FROM JDBCTEST WHERE NO = " + no;

		// 3
		try {
			stmt = con.createStatement();

			// 4
			res = stmt.executeUpdate(sql);

			if (res > 0) {
				System.out.println("삭제 성공!!");
				commit(con);
			} else {
				System.out.println("0개의 row가 삭제됨;;");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 5
			close(stmt);
			close(con);
		}


	}
}
