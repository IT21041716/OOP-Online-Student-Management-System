<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<title>Registration page</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
	body, h1,h2,h3,h4,h5,h6 {font-family: "Montserrat", sans-serif}
	.w3-row-padding img {margin-bottom: 12px}
	/* Set the width of the sidebar to 120px */
	.w3-sidebar {width: 120px;background: #222;}
/* Add a left margin to the "page content" that matches the width of the sidebar (120px) */
#main {margin-left: 120px}
/* Remove margins from "page content" on small screens */
@media only screen and (max-width: 600px) {#main {margin-left: 0}}

*{
	margin:0px;
}
.head{
	margin-top:50px;
	text-align:center;
}
.regform{
	background-color:#9c9986;
	width:700px;
	height:820px;
	border-radius: 5px;
	padding-top:20px;
	padding-left:25px;
	margin-left: 400px;
	margin-right: auto;
	margin-top: 30px;
	margin-bottom: 50px;
	
}
.lable1{
	color:white;
	float: left;
	width: 30%;
	margin-top: 30px;
	padding-left:2px;
	
}

.box1{
	title:full name;
	width: 65%;
	padding:10px 10px;
	border: 1px solid #ccc;
	margin-top: 30px;
	
}
.box2{
	width: 65%;
	height:200px;
	padding: 8px;
	margin-top:20px;
	border: 1px solid #ccc;
	height:200px;
 
}
.choose{
	margin-top: 30px;
	margin-bottom: 30px;
	margin-right:100px;
	color:white;
	
}
.submit{
	
	background-color: white;
	color: black;
	width:700px;
	padding: 10px;
	border: none;
	font-size:20px;
	margin-left: -25px;
	margin-right: auto;
	margin-top: 30px;
	margin-bottom: 50px;

}
.submit:hover{
	background-color:#04AA6D;
	color:white;
}

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
			<h2 class="head">Students Registration Form</h2>
	<div class="regform">
		<form action ="insert"method="post" >
		<label for="Iname" class ="lable1">First name</label>
		<input type="text" class="box1" name ="fname" placeholder="enter item first name" style=" width:200px ; margin-right:200px">

		<label for="secondname" class ="lable1">Second Name</label>
		<input type="text" class="box1" name="sname"placeholder="enter Second name" style=" width:200px ; margin-right:200px" >
		
		<label for="lastname" class ="lable1">Last Name</label>
		<input type="text" class="box1"  name="lname"placeholder="enter lastname" style=" width:200px ; margin-right:200px">
		
		<label for="surename" class ="lable1">Surename</label>
		<input type="text" class="box1" name ="surename"placeholder="enter Surename" style=" width:200px ; margin-right:200px">
		
		<label for="gender" class ="lable1">Gender</label>
		<select class="box1" name="Gender" style=" width:200px ; margin-right:200px">
			<option value="male">male</option>
			<option value="female">female</option>
			<option value="other">other</option>
		</select>
		
		<label for="DOB" class ="lable1">Date of Birth</label>
		<input type="date" class="box1" name ="dob"placeholder="enter Date of Birth" style=" width:200px ; margin-right:200px">

		<label for="Address" class ="lable1">Address</label>
		<input type="text" class="box1"  name ="address"placeholder="enter Address" >

		<label for="teleno" class ="lable1">Mobile number</label>
		<input type="text" class="box1" name="mobileno" placeholder="enter mobile number" pattern="[0-9]{10}|[+][0-9]{11}" style=" width:200px ; margin-right:200px">

		<label for="teleno" class ="lable1">Email</label>
		<input type="text" class="box1" name="email" placeholder="Enter Email" pattern="[a-z0-9.@[a-z0-9._]+\.[a-z]{2,3}"style=" width:200px ; margin-right:200px">
		
		<label for="medium" class ="lable1">Medium</label>
		<select class="box1" name="medium"style=" width:200px ; margin-right:200px">
			<option value="English">English</option>
			<option value="Sinhala">Sinhala</option>
			<option value="Tamil">Tamil</option>
		</select>

	

		<input type="submit" name ="submit" value="Submit" class="submit">
  </form>
</div>
			







  <!-- Portfolio Section -->
  <div class="w3-padding-64 w3-content" id="photos">
    <h2 class="w3-text-light-grey">Gallery</h2>
    <hr style="width:200px" class="w3-opacity">

    <!-- Grid for photos -->
    <div class="w3-row-padding" style="margin:0 -16px">
      <div class="w3-half">
        <img src="C:/javaproject/Schoolwebpage/src/main/webapp/Images/2.jpg" style="width:50%" align="left">
        <img src="Images/3.jpg" style="width:50%" align="right">
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
