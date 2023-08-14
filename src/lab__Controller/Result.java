package lab__Controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet( HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	 String c = request.getParameter("CBC");
		String h = request.getParameter("HIV");
		String b = request.getParameter("BMP");
		String Cholesterol = request.getParameter("Cholesterol");
			ServletContext context=getServletContext();
			context.setAttribute("CBC",c);
			context.setAttribute("HIV",h);
			context.setAttribute("BMP",b);
			context.setAttribute("Cholesterol",Cholesterol);
		if (c != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/CBC.jsp");
			dispatcher.include(request, response);

		}
		if (h != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/HIV.jsp");
			dispatcher.include(request, response);

		}
		if (b != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/BMP.jsp");
			dispatcher.include(request, response);

		}

		if (Cholesterol != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/LipidPanel.jsp");
			dispatcher.include(request, response);

		}
		String s = "http://localhost:8081/lab__report_creator/Print";
		PrintWriter pw = response.getWriter();

		//pw.write("<center><input type=\"submit\" value=\"Submit\"></center>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
	

}
