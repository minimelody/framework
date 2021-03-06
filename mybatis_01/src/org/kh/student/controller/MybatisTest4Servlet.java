package org.kh.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.student.model.service.StudentServiceImpl;
import org.kh.student.model.vo.Student;

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
		//1. 인코딩
		request.setCharacterEncoding("utf-8");
		//2. 인자값 가져오기
		Student vo = new Student();
		vo.setStudentNo(Integer.parseInt(request.getParameter("studentNo")));
		vo.setStudentName(request.getParameter("studentName"));
		vo.setStudentEmail(request.getParameter("studentEmail"));
		vo.setStudentAddr(request.getParameter("studentAddr"));
		vo.setStudentTel(request.getParameter("studentTel"));
		
		//3. 비즈니스 로직 처리
		int result = new StudentServiceImpl().updateStudent(vo);
		
		//4. 결과 리턴
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
