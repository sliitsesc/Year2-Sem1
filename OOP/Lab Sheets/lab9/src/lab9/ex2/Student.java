package lab9.ex2;

public class Student {
	private String studentID;
	private String name;
	private double gpa;
	
	public Student(String studentID, String name, double gpa) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.gpa = gpa;
	}

	
	
	public String getStudentID() {
		return studentID;
	}



	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
