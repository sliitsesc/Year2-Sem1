package question2;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
	
		Thread countDown = new CountDown();
		
		Thread calcSum1 = new Thread(new CalcSum());
		Thread calcSum2 = new Thread(new CalcSum());
		
		countDown.start();
		
		countDown.join();
		
		calcSum1.setName("Thread1");
		calcSum2.setName("Thread2");
		
		calcSum1.start();
		calcSum2.start();
		
	}

}
