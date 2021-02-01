package com.codechobo.filter;


import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@WebFilter("/LoginCheckFilter")
public class LoginCheckFilter implements Filter {

    public LoginCheckFilter() {
    }

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 1. 서블릿이 요청을 받기 전에 처리할 작업 작성(요청 전처리 작업)
		System.out.println("[start]" + new Date() + " 필터 처리 시작!");
		
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpSession httpSession = httpServletRequest.getSession(false);
		boolean login = false;

		HttpSession session = ((HttpServletRequest) request).getSession();
		session = ((HttpServletRequest) request).getSession(true);
		
		// 2. filter가 작업할 수 있게 요청과 응답 전달(알아서 만들어줬다. 그냥 쓰면 된다.)
		
		//로그인 했는지 안했는지에 따라서 어디로 보낼지 정한다.
		if(httpSession!=null) {
			if(httpSession.getAttribute("id")!=null) {
				login = true;
			}
		}
		
		if(session.getAttribute("id")!=null) {
			login = true;
		}
		
		
		if(login==true) {
			chain.doFilter(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("/loginForm.jsp");
			rd.forward(request, response);
		}
		
		
		// 3. 서블릿이 응답한 직후에 처리할 작업 작성(응답 후처리 작업)
		System.out.println("[end]" + new Date() + "필터 처리 끝!");
	}
	
	public void destroy() {
	}

}
