package lab__Controller;

import java.io.IOException
;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lab__dao.SignUpDAO;
import lab__model.AddPatient;


@WebServlet("/Homepage")
public class Homepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    SignUpDAO dao=new SignUpDAO();
	public Homepage() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher1=request.getRequestDispatcher("/WEB-INF/views/Homepage.jsp");
		dispatcher1.forward(request, response);
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		AddPatient addPatient =new AddPatient(request.getParameter("PatientName"),Byte.parseByte(request.getParameter("Age")),null, request.getParameter("Gender"),request.getParameter("Reffered"), request.getParameter("CollectedBy"));
		boolean flag=dao.homePage(addPatient);
		AddPatient sajjad=new AddPatient(request.getParameter("PatientName"), Byte.parseByte(request.getParameter("Age")),request.getParameter("Reffered"), request.getParameter("CollectedBy"));
		ServletContext context=getServletContext();
		context.setAttribute("patient", sajjad);
		if(flag==true) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/Tests.jsp");
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/Homepage.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
