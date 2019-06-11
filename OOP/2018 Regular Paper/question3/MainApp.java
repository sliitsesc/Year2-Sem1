package question3;

public class MainApp {

	public static void main(String[] args) {
		
		Student student = new Student(1, "DW");
		
		try {
			student.input();
		} catch (MarksException e) {
			System.out.println("Enter Valid Mark");
		}
		
		float average = student.getAverage();
		System.out.println("Average : "+average);
	}

}
