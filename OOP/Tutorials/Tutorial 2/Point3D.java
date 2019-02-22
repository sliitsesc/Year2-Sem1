import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * @author chamodshehanka on 2/22/2019
 * @project Year2-Sem1
 **/
public class Point3D {

    //variable declaration
    private double x, y, z;

    //constructor initialization
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //calculate distance
    public double distance(){
        return sqrt(pow(x,2) + pow(y,2) + pow(z,2));
    }
}
