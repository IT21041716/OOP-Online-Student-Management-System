package Com.user;

public class student {
	
	private String SID;
	private String firstname;
	private String secondname;
	private String lastname;
	private String surename;
	private String gender;
	private String DOB;
	private String Address;
	private String number;
	private String email;
	private String medium;
	private String Username;
	private String password;
	
	
	public student(String SID, String firstname, String secondname, String lastname, String surename, String gender,
			String DOB, String Address, String number, String email, String medium) {
		
		this.SID = SID;
		this.firstname = firstname;
		this.secondname = secondname;
		this.lastname = lastname;
		this.surename = surename;
		this.gender = gender;
		this.DOB = DOB;
		this.Address = Address;
		this.number = number;
		this.email = email;
		this.medium = medium;
	}




	public String getSID() {
		return SID;
	}

	public String getFirstname() {
		return firstname;
	}



	public String getSecondname() {
		return secondname;
	}


	public String getLastname() {
		return lastname;
	}


	


	public String getSurename() {
		return surename;
	}


	

	public String getGender() {
		return gender;
	}


	


	public String getDOB() {
		return DOB;
	}


	


	public String getAddress() {
		return Address;
	}

	public String getNumber() {
		return number;
	}


	public String getEmail() {
		return email;
	}




	public String getMedium() {
		return medium;
	}

	public String getUsername() {
		return Username;
	}


	

	public String getPassword() {
		return password;
	}


	
	
	public static String generateusername(String fname , String sid) {
			
			String Username = fname+sid;
			
			return Username;
		}
		
	
	
	public static String generatepassword(String fname , String sid) {
			
		String Password ="ID"+fname+sid;
		return Password;
	}
	
	public static String fullname(String fname,String Sname,String lname) {
		
		String Fullname =fname+" "+Sname+" "+lname;
		return Fullname;
				
	}
	
	

}
