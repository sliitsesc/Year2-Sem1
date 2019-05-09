/**
 * @author chamodshehanka on 5/9/2019
 * @project Demo
 **/
public class MScStudent extends Student {

    String specialization;

    public MScStudent(int studentID, String name, String specialization) {
        super(studentID, name);
        this.studentID = studentID;
        this.name = name;
        this.specialization = specialization;
    }

}
