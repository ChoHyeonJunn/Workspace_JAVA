package com.DAO;

import java.util.ArrayList;

import com.VO.BoardVO;

public interface BoardDAO {

	public ArrayList<BoardVO> select() throws Exception;
	public boolean insert(BoardVO board) throws Exception;
	public void connect();
	public void disconnect();
	
}
