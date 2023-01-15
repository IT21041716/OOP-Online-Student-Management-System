package Com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetDataServlet")
public class GetDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//this is the class which we used to print html
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String ID = request.getParameter("RegID"); //get details from the form
		String Fname = request.getParameter("Fname");//get details from the form
		boolean istrue;
		boolean istrue1;
		
		istrue =userDB.getdata(ID,Fname);
		if (istrue ==true) {//redirect new page
			RequestDispatcher dis =request.getRequestDispatcher("Admin.jsp");
			dis.forward(request, response);
		}
		else {//print error massage
			out.println("<script type='text/javascript'>");
			out.println("alert('unsucessfull!!!!');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}
		
				istrue1 =userDB.adduser(ID,Fname);//check method
				
						if(istrue1 == true) {//redirect new page
							RequestDispatcher dis1 =request.getRequestDispatcher("Admin.jsp");
							dis1.forward(request,response);
							
							
						}else {
							RequestDispatcher dis1 =request.getRequestDispatcher("CheckRegistrations.jsp");
							dis1.forward(request,response);
						
						}

		
		
	}

}
