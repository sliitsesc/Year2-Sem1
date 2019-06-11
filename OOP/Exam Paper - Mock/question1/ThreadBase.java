package question1;

public class ThreadBase extends Thread {

	public static void main(String[] args) {
		
		Thread t1 = new NumbersThread();
		Thread t2 = new NumbersThread();
		Thread t3 = new NumbersThread();
		
		t1.setName("Red");
		t2.setName("Blue");
		t3.setName("Green");
		
		
		t1.start();
		t2.start();
		t3.start();
		
	
		
		for(int i = 0 ; i<=100 ; i++) {
			System.out.println("SLIIT");
		}
		
		System.out.println("Thread Red State - "+t1.getState()+" and Alive - "+t1.isAlive());
		
	
		
	}

}
