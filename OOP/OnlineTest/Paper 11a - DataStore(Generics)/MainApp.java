/**
 * @author chamodshehanka on 5/10/2019
 * @project Demo
 **/
public class MainApp {
    public static void main(String[] args) {
        GenericDataStore genericDataStore = new GenericDataStore(45, 70); //Stores 45 70
        System.out.println("val1 : " + genericDataStore.getVal1());
        genericDataStore.swap();
        System.out.println("val1 : " + genericDataStore.getVal1());

        genericDataStore.setVal1(3.45);
        genericDataStore.setVal2(7.2);
        System.out.println("val1 : " + genericDataStore.getVal1());
        genericDataStore.swap();
        System.out.println("val1 : " + genericDataStore.getVal1());

        genericDataStore.setVal1("SLIIT");
        genericDataStore.setVal2("Malabe");
        System.out.println("val1 : " + genericDataStore.getVal1());
        genericDataStore.swap();
        System.out.println("val1 : " + genericDataStore.getVal1());
    }
}
