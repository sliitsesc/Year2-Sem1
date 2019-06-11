package question3;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		
		String ans = "yes";
		Scanner sc =  new Scanner(System.in);
		Scanner sc2 =  new Scanner(System.in);
		double amount;
		Account account = new Account(123);
		
		
		/* First Part Of The Question
		System.out.println("Depositing Rs.10,000");
		account.deposit(10000.0);
		
		try {
			System.out.println("Withdrawing Rs.6,000");
			account.withdraw(6000.0);
			
			System.out.println("Withdrawing Rs.8,000");
			account.withdraw(8000.0);
		}catch(InsuffientBalanceException e) {
			System.out.println("Sorry,your account remains only Rs." +e.getAmount());
			e.printStackTrace();
		}*/
		
		do {
		
			try {
				
					System.out.println("Depositing Rs.10,000");
					account.deposit(10000.0);
					
				do{
					System.out.print("Please enter amount to be withdrawn = ");
					amount = sc.nextDouble();
					account.withdraw(amount);
					account.display();
				}while(true);
				
			} 
			catch (InsuffientBalanceException e) {
				System.out.println("Sorry,your account remains only Rs." +e.getAmount());
				//e.printStackTrace();
			}
			finally {
				System.out.println("Do You Wish To Continue? yes/no");
				ans=sc2.nextLine();
			}
			
			}while(ans.equals("yes"));
	}
	
}
