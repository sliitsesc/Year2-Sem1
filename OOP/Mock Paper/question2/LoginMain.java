package question2;

public class LoginMain {

	public static void main(String[] args) {
		
		Login login1 = Login.getInstance();
		Login login2 = Login.getInstance();
		
		login1.validateUser("Manju", "Manju");
		login2.validateUser("Manju", "Manju");
		System.out.println(login1.equals(login2));
	}

}
