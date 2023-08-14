package lab__Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab__model.AddPatient;
import lab__model.CbcTest;
import lab__model.bmpTest;
import lab__model.hivTest;
import lab__model.lipidPanel;

@WebServlet("/Print")
public class Print extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Print() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		String c = (String) context.getAttribute("CBC");
		String h = (String) context.getAttribute("HIV");
		String b = (String) context.getAttribute("BMP");
		String ch = (String) context.getAttribute("Cholesterol");
		request.setAttribute("CBC", c);
		request.setAttribute("HIV", h);
		request.setAttribute("BMP", b);
		request.setAttribute("Cholesterol", ch);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/print.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		AddPatient patient=(AddPatient)context.getAttribute("patient");
		request.setAttribute("patient", patient);
		String c = (String) context.getAttribute("CBC");
		String h = (String) context.getAttribute("HIV");
		String b = (String) context.getAttribute("BMP");
		String ch = (String) context.getAttribute("Cholesterol");
		request.setAttribute("CBC", c);
		request.setAttribute("HIV", h);
		request.setAttribute("BMP", b);
		request.setAttribute("Cholesterol", ch);
		if (c != null)
			cbcData(request, response);
		if (h != null)
			hivData(request, response);
		if (b != null)
			bmpData(request, response);
		if (ch != null)
			lipidData(request, response);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/print.jsp");
		dispatcher.forward(request, response);
		
		//String s = "http://localhost:8081/lab__report_creator/Homepage";
		PrintWriter pw = response.getWriter();

		

	}

	static void cbcData(HttpServletRequest request, HttpServletResponse response) {
		CbcTest cb = new CbcTest(Float.parseFloat(request.getParameter("Haemoglobin")),
				Float.parseFloat(request.getParameter("Platelates")),
				Float.parseFloat(request.getParameter("erythrocytes")),
				Integer.parseInt(request.getParameter("Leukocyte")),
				Integer.parseInt(request.getParameter("Eosinophils")),
				Integer.parseInt(request.getParameter("Lymphocytes")),
				Integer.parseInt(request.getParameter("Monocytes")),
				Integer.parseInt(request.getParameter("Basophils")));
		request.setAttribute("List", cb);
	}

	static void hivData(HttpServletRequest request, HttpServletResponse response) {
		hivTest hivtest = new hivTest(Integer.parseInt(request.getParameter("BloodSugar")),
				Integer.parseInt(request.getParameter("BlodGlucose")));
		request.setAttribute("List", hivtest);
	}

	static void bmpData(HttpServletRequest request, HttpServletResponse response) {
		bmpTest test = new bmpTest(Integer.parseInt(request.getParameter("WBC")),
				Integer.parseInt(request.getParameter("PLT")), Integer.parseInt(request.getParameter("AST")),
				Integer.parseInt(request.getParameter("LDL")), Integer.parseInt(request.getParameter("TG")),
				Integer.parseInt(request.getParameter("HB")), Integer.parseInt(request.getParameter("Hct")),
				Integer.parseInt(request.getParameter("Glu")), Integer.parseInt(request.getParameter("TP")));
		request.setAttribute("List", test);
	}

	static void lipidData(HttpServletRequest request, HttpServletResponse response) {
		lipidPanel test = new lipidPanel(Integer.parseInt(request.getParameter("Cholesterol")),
				Integer.parseInt(request.getParameter("Triglycerides")), Integer.parseInt(request.getParameter("HDL")),
				Integer.parseInt(request.getParameter("LDL")), Integer.parseInt(request.getParameter("VLDL")),
				Integer.parseInt(request.getParameter("ratio")), Integer.parseInt(request.getParameter("total")));
		request.setAttribute("List", test);

	}
}
