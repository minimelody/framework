package org.kh.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.member.model.service.MemberServiceImpl;
import org.kh.member.model.vo.Member;

/**
 * Servlet implementation class MybatisTest4Servlet
 */
@WebServlet(name = "MybatisTest4", urlPatterns = { "/mybatisTest4" })
public class MybatisTest4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MybatisTest4Servlet() {
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
		m = new MemberServiceImpl().updateMember(m);
		response.setContentType("text/html; charset=utf-8");
		if(m!=null) {
			RequestDispatcher view = request.getRequestDispatcher("/views/member/memberUpdate.jsp");
			request.setAttribute("member", m);
			view.forward(request, response);
		}else {
			response.getWriter().println("일치하는 회원이 없습니다");
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
