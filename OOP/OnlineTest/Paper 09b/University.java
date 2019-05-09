/**
 * @author chamodshehanka on 5/10/2019
 * @project Demo
 **/
public class University {
    public static void main(String[] args) {
        MScStudent mScStudent1 = new MScStudent(111,"Iron Man", "AI");
        MScStudent mScStudent2 = new MScStudent(222,"Thor", "Thunder");
        MScStudent mScStudent3 = new MScStudent(333, "Thanos", "Balance");

        Batch batch = new Batch("Avengers");
        batch.append(mScStudent1);
        batch.append(mScStudent2);
        batch.append(mScStudent3);

        batch.listStudents();
    }
}
