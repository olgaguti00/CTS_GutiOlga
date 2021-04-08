package ro.ase.csie.cts.g1093.dp.facade;

public class LogIn {
	String username;
	String pass;

	public LogIn(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	};

	public void logIn() {

	}

	public UserProfile getUserProfile() {
		return new UserProfile();

	}

}
