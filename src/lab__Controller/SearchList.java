package lab__Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lab__dao.SearchAndAdminDao;
import lab__model.AddPatient;

@WebServlet("/SearchList")
public class SearchList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchList() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		 String radio = request.getParameter("abc");
		 String type = request.getParameter("search2");
			if (radio.equals("Refferd")) {
				try {
					SearchList.searchDoctor(request, response, type);
					
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ServletException e) {
					e.printStackTrace();
				}
			}

			if (radio.equals("Collected")) {
				try {
					SearchList.searchCollect(request, response, type);
					
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ServletException e) {
					e.printStackTrace();
				}
			}

			if (radio.equals("Patient")) {
				try {
					SearchList.searchPatient(request, response, type);
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ServletException e) {
					e.printStackTrace();
				}
			}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String radio = request.getParameter("abc");
		String type = request.getParameter("search2");
		if (radio.equals("Refferd")) {
			try {
				SearchList.searchDoctor(request, response, type);
			
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			}
		}

		if (radio.equals("Collected")) {
			try {
				SearchList.searchCollect(request, response, type);
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			}
		}

		if (radio.equals("Patient")) {
			try {
				SearchList.searchPatient(request, response, type);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			}
		}
			doGet(request, response);
	}

	
	
	
	
	
	
	
	
	private static void searchPatient(HttpServletRequest request, HttpServletResponse response, String name)
			throws SQLException, IOException, ServletException {
		List<AddPatient> list = new ArrayList<AddPatient>();
		list = SearchAndAdminDao.SearchPatient(name);
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/List.jsp");
		dispatcher.forward(request, response);

	}

	private static void searchCollect(HttpServletRequest request, HttpServletResponse response, String name)
			throws SQLException, IOException, ServletException {
		List<AddPatient> list = new ArrayList<AddPatient>();
		list = SearchAndAdminDao.searchCollect(name);
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/List.jsp");
		dispatcher.forward(request, response);

	}

	private static void searchDoctor(HttpServletRequest request, HttpServletResponse response, String name)
			throws SQLException, IOException, ServletException {
		List<AddPatient> list = new ArrayList<AddPatient>();
		list = SearchAndAdminDao.searchDoctor(name);
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/List.jsp");
		dispatcher.forward(request, response);

	}

}
