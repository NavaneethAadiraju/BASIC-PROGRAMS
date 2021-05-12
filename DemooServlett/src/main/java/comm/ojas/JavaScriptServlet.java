package comm.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaScriptServlet
 */
@WebServlet("/JavaScriptServlet")
public class JavaScriptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaScriptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String name = request.getParameter("s1");
        if(name.equals("AndhraPradesh")) {
            pw.println("<h2 style=color:green>you have selected  the state:"+name+"</h2>");
            pw.println("<h3 style=color:blue>"+"capital = amaravathi");
        }
        else if (name.equals("Telangana")) {
            pw.println("<h3 style= color:green>you have selected  the state:"+name +"<h3></br>");
            pw.println("<h2 style = color:pink> capital = Hyderabad"+"</h2>");
        }
        else if (name.equals("Chennai")) {
            pw.println("<h3 style= color:green>you have selected  the state:"+name +"<h3></br>");
            pw.println("<h2 style = color:pink> capital = TamilNadu"+"</h2>");
        }
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
