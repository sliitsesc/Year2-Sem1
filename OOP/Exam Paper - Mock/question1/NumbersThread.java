package question1;

public class NumbersThread extends Thread{

	
	
	public void run() {
		synchronized (this) {
			for(int i = 0 ; i <=100 ; i++) {
				System.out.println(i +" " +this.getName());
			}
		}
		
	}

}
