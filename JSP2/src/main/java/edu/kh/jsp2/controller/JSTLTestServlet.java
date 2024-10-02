package edu.kh.jsp2.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jstl/test")
public class JSTLTestServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// webapp 폴더 기준 
		String path = "/WEB-INF/views/jstl/test.jsp";
		// 요청발송자 + 요청 위임
		req.getRequestDispatcher(path).forward(req, resp);
		
		
		
		
	}
}
