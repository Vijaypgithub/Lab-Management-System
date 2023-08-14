package lab__Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateBill
 */
@WebServlet("/CreateBill")
public class CreateBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doget(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String name=req.getParameter("pname");
		String age=req.getParameter("page");
		String tdate=req.getParameter("date");
		String drname=req.getParameter("Drname");
		String a=req.getParameter("fm");
		String b=req.getParameter("fn");
		String c=req.getParameter("sn");
		int d,e,f;
		if(a!=null)
		{
			 d=Integer.parseInt(a);
		}else {
			 d=0;
		}
		if(b!=null)
		{
			 e=Integer.parseInt(b);
		}else {
			 e=0;
		}
		if(c!=null)
		{
			 f=Integer.parseInt(a);
		}else {
			 f=0;
		}
		int g=d+e+f;
		 resp.setContentType("text/html");
		   PrintWriter out=resp.getWriter();
		  req.setAttribute("pname",name );
		  req.setAttribute("page",age );
		  req.setAttribute("date",tdate);
		  req.setAttribute("Drname",drname);
		  req.setAttribute("sum", g);
		  RequestDispatcher rd=req.getRequestDispatcher("PrintBilljsp.jsp");
		  rd.forward(req, resp);
		 
	}
    
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String name=req.getParameter("pname");
		String age=req.getParameter("page");
		String tdate=req.getParameter("date");
		String drname=req.getParameter("Drname");
		String a=req.getParameter("fm");
		String b=req.getParameter("fn");
		String c=req.getParameter("sn");
		int d,e,f;
		if(a!=null)
		{
			 d=Integer.parseInt(a);
		}else {
			 d=0;
		}
		if(b!=null)
		{
			 e=Integer.parseInt(b);
		}else {
			 e=0;
		}
		if(c!=null)
		{
			 f=Integer.parseInt(a);
		}else {
			 f=0;
		}
		int g=d+e+f;
		 resp.setContentType("text/html");
		   PrintWriter out=resp.getWriter();
		  req.setAttribute("pname",name );
		  req.setAttribute("page",age );
		  req.setAttribute("date",tdate);
		  req.setAttribute("Drname",drname);
		  req.setAttribute("sum", g);
		  RequestDispatcher rd=req.getRequestDispatcher("PrintBilljsp.jsp");
		  rd.forward(req, resp);
		 
	}
}

