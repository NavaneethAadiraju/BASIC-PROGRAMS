package com.emps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextExample22 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext ctx = null;

	public ContextExample22() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {
		ctx = config.getServletContext();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h3 style=color:red> Gold Rate" + ctx.getAttribute("goldrate"));

	}

}