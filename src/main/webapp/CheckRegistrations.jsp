<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

		<%
			//create database connection
			
				String id = request.getParameter("ID");
				String driverName = "com.mysql.jdbc.Driver";
				String connectionUrl = "jdbc:mysql://localhost:3306/";
				String dbName = "school";
				String userId = "root";
				String password = "Rash@1231";
				try {
						Class.forName("com.mysql.jdbc.Driver");
						} 
				catch (ClassNotFoundException e) {
						e.printStackTrace();
						}
						
				Connection connection = null;
				Statement statement = null;
				ResultSet resultSet = null;
	%>



<!DOCTYPE html>

<html>
<head>
	<title>check registration</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	
	<style>
	
.form{
background-color:#9c9986;
margin-left: auto;
margin-right: auto;
margin-top:px;
width:500px;
height:280px;

}
.table{
background-color:#20414f;
margin-left: 170px;
margin-right: 160px;
margin-top:px;
}
.lable1{
	color:white;
	float: left;
	width: 100px;
	margin-top: 40px;
	padding-left:2px;
	margin-left: 50px;
	
}

.box1{
	
	width: 45%;
	padding:10px 10px;
	border: 1px solid #ccc;
	margin-top: 30px;
	margin-left:80px;
	
}
.submit{
	
	background-color: white;
	color: black;
	width:230px;
	height:40px;
	padding: 0px;
	border: none;
	font-size:15px;
	margin-left:150px;
	margin-top:20px;

}
.headerrow{
background-color:#4f1906;
}
.submit:hover{
	background-color:#4f1906;
	color:white;
}
table, th, td {
  border: 1px solid;
}


		body, h1,h2,h3,h4,h5,h6 {font-family: "Montserrat", sans-serif}
		.w3-row-padding img {margin-bottom: 12px}
		/* Set the width of the sidebar to 120px */
		.w3-sidebar {width: 120px;background: #222;}
	/* Add a left margin to the "page content" that matches the width of the sidebar (120px) */
	#main {margin-left: 120px}
	/* Remove margins from "page content" on small screens */
	@media only screen and (max-width: 600px) {#main {margin-left: 0}}
	</style>

</head>
<body class="w3-black">

		<!-- Icon Bar (Sidebar - hidden on small screens) -->
		<nav class="w3-sidebar w3-bar-block w3-small w3-hide-small w3-center">
		  <!-- Avatar image in top left corner -->
		  <a href="Home.jsp" class="w3-bar-item w3-button w3-padding-large w3-black">
		    <i class="fa fa-home w3-xxlarge"></i>
		    <p>HOME</p>
		  </a>
		  <a href="login.jsp" class="w3-bar-item w3-button w3-padding-large w3-hover-black">
		    <i class="fa fa-user w3-xxlarge"></i>
		    <p>LOGIN</p>
		  </a>
		  <a href="#photos" class="w3-bar-item w3-button w3-padding-large w3-hover-black">
		    <i class="fa fa-eye w3-xxlarge"></i>
		    <p>PHOTOS</p>
		  </a>
		  <a href="#contact" class="w3-bar-item w3-button w3-padding-large w3-hover-black">
		    <i class="fa fa-envelope w3-xxlarge"></i>
		    <p>CONTACT</p>
		  </a>
		</nav>
		
		<!-- Navbar on small screens (Hidden on medium and large screens) -->
		<div class="w3-top w3-hide-large w3-hide-medium" id="myNavbar">
		  <div class="w3-bar w3-black w3-opacity w3-hover-opacity-off w3-center w3-small">
		    <a href="#" class="w3-bar-item w3-button" style="width:25% !important">HOME</a>
		    <a href="Login.jsp" class="w3-bar-item w3-button" style="width:25% !important">LOGIN</a>
		    <a href="#photos" class="w3-bar-item w3-button" style="width:25% !important">PHOTOS</a>
		    <a href="#contact" class="w3-bar-item w3-button" style="width:25% !important">CONTACT</a>
		  </div>
		</div>
		
		<!-- Page Content -->
		
		<br><br>
		<h1><center>Available Registration forms </center></h1>
<br><br>
	<div class="table">
			<table>
			<tr class= headerrow>
			<!--  table headings-->
				<td>ID</td>
				<td>Firstname</td>
				<td>Secondname</td>
				<td>Lastname</td>
				<td>Surename</td>
				<td>Gender</td>
				<td>DOB</td>
				<td>Address</td>
				<td>MobileNo</td>
				<td>Email</td>
				<td>Medium</td>
				
			</tr>
		<%
				try{
					connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);//create connection
					statement=connection.createStatement();
					String sql ="SELECT * FROM registrationform";//sql query 
					resultSet = statement.executeQuery(sql);
					
				while(resultSet.next()){
		%>
		<tr>
		<!-- display data from data base  -->
				<td><%=resultSet.getString("ID") %></td>
				<td><%=resultSet.getString("Fname") %></td>
				<td><%=resultSet.getString("Sname") %></td>
				<td><%=resultSet.getString("Lname") %></td>
				<td><%=resultSet.getString("Surename") %></td>
				<td><%=resultSet.getString("Gender") %></td>
				<td><%=resultSet.getString("DOB") %></td>
				<td><%=resultSet.getString("Address") %></td>
				<td><%=resultSet.getString("MobileNo") %></td>
				<td><%=resultSet.getString("Email") %></td>
				<td><%=resultSet.getString("Medium") %></td>
				
		</tr>
		<%
				}
					} catch (Exception e) {
					e.printStackTrace();
					}
		%>
	</table>
	</div>
	
	<h1><center>Add new Student </center></h1>
	<br><br>
	
		<div class="form">
			<form action ="getdata" method ="post">
				<label for="RegID" class ="lable1"> RegistrationID</label>
				<input type="text" class="box1" name ="RegID" placeholder="enter the user ID" ><br><br>

				<label for="Fname" class ="lable1">First name</label>
				<input type="text" class="box1" name="Fname"placeholder="enter First name" ><br><br>
				
				<input type="submit" name ="submit" value="Add Student" class="submit">
			</form>
		
		</div>
	
		<!-- Portfolio Section -->
		  <div class="w3-padding-64 w3-content" id="photos">
		    <h2 class="w3-text-light-grey">Gallery</h2>
		    <hr style="width:200px" class="w3-opacity">
		
		    <!-- Grid for photos -->
		    <div class="w3-row-padding" style="margin:0 -16px">
		      <div class="w3-half">
		        <img src="Images/2.jpg" >
		        <img src="Images/3.jpg" >
				<img src="Images/11.jpg">		
		      </div>
		    <!-- End photo grid -->
		    </div>
		  <!-- End Portfolio Section -->
		  </div>
		
		  <!-- Contact Section -->
		  <div class="w3-padding-64 w3-content w3-text-grey" id="contact">
		    <h2 class="w3-text-light-grey">Contact Me</h2>
		    <hr style="width:200px" class="w3-opacity">
		
		    <div class="w3-section">
		      <p><i class="fa fa-map-marker fa-fw w3-text-white w3-xxlarge w3-margin-right"></i> Royal College, Colombo 07. </p>
		      <p><i class="fa fa-phone fa-fw w3-text-white w3-xxlarge w3-margin-right"></i> Phone:  011 269 5256</p>
		      <p><i class="fa fa-envelope fa-fw w3-text-white w3-xxlarge w3-margin-right"> </i> Email: inforoyal@mail.com</p>
		    </div><br>
		    <p>Let's get in touch. Send me a message:</p>
		
		    <form action="/action_page.php" target="_blank">
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="Name" required name="Name"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="Email" required name="Email"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="Subject" required name="Subject"></p>
		      <p><input class="w3-input w3-padding-16" type="text" placeholder="Message" required name="Message"></p>
		      <p>
		        <button class="w3-button w3-light-grey w3-padding-large" type="submit">
		          <i class="fa fa-paper-plane"></i> SEND MESSAGE
		        </button>
		      </p>
		    </form>
		  <!-- End Contact Section -->
		  </div>
		  
		    <!-- Footer -->
		  <footer class="w3-content w3-padding-64 w3-text-grey w3-xlarge">
				    <i class="fa fa-facebook-official w3-hover-opacity"></i>
				    <i class="fa fa-instagram w3-hover-opacity"></i>
				    <i class="fa fa-snapchat w3-hover-opacity"></i>
				    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
				    <i class="fa fa-twitter w3-hover-opacity"></i>
				    <i class="fa fa-linkedin w3-hover-opacity"></i>
		  <!-- End footer -->
		  </footer>
		
		<!-- END PAGE CONTENT -->
		</div>
		   
		  


</body>
</html>
