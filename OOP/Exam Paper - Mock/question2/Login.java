package question2;

public class Login {

	private static Login login;

	private Login(){
	}
	
	public static Login getInstance() {
		if(login == null) {
			login = new Login();
			System.out.println("Login Object Created");
		}
		
		return login;
	}
	
	public boolean validateUser(String user,String password) {
		
		boolean result;
		
		if(user.equals(password)) {
			result = true;
		}
		else
			result = false;
		
		return result;
	}
	
	
}
