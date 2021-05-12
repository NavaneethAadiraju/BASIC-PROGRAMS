package com.emps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextExample1 extends HttpServlet {
	ServletContext ctx = null;

	public ContextExample1() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {
		ctx = config.getServletContext();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		ctx.setAttribute("goldrate", "50000");
		pw.println("<h3 style=color:blue> Gold Rate" + ctx.getAttribute("goldrate"));
		pw.println("Servlet Version =" + ctx.getMajorVersion() + " . " + ctx.getMinorVersion() + " </h3>");

	}
}