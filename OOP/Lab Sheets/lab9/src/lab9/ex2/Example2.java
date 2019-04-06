package lab9.ex2;

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter student ID : ");
			String id = scanner.next();
			
			System.out.print("Enter student Name : ");
			String name = scanner.next();
			
			System.out.print("Enter student GPA : ");
			double gpa = scanner.nextDouble();

			Student student = new Student(id,name,gpa);
			
			students.add(student);
		}
		
		for (Student student : students) {
			System.out.println("Student ID : " + student.getStudentID());
			System.out.println("Student Name : " + student.getName());
			System.out.println("Student GPA : " + student.getGpa() + "\n");
		}
	}
}
