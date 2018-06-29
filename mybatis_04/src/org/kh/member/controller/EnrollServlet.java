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
 * Servlet implementation class EnrollServlet
 */
@WebServlet(name = "Enroll", urlPatterns = { "/enroll" })
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Member m = new Member();
		m.setMemberId(request.getParameter("memberId"));
		m.setMemberPw(request.getParameter("memberPw"));
		m.setMemberName(request.getParameter("memberName"));
		m.setMemberAddr(request.getParameter("memberAddr"));
		m.setGender(request.getParameter("gender"));
		
		
		String hobbys [] = request.getParameterValues("hobby");
		String hobby = "";
		
		for(int i=0;i<hobbys.length;i++) {
			hobby += hobbys[i];
			if(hobbys.length-1!=i) {
				hobby += ",";
			}
		}
		
		m.setHobby(hobby);
	
		
		int result = new MemberServiceImpl().enroll(m);
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
