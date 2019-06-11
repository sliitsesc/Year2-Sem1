package question1;

public class ParallelTest {

	public static void main(String[] args) {
		
		Calculation calc = new Calculation();
		
		Thread t1 = new CalImpl(calc, 1, 50000);
		Thread t2 = new CalImpl(calc,50001,100000);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total  = "+(calc.getTotal()));

	}

}
