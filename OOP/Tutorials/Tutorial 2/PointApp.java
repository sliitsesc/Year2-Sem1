/**
 * @author chamodshehanka on 2/22/2019
 * @project Year2-Sem1
 **/
public class PointApp {
    public static void main(String[] args) {

        //Object declaration and initialization
        Point3D point3D1 = new Point3D(12,45,89);
        Point3D point3D2 = new Point3D(78,45,33);

        //method calling
        System.out.println("Point 1 distance : " + point3D1.distance());
        System.out.println("Point 2 distance : " + point3D2.distance());
    }
}
