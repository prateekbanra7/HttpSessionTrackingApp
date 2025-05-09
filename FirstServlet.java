package in.abc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//collect request parameter data
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		//create a session object and store these request parameter data in session object
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("age", age);
		
		//forward the response to form2.html
		RequestDispatcher rd = request.getRequestDispatcher("/form2.html");
		rd.forward(request, response);
		
		
	}

}
