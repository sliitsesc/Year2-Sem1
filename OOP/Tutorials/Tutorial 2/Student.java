import java.util.Scanner;

public class Student{
    private String studentId;
    private String studentName;
    private double studentAvg;

    private int mark1, mark2, mark3;

    Student(){
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
    }

    private void getAverageMark(){
        this.studentAvg = (mark1 + mark2 + mark3)/3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input mark 1 : ")
    }
}