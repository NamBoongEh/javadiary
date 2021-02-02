package com.codechobo.filter;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginAction() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
			
		if(id.equals("nam") && pwd.equals("1234")) {
			HttpSession session = request.getSession();
			
			session.setAttribute("id", "value");
			
			System.out.println("세션 값은 " + (String)session.getAttribute("id"));

			// ** 목표 : 하드 코딩 바꾸기
			response.sendRedirect(goPage());  
		}
		else {
			request.setAttribute("msg", "ID 또는 PWD가 틀립니다.");
			RequestDispatcher reqDis = request.getRequestDispatcher("loginForm.jsp"); 
			reqDis.forward(request, response);
		}
	}
	
	String goPage() {
		// 여기에 이제 board.jsp가 들어와야함
		return "board.jsp";
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
