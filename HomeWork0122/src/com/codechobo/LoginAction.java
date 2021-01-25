package com.codechobo;

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
		String pwd = request.getParameter("password");
		
		if(id.equals("nam") && pwd.equals("1234")) {
			// 여기에 세션 추가해야함(현재 무한루프 도는중)
			HttpSession session = request.getSession(true);
			session.setAttribute("key", 1234);
			response.sendRedirect("index.jsp");  
		}
		else {
			request.setAttribute("msg", "ID 또는 PWD가 틀립니다.");
			RequestDispatcher reqDis = request.getRequestDispatcher("loginForm.jsp"); 
			reqDis.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
