package org.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.service.MemberServiceImpl;
import org.kh.member.model.vo.Check;
import org.kh.member.model.vo.Member;
import org.kh.member.model.vo.Search;

/**
 * Servlet implementation class Search2Servlet
 */
@WebServlet(name = "Search2", urlPatterns = { "/search2" })
public class Search2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		Check check = new Check(
				request.getParameter("chName"),
				request.getParameter("chAddr"),
				request.getParameter("chGender"),
				request.getParameter("chHobby")
		);
		
		ArrayList<Member> list = new MemberServiceImpl().checkMemberList(check);
		
		response.setContentType("text/html;charset=utf-8");
		if(!list.isEmpty()) {
			request.setAttribute("list", list);
			request.getRequestDispatcher("/views/member/checkList.jsp").forward(request, response);
		}else {
			response.getWriter().println("실패");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
