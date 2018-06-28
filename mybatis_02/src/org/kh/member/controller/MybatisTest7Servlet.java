package org.kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.service.MemberServiceImpl;
import org.kh.member.model.vo.Member;

/**
 * Servlet implementation class MybatisTest7Servlet
 */
@WebServlet(name = "MybatisTest7", urlPatterns = { "/mybatisTest7" })
public class MybatisTest7Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MybatisTest7Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Member m = new Member();
		m.setUserId(request.getParameter("userId"));
		m.setUserPw(request.getParameter("userPw"));
		m.setUserNick(request.getParameter("userNick"));
		m.setUserTel(request.getParameter("userTel"));

		int result = new MemberServiceImpl().updateMemberTwo(m);
		
		response.setContentType("text/html; charset=utf-8");
		if(result>0) {
			response.getWriter().println("성공");
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
