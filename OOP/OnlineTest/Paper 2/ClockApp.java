/**
 * @author chamodshehanka on 5/10/2019
 * @project Demo
 **/
public class ClockApp {

    public static void main(String[] args) {
        NormalClock normalClock = new NormalClock(6,35,21,10,5);
        SportWatch sportWatch = new SportWatch(6,35,21,10,5);

        normalClock.showTime();
        sportWatch.showTime();
    }

}
