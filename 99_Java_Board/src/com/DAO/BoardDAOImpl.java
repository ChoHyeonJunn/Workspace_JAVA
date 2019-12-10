package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.VO.BoardVO;

public class BoardDAOImpl implements BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";

	String user = "kh";
	String pw = "kh";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";

	@Override
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(url, user, pw);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void disconnect() {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public ArrayList<BoardVO> select() {
		connect();
		String sql = "SELECT * FROM EMP";

		ArrayList<BoardVO> boardList = new ArrayList<BoardVO>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO board = new BoardVO();

				board.setEMPNO(rs.getInt("EMPNO"));
				board.setENAME(rs.getString("ENAME"));
				board.setJOB(rs.getString("JOB"));
				board.setMGR(rs.getInt("MGR"));
				board.setHIREDATE(rs.getDate("HIREDATE"));
				board.setSAL(rs.getInt("SAL"));
				board.setCOMM(rs.getInt("COMM"));
				board.setDEPTNO(rs.getInt("DEPTNO"));

				boardList.add(board);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return boardList;
	}

	@Override
	public boolean insert(BoardVO board) {
		connect();

		String sql = "INSERT INTO EMP VALUES(?,?,?,?,SYSDATE,?,?,?)";
		try {

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, board.getEMPNO());
			pstmt.setString(2, board.getENAME());
			pstmt.setString(3, board.getJOB());
			pstmt.setInt(4, board.getMGR());
			pstmt.setInt(5, board.getSAL());
			pstmt.setInt(6, board.getCOMM());
			pstmt.setInt(7, board.getDEPTNO());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			disconnect();
		}

		return true;
	}

}
