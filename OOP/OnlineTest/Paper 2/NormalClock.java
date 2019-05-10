/**
 * @author chamodshehanka on 5/10/2019
 * @project Demo
 **/
public class NormalClock extends Clock {

    int day;
    int month;

    public NormalClock(int hours, int minutes, int seconds, int day, int month) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.day = day;
        this.month = month;
    }


    void showTime() {
        System.out.println("Time : " + hours + ":" + minutes + ":" + seconds);
    }

    void displayDate(){
        System.out.println(month + "/" + day);
    }
}
