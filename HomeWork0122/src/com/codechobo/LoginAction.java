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
			HttpSession session = request.getSession();
			session = request.getSession(true);
			// 왜 이 값을 어디에서도 찾아 볼 수가 없을까
			session.setAttribute("id", "value");
			response.sendRedirect("board.jsp");  
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
