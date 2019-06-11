package question3;

public class MarksException extends Exception {

	private int marks;
	
	public MarksException(int marks) {
		
		this.marks=marks;
	
	}
	
	public int getMarks() {
		
		return marks;
		
	}
}
