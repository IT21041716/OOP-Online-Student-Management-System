package Com.user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminUpdateServlet")
public class AdminUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//this is the class which we used to print html  
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");//get details from the form
		String password = request.getParameter("Password");//get details from the form
		
		boolean istrue;
		
		istrue =userDB.AdminUpdate(username,password);//check method success 
		if(istrue == true) {//print success massage
			out.println("<script type='text/javascript'>");
			out.println("alert('Password changed successfully');");
			out.println("location='Admin.jsp'");
			out.println("</script>");
			
			
		}
		else {//print unsuccess massage
			out.println("<script type='text/javascript'>");
			out.println("alert('Password change unsuccessfull');");
			out.println("location='Admin.jsp'");
			out.println("</script>");
		}
		}
		
	}


