package Com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//this is the class which we used to print html  
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//create variable to store values received from user.jsp
		String Fname = request.getParameter("fname");
		String Sname = request.getParameter("sname");
		String Lname = request.getParameter("lname");
		String Surename = request.getParameter("surename");
		String gender = request.getParameter("Gender");
		String DOB = request.getParameter("dob");
		String address =request.getParameter("address");
		String number =request.getParameter("mobileno");
		String email = request.getParameter("email");
		String medium =request.getParameter("medium");
		
		
		boolean istrue;
		//check the insertdetails method is true
		istrue = userDB.insertdetails(Fname, Sname, Lname, Surename, gender, DOB, address, number, email, medium);
		if (istrue ==true) {
			RequestDispatcher dis =request.getRequestDispatcher("Home.jsp");//redirect new page
			dis.forward(request, response);
		}
		else {//print error massage
			out.println("<script type='text/javascript'>");
			out.println("alert('unsucessfull!!!!');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}
		
	}

}
