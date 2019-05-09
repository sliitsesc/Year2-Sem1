import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/10/2019
 * @project Demo
 **/
public class Batch {
    String name;
    ArrayList<MScStudent> mscStudents;

    public Batch(String name) {
        this.name = name;
    }

    void append(MScStudent mScStudent){
        mscStudents.add(mScStudent);
    }

    void listStudents(){
        for (MScStudent mScStudent: mscStudents
             ) {
            System.out.println("Student ID : " + mScStudent.studentID);
            System.out.println("Student Name : " + mScStudent.name);
            System.out.println("Specialization : " + mScStudent.specialization);
            System.out.println();
        }
    }
}
