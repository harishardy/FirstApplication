

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletProgram
 */
@WebServlet("/ServletProgram")
public class ServletProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProgram() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		
		
		String usrname = request.getParameter("username");
		String passwd = request.getParameter("password");


		
		if(usrname.equals("raja") && passwd.equals("raja123"))
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
			dispatcher.forward(request,response);
		}
		

		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("Failure.jsp");
			dispatcher.forward(request,response);
		}
	}

}
