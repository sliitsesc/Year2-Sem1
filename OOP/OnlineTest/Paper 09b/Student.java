import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author chamodshehanka on 5/9/2019
 * @project Demo
 **/
public class Student {
    int studentID;
    String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    void Input(){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Input Student ID : ");
            studentID = scanner.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }

        System.out.print("Input Student Name : ");
        name = scanner.next();

    }
}
