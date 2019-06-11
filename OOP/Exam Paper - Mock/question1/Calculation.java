package question1;

public class Calculation {

	int total = 0;
	
	public void sum(int start,int end) {
		
		for(int i = start ; i <= end ; i++) {
			total+=i;
		}
	}
	
	public int getTotal() {
		
		return this.total;
	}
	
	
}
