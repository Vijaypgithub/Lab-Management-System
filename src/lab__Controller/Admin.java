package lab__Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab__dao.SearchAndAdminDao;
import lab__model.Signup;

@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Signup> list = new ArrayList<Signup>();
		SearchAndAdminDao s = new SearchAndAdminDao();
		list = s.admin();
		request.setAttribute("ListAdmin", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Admin.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Signup> list = new ArrayList<Signup>();
		SearchAndAdminDao s = new SearchAndAdminDao();
		list = s.admin();
		request.setAttribute("ListAdmin", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Admin.jsp");
		dispatcher.forward(request, response);
	}

}
