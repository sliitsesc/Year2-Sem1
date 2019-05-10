/**
 * @author chamodshehanka on 5/10/2019
 * @project Demo
 **/
public class DataStore {
    int val1, val2;

    public DataStore(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public void swap(){
        int temp = val1;
        val1 = val2;
        val2 = temp;
    }
}
