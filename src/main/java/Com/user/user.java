package Com.user;

public class user {

		private int ID;
		private String name;
		private String email;
		private String phone;
		private String username;
		private String password;
		public user(int ID, String name, String email, String phone, String username, String password) {
			
			this.ID = ID;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.username = username;
			this.password = password;
		}
		public int getID() {
			return ID;
		}
		
		public String getName() {
			return name;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String getPhone() {
			return phone;
		}
	
		public String getUsername() {
			return username;
		}
		
		public String getpassword() {
			return password;
		}
		
	
		
}
