package question4;

public class MainApp {

	public static void main(String[] args) {
		
		CreditCard creditCard1 = CreditCard.getInstance();
		CreditCard creditCard2 = CreditCard.getInstance();
		
		System.out.println(creditCard1.validate("1234567891234567", 030));
		System.out.println(creditCard2.validate("135792476854712", 630));
		
		System.out.println(creditCard1.equals(creditCard2));

	}

}
