package question4;

public class CreditCard {

	private static CreditCard creditCard;
	
	public static CreditCard getInstance(){
		
		if(creditCard==null) {
			creditCard = new CreditCard();
		}
		
		return creditCard;
		
	}
	
	public boolean validate(String cardno,int code) {
	
		if(cardno.length()==16 && code%3 == 0) {
			return true;
		}
		else
			return false;
	}
}
