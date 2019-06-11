package question1;

public class CalImpl extends Thread {

	private Calculation calculation;
	private int start;
	private int end;
	
	public CalImpl(Calculation c,int s,int e) {
		this.calculation = c;
		this.start = s;
		this.end = e;
	} 

	
	public void run() {
		synchronized (calculation) {
			calculation.sum(start, end);
		}
		
	}
}
