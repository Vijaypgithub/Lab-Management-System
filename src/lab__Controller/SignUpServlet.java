package lab__Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab__dao.SignUpDAO;
import lab__model.Signup;
import lab_service.Service;

@WebServlet("/Signup")
public class SignUpServlet extends HttpServlet {
	Service ser=new Service();
	Signup sign=new Signup();
	SignUpDAO d=new SignUpDAO();
	private static final long serialVersionUID = 1L;
   
	
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/SignUp.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			sign.setUserName(request.getParameter("UserName"));
			sign.setPassword(request.getParameter("Password"));
			String confirmPassword=request.getParameter("RenterPassword");
			boolean flag=ser.checkValid(sign,confirmPassword);
			if(flag==true) {
				RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/Homepage.jsp");
					dispatcher.forward(request, response);
			}
			else {
				RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/UnSuccessfull_Signup.jsp");
		       dispatcher.forward(request, response);
			
			}
	}

}
