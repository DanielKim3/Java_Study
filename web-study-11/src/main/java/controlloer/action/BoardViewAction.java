package controlloer.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import dto.BoardVO;

public class BoardViewAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/board/boardView.jsp";
		
		int num = Integer.parseInt(request.getParameter("num")); 
		
		BoardDAO bDao = BoardDAO.getInstance();
		
		bDao.updateReadCount(num); // 카운트 증가
		
		BoardVO bVO = bDao.selectOneBoardByNum(num); // 고유값으로 게시글 상세 조회 
		
		request.setAttribute("board", bVO);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
