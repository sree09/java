package hibernateAnnotations;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		userDAO ud = new userDAO();
		ArrayList<CarBean> al = ud.returnCars();
	
		session.setAttribute("carlist",al);
		request.setAttribute("cars", al);
		request.getRequestDispatcher("Cars.jsp").forward(request, response);	
	}

}
