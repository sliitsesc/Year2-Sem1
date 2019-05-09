/**
 * @author chamodshehanka on 5/9/2019
 * @project Demo
 **/
public class Projector implements MyInterface {
    String model;
    String brand;
    float lampHours;

    public Projector(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public float getLampHours() {
        return lampHours;
    }

    public void setLampHours(float lampHours) {
        this.lampHours = lampHours;
    }
}
