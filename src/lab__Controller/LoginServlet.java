package lab__Controller;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lab__model.Signup;
import lab_service.Service;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	Signup login=new Signup();
	Service service=new Service();
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/Login.jsp");
		dispatcher.forward(request, response);
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	boolean flag=false;
		//doGet(request, response);
		login.setUserName(request.getParameter("UserName"));
		login.setPassword(request.getParameter("Password"));
		flag=service.checkUserIsPresent(login);
		
		if(flag==true) {
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/Homepage.jsp");
			dispatcher.forward(request, response);
		}
		else {	
			PrintWriter out=response.getWriter();
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/Login.jsp");
			dispatcher.forward(request, response);
			out.write("<font color=black size=18>Enter incorrect UserName/Password:<br>");
			
		}
	}

}
