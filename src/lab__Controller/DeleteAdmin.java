package lab__Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab__dao.SignUpDAO;

@WebServlet("/DeleteAdmin")
public class DeleteAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteAdmin() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SignUpDAO s=new SignUpDAO();
		
		String admin=request.getParameter("userName");
			s.deleteAdmin(admin);
		response.sendRedirect("Admin");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
