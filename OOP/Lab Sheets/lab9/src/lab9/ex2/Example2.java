package lab9.ex2;

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter student ID : ");
			String id = scanner.nextLine();
			
			System.out.print("Enter student Name : ");
			String name = scanner.nextLine();
			
			System.out.print("Enter student GPA : ");
			double gpa = scanner.nextDouble();

			Student student = new Student(id,name,gpa);
			
			students.add(student);
		}
	}
}
