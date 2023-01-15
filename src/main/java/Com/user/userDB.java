package Com.user;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import Com.user.DBconnect;


public class userDB {
	
	//declare the variables
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs  = null;
	
	
	//username password validation method
public static boolean validate(String username, String password) {
		
	//create data base and sql quary
		try {
			con = DBconnect.getConnection();//call the method
			stmt = con.createStatement();//create database connetion
			String sql = "select * from admin_login where Username='"+username+"' and Password='"+password+"'";//check the username ad password
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {//get input 
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	//get user details as a list 
public static List<user> getuser(String username) {
	
	ArrayList<user> user = new ArrayList<>();
	
	try {
		//create data base connection
		con = DBconnect.getConnection();//call the method
		stmt = con.createStatement();//create database connetion
		String sql = "select * from admin_login where Username='"+username+"'";//get data from Admin login table
		rs = stmt.executeQuery(sql);
		
		//asign tables value for variables
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String phone = rs.getString(4);
			String Username = rs.getString(5);
			String password = rs.getString(6);
			
			user u = new user(id,name,email,phone,username,password);//pass the value for user constructor
			user.add(u);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	
	return user;	// return user arraylist
}


/*----------------------------update admin password part---------------------------------*/


	public static boolean AdminUpdate(String username,String password) {
		
			
		try {
				con =DBconnect.getConnection();//call the method
				stmt =con.createStatement();//create database connetion
				String sql = "update admin_login set Password ='"+password+"'"+"where Username ='"+username+"'";//update admin's password query
				
				int rs = stmt.executeUpdate(sql);
					if(rs == 1) {
						isSuccess =true;
					}
					else if (rs == 0){
						isSuccess =false;
					}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
		return isSuccess;
	}

/*---------------------insert Registration details---------------------------*/
	
		public static boolean insertdetails(String Fname,String Sname, String Lname, String Surename,String gender,String DOB ,String address,String number ,String email,String medium)
		
		{	
			
		
				//create database connection
				try {
					
					con = DBconnect.getConnection();//call the method
					stmt = con.createStatement();//create database connetion
					//insert sql query for ragistration
					String sql = "insert into registrationform values (0,'"+Fname+"','"+Sname+"','"+Lname+"','"+Surename+"','"+gender+"','"+DOB+"','"+address+"','"+number+"','"+email+"','"+medium+"')";
					int rs =stmt.executeUpdate(sql);//execute the query
					
					if(rs == 1) {
						isSuccess =true;
						
					}else {
						isSuccess =false;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				
				return isSuccess;
			}
			

/*------------------------delete students account----------------*/

public static boolean deleteStudent(String username) {
	
		try {
			con =DBconnect.getConnection();//call connection method
			stmt = con.createStatement();
			String sql = "delete from students where Username ='"+username+"'"; //delete query for delete student from data base
			int rs =stmt.executeUpdate(sql);
			
			if(rs == 1) {
				isSuccess =true;
			}else {
				isSuccess =false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	
		return isSuccess;		
	}
/*---------------update the student login table after delete student----------------------------*/

public static boolean updateuser(String username) {
	
	try {
		con =DBconnect.getConnection();//call connecton method
		stmt = con.createStatement();//create connection
		String sql = "delete from student_login where Username ='"+username+"'";//delete query 
		int rs =stmt.executeUpdate(sql);
		
		if(rs == 1) {
			isSuccess =true;
		}else {
			isSuccess =false;
		}
	}
	catch(Exception e){
		e.printStackTrace();
		
	}

	return isSuccess;		
}

/*--------------------get data from ------------------------*/

public static boolean getdata(String ID, String Fname) {

		
	try {
		con=DBconnect.getConnection();//call method connection
		stmt = con.createStatement();//create connection
		String sql = "select * from registrationform where ID='"+ID+"'";//sql query
		 rs =stmt.executeQuery(sql);

		 //get values from the registration table and asign
			if(rs.next()) {
				String id =rs.getString(1);
				String firstname = rs.getString(2);
				String secondname =rs.getString(3);
				String lastname =rs.getString(4);
				String surename =rs.getString(5);
				String gen =rs.getString(6);
				String dob =rs.getString(7);
				String Address =rs.getString(8);
				String mobile =rs.getString(9);
				String Email =rs.getString(10);
				String Medium =rs.getString(11);
				
				//call student's method
				String Username =student.generateusername(firstname , id);
				String password =student.generatepassword(firstname , id);	
				
				
				//insert that values for the student
				String sql1 ="insert into students values('0','"+firstname+"','"+secondname+"','"+lastname+"','"+surename+"','"+gen+"','"+dob+"','"+Address+"','"+mobile+"','"+Email+"','"+Medium+"','"+Username+"','"+password+"')";
				int rs1 =stmt.executeUpdate(sql1);
				
				if(rs1 == 1) {
					isSuccess =true;
				}else {
					isSuccess =false;
				}

			
			}
				
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	return isSuccess;
}

/*---------------------------add new user to student login table-----------------------*/

public static boolean adduser(String ID, String Fname) {
	
		//create database connection
	try {
		con=DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from registrationform where ID='"+ID+"'"; //get data from registration
		 rs =stmt.executeQuery(sql);

			if(rs.next()) {
				String id =rs.getString(1);
				String firstname = rs.getString(2);
				String secondname =rs.getString(3);
				String lastname =rs.getString(4);
				String surename =rs.getString(5);
				String gen =rs.getString(6);
				String dob =rs.getString(7);
				String Address =rs.getString(8);
				String mobile =rs.getString(9);
				String Email =rs.getString(10);
				String Medium =rs.getString(11);
				
				//call methods from student class
				String Fullname =student.fullname(firstname, secondname, lastname);
				String Username =student.generateusername(firstname , id);
				String password =student.generatepassword(firstname , id);	
						
				//insert values for new student login table
				String sql1 ="insert into student_login values('0','"+Fullname+"','"+Email+"','"+mobile+"','"+Username+"','"+password+"')";
				int rs1 =stmt.executeUpdate(sql1);
				
				if(rs1 == 1) {
					isSuccess =true;
				}else {
					isSuccess =false;
				}

			
			}
				
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	return isSuccess;
}

}// end db class