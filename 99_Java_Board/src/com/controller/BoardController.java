package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.BoardDAO;
import com.DAO.BoardDAOImpl;
import com.VO.BoardVO;

@WebServlet("/BoardController")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private HttpServletRequest request;
	private HttpServletResponse response;
	private String view;
	private PrintWriter out;

	private BoardDAO dao = new BoardDAOImpl();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		this.request = request;
		this.response = response;

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		out = response.getWriter();
		String action = request.getParameter("action");

		if (action == null) {
			action = "list";
		}

		switch (action) {
		case "list":
			listData();
			break;
		case "insert":
			insertData();
			break;
		default:
			System.out.println("잘못눌렀어 너 븅신아");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("안녕?doPost");
		
		doGet(request, response);
	}

	// 리스트 데이타를 받아옵니다.
	private void listData() {
		try {
			ArrayList<BoardVO> boardList = dao.select();
						
			request.setAttribute("boardList", boardList);
			view = "/Board/index.jsp";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void insertData() throws IOException {
		BoardVO board = new BoardVO();
		
		board.setEMPNO(Integer.parseInt(request.getParameter("EMPNO")));
		board.setENAME(request.getParameter("ENAME"));
		board.setJOB(request.getParameter("JOB"));
		board.setMGR(Integer.parseInt(request.getParameter("MGR")));
		
		board.setSAL(Integer.parseInt(request.getParameter("SAL")));
		board.setCOMM(Integer.parseInt(request.getParameter("COMM")));
		board.setDEPTNO(Integer.parseInt(request.getParameter("DEPTNO")));
		
		try {
			if(dao.insert(board)) {
				System.out.println("board DB 입력 성공!!");
				listData();
			}else {
				throw new IOException("board DB 입력 오류!!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
