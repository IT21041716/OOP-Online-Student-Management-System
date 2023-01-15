package Com.user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteStudentServlet")
public class deleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//this is the class which we used to print html 
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username =request.getParameter("Sname");//get data from form
		boolean istrue =false;
		boolean istrue1 = false;
		
		istrue =userDB.deleteStudent(username);//method call from db
		
		if(istrue == true) {
			//print massage
			out.println("<script type='text/javascript'>");
			out.println("alert('Student delete process successfull!');");
			out.println("location='Admin.jsp'");
			out.println("</script>");
			
		}else {
			//print error
			out.println("<script type='text/javascript'>");
			out.println("alert('Student delete process unsuccessfull!');");
			out.println("location='deleteStudent.jsp'");
			out.println("</script>");
		}
			istrue1 =userDB.updateuser(username);//update user table when admin delete the student
		
						if(istrue1 == true) {
							RequestDispatcher dis1 =request.getRequestDispatcher("Admin.jsp");
							dis1.forward(request,response);
							
							
						}else {
							RequestDispatcher dis1 =request.getRequestDispatcher("deleteStudent.jsp");
							dis1.forward(request,response);
							
						}
		
	}

}
