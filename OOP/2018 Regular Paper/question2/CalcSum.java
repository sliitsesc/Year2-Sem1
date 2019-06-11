package question2;

public class CalcSum implements Runnable {

	private int total;
	
	@Override
	public void run() {
		
		synchronized (this){
			for(int i = 0 ;i < 100000 ; i++) {
				total+=i;
			}
			
			System.out.println("Total : "+this.total+" Thread "+Thread.currentThread().getName());
		}
		}
		
	
	

}
