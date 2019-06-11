package question1;

public class ThreadMain extends Thread {

	public static void main(String[] args) {
		
		Thread printThread = new PrintThread();
		Thread sliitThread = new SLIITThread();
		
		printThread.start();
		sliitThread.start();

	}

}
