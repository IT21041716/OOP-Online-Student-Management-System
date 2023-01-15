package Com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//this is the class which we used to print html   
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username"); //get data from login form
		String password = request.getParameter("Password");//get data from login form
		boolean isTrue;
		
		isTrue = userDB.validate(username, password);//check the validate function 
		
		if (isTrue == true) {
			
			List<user> userdetails = userDB.getuser(username);//asign user details to user details
			request.setAttribute("userdetails", userdetails);
			
			//print sucess massage
			out.println("<script type='text/javascript'>");
			out.println("alert('login successfull');");
			out.println("location='Admin.jsp'");
			out.println("</script>");
			
			
		} else {//print error massage
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}

	}
}
