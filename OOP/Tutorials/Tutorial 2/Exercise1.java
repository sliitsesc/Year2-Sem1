import java.util.Scanner;

//Student class
class Student{

    //variable declaration
    private String studentId;
    private String studentName;
    private double studentAvg;

    private int mark1, mark2, mark3;

    //default constructor
    Student(){
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
    }

    //parameterized constructor
    public Student(String studentId, String studentName, int mark1, int mark2, int mark3) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    //calculate average mark
    public void calAverageMark(){
        this.studentAvg = (mark1 + mark2 + mark3)/3.0;
    }

    //display function
    public void displayDetails(){
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Average : " + studentAvg);
    }
}

class Exercise1{

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Input Student ID : ");
        student.setStudentId(scanner.nextLine());

        System.out.print("Input Student Name : ");
        student.setStudentName(scanner.nextLine());

        System.out.print("Input mark 1 : ");
        student.setMark1(scanner.nextInt());

        System.out.print("Input mark 2 : ");
        student.setMark2(scanner.nextInt());

        System.out.print("Input mark 3 : ");
        student.setMark3(scanner.nextInt());

        student.calAverageMark();
        student.displayDetails();
    }
}