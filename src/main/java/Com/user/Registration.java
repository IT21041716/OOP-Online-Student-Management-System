package Com.user;

public class Registration {
	private int ID;
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
	
	public Registration(int ID,String firstname,String secondname,String lastname,String surename,String gender,String DOB,String Address,String number,String email,String medium){
		this.ID=ID;
		this.firstname=firstname;
		this.secondname=secondname;
		this.lastname=lastname;
		this.surename=surename;
		this.gender=gender;
		this.DOB=DOB;
		this.Address=Address;
		this.number=number;
		this.email=email;
		this.medium=medium;
		
	}
	public int getID() {
		return ID;
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
	

}
